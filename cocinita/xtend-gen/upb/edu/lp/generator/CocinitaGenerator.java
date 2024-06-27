package upb.edu.lp.generator;

import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import upb.edu.lp.cocinita.Bowl;
import upb.edu.lp.cocinita.Cocina;
import upb.edu.lp.cocinita.Expresion;
import upb.edu.lp.cocinita.Ingrediente;
import upb.edu.lp.cocinita.Instruccion;

@SuppressWarnings("all")
public class CocinitaGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject obj : _contents) {
      if ((obj instanceof Cocina)) {
        final Cocina cocina = ((Cocina) obj);
        final String tsCode = this.generateTypeScriptCode(cocina);
        final String fileName = this.generateFileName(cocina.getName());
        fsa.generateFile((fileName + ".ts"), tsCode);
      }
    }
  }

  private String generateTypeScriptCode(final Cocina cocina) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _capitalize = this.capitalize(cocina.getName());
    _builder.append(_capitalize);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private stack: number[] = [];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ingredients = {");
    _builder.newLine();
    _builder.append("        ");
    final Function1<Ingrediente, String> _function = (Ingrediente ingrediente) -> {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name = ingrediente.getName();
      _builder_1.append(_name);
      _builder_1.append(": ");
      int _ascii = ingrediente.getAscii();
      _builder_1.append(_ascii);
      return _builder_1.toString();
    };
    String _join = IterableExtensions.join(ListExtensions.<Ingrediente, String>map(cocina.getListaIngredientes(), _function), ",\n\t\t");
    _builder.append(_join, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public execute() {");
    _builder.newLine();
    _builder.append("        ");
    final Function1<Instruccion, String> _function_1 = (Instruccion instruccion) -> {
      return this.generateInstruction(instruccion);
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<Instruccion, String>map(cocina.getListaInstrucciones(), _function_1), "\n\t\t");
    _builder.append(_join_1, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("const recipe = new ");
    String _capitalize_1 = this.capitalize(cocina.getName());
    _builder.append(_capitalize_1);
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("recipe.execute();");
    _builder.newLine();
    return _builder.toString();
  }

  private String generateInstruction(final Instruccion instruccion) {
    String _xblockexpression = null;
    {
      final StringBuilder tsInstruction = new StringBuilder();
      String _name = instruccion.eClass().getName();
      if (_name != null) {
        switch (_name) {
          case "Batir":
            tsInstruction.append("const value1 = this.stack.pop();");
            tsInstruction.append("const value2 = this.stack.pop();");
            tsInstruction.append("this.stack.push(value1 + value2);");
            break;
          case "Licuar":
            tsInstruction.append("const value1 = this.stack.pop();");
            tsInstruction.append("const value2 = this.stack.pop();");
            tsInstruction.append("this.stack.push(value2 / value1);");
            break;
          case "Hornear":
            tsInstruction.append("const value1 = this.stack.pop();");
            tsInstruction.append("const value2 = this.stack.pop();");
            tsInstruction.append("this.stack.push(value1 * value2);");
            break;
          case "Refrigerar":
            tsInstruction.append("const value1 = this.stack.pop();");
            tsInstruction.append("const value2 = this.stack.pop();");
            tsInstruction.append("this.stack.push(value2 - value1);");
            break;
          case "Agregar":
            Ingrediente _ingrediente = instruccion.getIngrediente();
            boolean _notEquals = (!Objects.equals(_ingrediente, null));
            if (_notEquals) {
              tsInstruction.append("this.stack.push(this.ingredients[\'${instruccion.ingrediente.name}\']);");
            } else {
              Expresion _exp = instruccion.getExp();
              boolean _notEquals_1 = (!Objects.equals(_exp, null));
              if (_notEquals_1) {
                Ingrediente _ingrediente_1 = instruccion.getExp().getIngrediente();
                boolean _notEquals_2 = (!Objects.equals(_ingrediente_1, null));
                if (_notEquals_2) {
                  tsInstruction.append("this.stack.push(this.ingredients[\'${instruccion.exp.ingrediente.name}\']);");
                } else {
                  Bowl _bowl = instruccion.getExp().getBowl();
                  boolean _notEquals_3 = (!Objects.equals(_bowl, null));
                  if (_notEquals_3) {
                    tsInstruction.append("this.stack.push(this.stack[${instruccion.exp.bowl.numero - 1}]);");
                  }
                }
              }
            }
            break;
        }
      }
      _xblockexpression = tsInstruction.toString();
    }
    return _xblockexpression;
  }

  private String getDefaultValueForType(final String tipo) {
    if (tipo != null) {
      switch (tipo) {
        case "[-o]":
          return "0";
        case "[cU]":
          return "\"\"";
        case "[-O]":
          return "false";
        default:
          return "null";
      }
    } else {
      return "null";
    }
  }

  private String capitalize(final String name) {
    if ((Objects.equals(name, null) || name.isEmpty())) {
      return name;
    }
    String _upperCase = name.substring(0, 1).toUpperCase();
    String _substring = name.substring(1);
    return (_upperCase + _substring);
  }

  private String generateFileName(final String name) {
    String _xblockexpression = null;
    {
      final String normalized = name.replaceAll("[^a-zA-Z0-9_\\-]", "").toLowerCase();
      _xblockexpression = this.capitalize(normalized);
    }
    return _xblockexpression;
  }
}
