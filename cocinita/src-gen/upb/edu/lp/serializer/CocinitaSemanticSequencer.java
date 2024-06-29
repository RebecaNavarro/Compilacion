/*
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import upb.edu.lp.cocinita.Bowl;
import upb.edu.lp.cocinita.Cocina;
import upb.edu.lp.cocinita.CocinitaPackage;
import upb.edu.lp.cocinita.Expresion;
import upb.edu.lp.cocinita.Ingrediente;
import upb.edu.lp.cocinita.Instruccion;
import upb.edu.lp.services.CocinitaGrammarAccess;

@SuppressWarnings("all")
public class CocinitaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CocinitaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CocinitaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CocinitaPackage.BOWL:
				sequence_Bowl(context, (Bowl) semanticObject); 
				return; 
			case CocinitaPackage.COCINA:
				sequence_Cocina(context, (Cocina) semanticObject); 
				return; 
			case CocinitaPackage.EXPRESION:
				sequence_Expresion(context, (Expresion) semanticObject); 
				return; 
			case CocinitaPackage.INGREDIENTE:
				sequence_Ingrediente(context, (Ingrediente) semanticObject); 
				return; 
			case CocinitaPackage.INSTRUCCION:
				sequence_Instruccion(context, (Instruccion) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Bowl returns Bowl
	 *
	 * Constraint:
	 *     numero=INT
	 * </pre>
	 */
	protected void sequence_Bowl(ISerializationContext context, Bowl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.BOWL__NUMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.BOWL__NUMERO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBowlAccess().getNumeroINTTerminalRuleCall_1_0(), semanticObject.getNumero());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cocina returns Cocina
	 *
	 * Constraint:
	 *     (name=ID listaIngredientes+=Ingrediente* nBowl=INT listaInstrucciones+=Instruccion* bowl=Bowl*)
	 * </pre>
	 */
	protected void sequence_Cocina(ISerializationContext context, Cocina semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expresion returns Expresion
	 *
	 * Constraint:
	 *     (ingrediente=[Ingrediente|ID] | bowl=Bowl)
	 * </pre>
	 */
	protected void sequence_Expresion(ISerializationContext context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ingrediente returns Ingrediente
	 *
	 * Constraint:
	 *     (ascii=INT tipo=TipoVariable name=ID)
	 * </pre>
	 */
	protected void sequence_Ingrediente(ISerializationContext context, Ingrediente semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.INGREDIENTE__ASCII) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.INGREDIENTE__ASCII));
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.INGREDIENTE__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.INGREDIENTE__TIPO));
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.INGREDIENTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.INGREDIENTE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIngredienteAccess().getAsciiINTTerminalRuleCall_0_0(), semanticObject.getAscii());
		feeder.accept(grammarAccess.getIngredienteAccess().getTipoTipoVariableParserRuleCall_1_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instruccion returns Instruccion
	 *
	 * Constraint:
	 *     (
	 *         (exp=Expresion bowl=Bowl) | 
	 *         (exp=Expresion bowl=Bowl) | 
	 *         (exp=Expresion bowl=Bowl) | 
	 *         (exp=Expresion bowl=Bowl) | 
	 *         (exp=Expresion bowl=Bowl) | 
	 *         (exp=Expresion bowl=Bowl) | 
	 *         bowl=Bowl
	 *     )
	 * </pre>
	 */
	protected void sequence_Instruccion(ISerializationContext context, Instruccion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
