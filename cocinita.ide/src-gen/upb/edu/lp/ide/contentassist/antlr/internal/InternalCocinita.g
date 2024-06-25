/*
 * generated by Xtext 2.35.0
 */
grammar InternalCocinita;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package upb.edu.lp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package upb.edu.lp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import upb.edu.lp.services.CocinitaGrammarAccess;

}
@parser::members {
	private CocinitaGrammarAccess grammarAccess;

	public void setGrammarAccess(CocinitaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleCocina
entryRuleCocina
:
{ before(grammarAccess.getCocinaRule()); }
	 ruleCocina
{ after(grammarAccess.getCocinaRule()); } 
	 EOF 
;

// Rule Cocina
ruleCocina 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCocinaAccess().getGroup()); }
		(rule__Cocina__Group__0)
		{ after(grammarAccess.getCocinaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleListaIngredientes
entryRuleListaIngredientes
:
{ before(grammarAccess.getListaIngredientesRule()); }
	 ruleListaIngredientes
{ after(grammarAccess.getListaIngredientesRule()); } 
	 EOF 
;

// Rule ListaIngredientes
ruleListaIngredientes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListaIngredientesAccess().getGroup()); }
		(rule__ListaIngredientes__Group__0)
		{ after(grammarAccess.getListaIngredientesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTipoVariable
entryRuleTipoVariable
:
{ before(grammarAccess.getTipoVariableRule()); }
	 ruleTipoVariable
{ after(grammarAccess.getTipoVariableRule()); } 
	 EOF 
;

// Rule TipoVariable
ruleTipoVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTipoVariableAccess().getAlternatives()); }
		(rule__TipoVariable__Alternatives)
		{ after(grammarAccess.getTipoVariableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoVariable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoVariableAccess().getINTAssignment_0()); }
		(rule__TipoVariable__INTAssignment_0)
		{ after(grammarAccess.getTipoVariableAccess().getINTAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getTipoVariableAccess().getStringAssignment_1()); }
		(rule__TipoVariable__StringAssignment_1)
		{ after(grammarAccess.getTipoVariableAccess().getStringAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cocina__Group__0__Impl
	rule__Cocina__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCocinaAccess().getRECIPEKeyword_0()); }
	'[RECIPE]'
	{ after(grammarAccess.getCocinaAccess().getRECIPEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cocina__Group__1__Impl
	rule__Cocina__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCocinaAccess().getNameAssignment_1()); }
	(rule__Cocina__NameAssignment_1)
	{ after(grammarAccess.getCocinaAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cocina__Group__2__Impl
	rule__Cocina__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCocinaAccess().getIngredientesKeyword_2()); }
	'Ingredientes:'
	{ after(grammarAccess.getCocinaAccess().getIngredientesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cocina__Group__3__Impl
	rule__Cocina__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCocinaAccess().getIngredienteAssignment_3()); }
	(rule__Cocina__IngredienteAssignment_3)*
	{ after(grammarAccess.getCocinaAccess().getIngredienteAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cocina__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCocinaAccess().getProcedimientoKeyword_4()); }
	'Procedimiento:'
	{ after(grammarAccess.getCocinaAccess().getProcedimientoKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ListaIngredientes__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListaIngredientes__Group__0__Impl
	rule__ListaIngredientes__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListaIngredientesAccess().getAsciiAssignment_0()); }
	(rule__ListaIngredientes__AsciiAssignment_0)
	{ after(grammarAccess.getListaIngredientesAccess().getAsciiAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListaIngredientes__Group__1__Impl
	rule__ListaIngredientes__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListaIngredientesAccess().getTipoAssignment_1()); }
	(rule__ListaIngredientes__TipoAssignment_1)
	{ after(grammarAccess.getListaIngredientesAccess().getTipoAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ListaIngredientes__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListaIngredientesAccess().getNameAssignment_2()); }
	(rule__ListaIngredientes__NameAssignment_2)
	{ after(grammarAccess.getListaIngredientesAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cocina__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cocina__IngredienteAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0()); }
		ruleListaIngredientes
		{ after(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__AsciiAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListaIngredientesAccess().getAsciiASCIITerminalRuleCall_0_0()); }
		RULE_ASCII
		{ after(grammarAccess.getListaIngredientesAccess().getAsciiASCIITerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__TipoAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0()); }
		ruleTipoVariable
		{ after(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ListaIngredientes__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoVariable__INTAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); }
		(
			{ before(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); }
			'[-o]'
			{ after(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); }
		)
		{ after(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TipoVariable__StringAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); }
		(
			{ before(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); }
			'[cU]'
			{ after(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); }
		)
		{ after(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ASCII : ('0'..'9')+;

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
