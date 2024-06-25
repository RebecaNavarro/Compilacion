/*
 * generated by Xtext 2.35.0
 */
grammar InternalCocinita;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package upb.edu.lp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package upb.edu.lp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import upb.edu.lp.services.CocinitaGrammarAccess;

}

@parser::members {

 	private CocinitaGrammarAccess grammarAccess;

    public InternalCocinitaParser(TokenStream input, CocinitaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Cocina";
   	}

   	@Override
   	protected CocinitaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCocina
entryRuleCocina returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCocinaRule()); }
	iv_ruleCocina=ruleCocina
	{ $current=$iv_ruleCocina.current; }
	EOF;

// Rule Cocina
ruleCocina returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[RECIPE]'
		{
			newLeafNode(otherlv_0, grammarAccess.getCocinaAccess().getRECIPEKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCocinaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"upb.edu.lp.Cocinita.ID");
				}
			)
		)
		otherlv_2='Ingredientes:'
		{
			newLeafNode(otherlv_2, grammarAccess.getCocinaAccess().getIngredientesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0());
				}
				lv_Ingrediente_3_0=ruleListaIngredientes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCocinaRule());
					}
					add(
						$current,
						"Ingrediente",
						lv_Ingrediente_3_0,
						"upb.edu.lp.Cocinita.ListaIngredientes");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='Procedimiento:'
		{
			newLeafNode(otherlv_4, grammarAccess.getCocinaAccess().getProcedimientoKeyword_4());
		}
	)
;

// Entry rule entryRuleListaIngredientes
entryRuleListaIngredientes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListaIngredientesRule()); }
	iv_ruleListaIngredientes=ruleListaIngredientes
	{ $current=$iv_ruleListaIngredientes.current; }
	EOF;

// Rule ListaIngredientes
ruleListaIngredientes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ASCII_0=RULE_ASCII
		{
			newLeafNode(this_ASCII_0, grammarAccess.getListaIngredientesAccess().getASCIITerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0());
				}
				lv_tipo_1_0=ruleTipoVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListaIngredientesRule());
					}
					set(
						$current,
						"tipo",
						lv_tipo_1_0,
						"upb.edu.lp.Cocinita.TipoVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListaIngredientesRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"upb.edu.lp.Cocinita.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTipoVariable
entryRuleTipoVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTipoVariableRule()); }
	iv_ruleTipoVariable=ruleTipoVariable
	{ $current=$iv_ruleTipoVariable.current; }
	EOF;

// Rule TipoVariable
ruleTipoVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_INT_0_0='[-o]'
				{
					newLeafNode(lv_INT_0_0, grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTipoVariableRule());
					}
					setWithLastConsumed($current, "INT", lv_INT_0_0, "[-o]");
				}
			)
		)
		    |
		(
			(
				lv_String_1_0='[cU]'
				{
					newLeafNode(lv_String_1_0, grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTipoVariableRule());
					}
					setWithLastConsumed($current, "String", lv_String_1_0, "[cU]");
				}
			)
		)
		    |
		(
			(
				lv_Double_2_0='[-O]'
				{
					newLeafNode(lv_Double_2_0, grammarAccess.getTipoVariableAccess().getDoubleOKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTipoVariableRule());
					}
					setWithLastConsumed($current, "Double", lv_Double_2_0, "[-O]");
				}
			)
		)
	)
;

RULE_ASCII : ('0'..'9')+;

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
