package upb.edu.lp.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import upb.edu.lp.cocinita.Cocina
import upb.edu.lp.cocinita.Ingrediente
import upb.edu.lp.cocinita.Instruccion
import upb.edu.lp.cocinita.Bowl


class CocinitaGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Iteramos sobre los contenidos del recurso para encontrar instancias de Cocina
        for (obj : resource.contents) {
            if (obj instanceof Cocina) {
                val cocina = obj as Cocina
                val tsCode = generateTypeScriptCode(cocina)
                val fileName = generateFileName(cocina.name)
                fsa.generateFile(fileName+".ts", tsCode)
            }
        }
    }

    private def String generateTypeScriptCode(Cocina cocina) {
        '''
        class Stack<T> {
            private items: T[] = [];
        
            // Agrega un elemento a la pila
            push(element: T) {
                this.items.push(element);
            }
        
            // Elimina y devuelve el último elemento de la pila
            pop(): T | undefined {
                return this.items.pop();
            }
        
            // Devuelve el último elemento de la pila sin eliminarlo
            peek(): T | undefined {
                return this.items[this.items.length - 1];
            }
        
            // Devuelve true si la pila está vacía
            isEmpty(): boolean {
                return this.items.length === 0;
            }
        
            // Devuelve el tamaño de la pila
            size(): number {
                return this.items.length;
            }
        
            // Vacía la pila
            clear() {
                this.items = [];
            }
        
            // Imprime todos los elementos de la pila
            print() {
                console.log(this.items.toString());
            }
        }
        class «capitalize(cocina.name)» {
            //Crear un array con los valores ASCII
            
            const asciiArray: { char: string }[] = [];
                        
            for (let i = 32; i <= 126; i++) {
                asciiArray.push({char: String.fromCharCode(i) });
            }

            public ingredients = {
                «cocina.listaIngredientes.map[ingrediente | 
               '''«ingrediente.name»: «ingrediente.ascii»'''
                ].join(",\n")»
            };
            
            for(i=0; 

            public execute() {
                «cocina.listaInstrucciones.map[instruccion | 
                    generateInstruction(instruccion)
                ].join("\n\t\t")»
            }
        }

        const recipe = new «capitalize(cocina.name)»();
        recipe.execute();
        '''
    }

    private def String generateInstruction(Instruccion instruccion) {
        val tsInstruction = new StringBuilder

        switch instruccion.eClass.name {
            case "Batir":{
                tsInstruction.append("const value1 = this.stack.pop();")
                tsInstruction.append("const value2 = this.stack.pop();")
                tsInstruction.append("this.stack.push(value1 + value2);")
            }
            case "Licuar":{
                tsInstruction.append("const value1 = this.stack.pop();")
                tsInstruction.append("const value2 = this.stack.pop();")
                tsInstruction.append("this.stack.push(value2 / value1);") // Dividir value2 por value1
            }
            case "Hornear":{
                tsInstruction.append("const value1 = this.stack.pop();")
                tsInstruction.append("const value2 = this.stack.pop();")
                tsInstruction.append("this.stack.push(value1 * value2);")
            }
            case "Refrigerar":{
                tsInstruction.append("const value1 = this.stack.pop();")
                tsInstruction.append("const value2 = this.stack.pop();")
                tsInstruction.append("this.stack.push(value2 - value1);") // Restar value1 de value2
            }
            case "Agregar":
               if (instruccion.exp != null) {
                    tsInstruction.append("this.stack.push(this.ingredients['${instruccion.ingrediente.name}']);")
                } else if (instruccion.exp != null) {
                    // Chequeamos si la expresión es un ingrediente o un bowl
                    if (instruccion.exp.ingrediente != null) {
                        tsInstruction.append("this.stack.push(this.ingredients['${instruccion.exp.ingrediente.name}']);")
                    } else if (instruccion.exp.bowl != null) {
                        tsInstruction.append("this.stack.push(this.stack[${instruccion.exp.bowl.numero - 1}]);")
                    }
               }
        }

        tsInstruction.toString
    }

    private def String getDefaultValueForType(String tipo) {
        switch tipo {
            case "[-o]":
                return "0" // Int
            case "[cU]":
                return "\"\"" // String
            case "[-O]":
                return "false" // Boolean
            default:
                return "null"
        }
    }

    // Función auxiliar para capitalizar nombres de clases
    private def String capitalize(String name) {
        if (name == null || name.isEmpty) return name
        return name.substring(0, 1).toUpperCase + name.substring(1)
    }

    // Función auxiliar para generar un nombre de archivo válido y único
    private def String generateFileName(String name) {
        // Normaliza el nombre eliminando caracteres inválidos para archivos y capitalizando
        val normalized = name.replaceAll("[^a-zA-Z0-9_\\-]", "").toLowerCase
        capitalize(normalized)
    }
 }