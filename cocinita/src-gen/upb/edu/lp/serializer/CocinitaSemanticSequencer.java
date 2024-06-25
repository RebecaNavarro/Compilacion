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
import upb.edu.lp.cocinita.Cocina;
import upb.edu.lp.cocinita.CocinitaPackage;
import upb.edu.lp.cocinita.ListaIngredientes;
import upb.edu.lp.cocinita.TipoVariable;
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
			case CocinitaPackage.COCINA:
				sequence_Cocina(context, (Cocina) semanticObject); 
				return; 
			case CocinitaPackage.LISTA_INGREDIENTES:
				sequence_ListaIngredientes(context, (ListaIngredientes) semanticObject); 
				return; 
			case CocinitaPackage.TIPO_VARIABLE:
				sequence_TipoVariable(context, (TipoVariable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cocina returns Cocina
	 *
	 * Constraint:
	 *     (name=ID Ingrediente+=ListaIngredientes*)
	 * </pre>
	 */
	protected void sequence_Cocina(ISerializationContext context, Cocina semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ListaIngredientes returns ListaIngredientes
	 *
	 * Constraint:
	 *     (tipo=TipoVariable name=ID)
	 * </pre>
	 */
	protected void sequence_ListaIngredientes(ISerializationContext context, ListaIngredientes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.LISTA_INGREDIENTES__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.LISTA_INGREDIENTES__TIPO));
			if (transientValues.isValueTransient(semanticObject, CocinitaPackage.Literals.LISTA_INGREDIENTES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CocinitaPackage.Literals.LISTA_INGREDIENTES__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0(), semanticObject.getTipo());
		feeder.accept(grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TipoVariable returns TipoVariable
	 *
	 * Constraint:
	 *     (INT='[-o]' | String='[cU]' | Double='[-O]')
	 * </pre>
	 */
	protected void sequence_TipoVariable(ISerializationContext context, TipoVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}