/*
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CocinitaGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class CocinaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.Cocina");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRECIPEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cIngredientesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cListaIngredientesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cListaIngredientesIngredienteParserRuleCall_3_0 = (RuleCall)cListaIngredientesAssignment_3.eContents().get(0);
		private final Keyword cMaterialesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNBowlAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNBowlINTTerminalRuleCall_5_0 = (RuleCall)cNBowlAssignment_5.eContents().get(0);
		private final Keyword c_Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cProcedimientoKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cListaInstruccionesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cListaInstruccionesInstruccionParserRuleCall_8_0 = (RuleCall)cListaInstruccionesAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cServirKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cBowlAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cBowlBowlParserRuleCall_9_1_0 = (RuleCall)cBowlAssignment_9_1.eContents().get(0);
		private final Keyword cFullStopKeyword_9_2 = (Keyword)cGroup_9.eContents().get(2);
		
		//Cocina:
		//    '[RECIPE]' name=ID
		//    'Ingredientes:'
		//    listaIngredientes+=Ingrediente*
		//    'Materiales:'
		//    nBowl=INT '(_).'
		//    'Procedimiento:'
		//    listaInstrucciones+=Instruccion*
		//    ('Servir' bowl=Bowl '.')*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'[RECIPE]' name=ID
		//'Ingredientes:'
		//listaIngredientes+=Ingrediente*
		//'Materiales:'
		//nBowl=INT '(_).'
		//'Procedimiento:'
		//listaInstrucciones+=Instruccion*
		//('Servir' bowl=Bowl '.')*
		public Group getGroup() { return cGroup; }
		
		//'[RECIPE]'
		public Keyword getRECIPEKeyword_0() { return cRECIPEKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'Ingredientes:'
		public Keyword getIngredientesKeyword_2() { return cIngredientesKeyword_2; }
		
		//listaIngredientes+=Ingrediente*
		public Assignment getListaIngredientesAssignment_3() { return cListaIngredientesAssignment_3; }
		
		//Ingrediente
		public RuleCall getListaIngredientesIngredienteParserRuleCall_3_0() { return cListaIngredientesIngredienteParserRuleCall_3_0; }
		
		//'Materiales:'
		public Keyword getMaterialesKeyword_4() { return cMaterialesKeyword_4; }
		
		//nBowl=INT
		public Assignment getNBowlAssignment_5() { return cNBowlAssignment_5; }
		
		//INT
		public RuleCall getNBowlINTTerminalRuleCall_5_0() { return cNBowlINTTerminalRuleCall_5_0; }
		
		//'(_).'
		public Keyword get_Keyword_6() { return c_Keyword_6; }
		
		//'Procedimiento:'
		public Keyword getProcedimientoKeyword_7() { return cProcedimientoKeyword_7; }
		
		//listaInstrucciones+=Instruccion*
		public Assignment getListaInstruccionesAssignment_8() { return cListaInstruccionesAssignment_8; }
		
		//Instruccion
		public RuleCall getListaInstruccionesInstruccionParserRuleCall_8_0() { return cListaInstruccionesInstruccionParserRuleCall_8_0; }
		
		//('Servir' bowl=Bowl '.')*
		public Group getGroup_9() { return cGroup_9; }
		
		//'Servir'
		public Keyword getServirKeyword_9_0() { return cServirKeyword_9_0; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_9_1() { return cBowlAssignment_9_1; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_9_1_0() { return cBowlBowlParserRuleCall_9_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_9_2() { return cFullStopKeyword_9_2; }
	}
	public class IngredienteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.Ingrediente");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAsciiAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAsciiINTTerminalRuleCall_0_0 = (RuleCall)cAsciiAssignment_0.eContents().get(0);
		private final Assignment cTipoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTipoTipoVariableParserRuleCall_1_0 = (RuleCall)cTipoAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Ingrediente:
		//    ascii=INT tipo=TipoVariable name=ID '.'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ascii=INT tipo=TipoVariable name=ID '.'
		public Group getGroup() { return cGroup; }
		
		//ascii=INT
		public Assignment getAsciiAssignment_0() { return cAsciiAssignment_0; }
		
		//INT
		public RuleCall getAsciiINTTerminalRuleCall_0_0() { return cAsciiINTTerminalRuleCall_0_0; }
		
		//tipo=TipoVariable
		public Assignment getTipoAssignment_1() { return cTipoAssignment_1; }
		
		//TipoVariable
		public RuleCall getTipoTipoVariableParserRuleCall_1_0() { return cTipoTipoVariableParserRuleCall_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}
	public class TipoVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.TipoVariable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cOKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cCUKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cOKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//TipoVariable:
		//    '[-o]' | '[cU]' | '[-O]'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'[-o]' | '[cU]' | '[-O]'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'[-o]'
		public Keyword getOKeyword_0() { return cOKeyword_0; }
		
		//'[cU]'
		public Keyword getCUKeyword_1() { return cCUKeyword_1; }
		
		//'[-O]'
		public Keyword getOKeyword_2() { return cOKeyword_2; }
	}
	public class BowlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.Bowl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNumeroAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNumeroINTTerminalRuleCall_1_0 = (RuleCall)cNumeroAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Bowl:
		//    '(' numero=INT ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' numero=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//numero=INT
		public Assignment getNumeroAssignment_1() { return cNumeroAssignment_1; }
		
		//INT
		public RuleCall getNumeroINTTerminalRuleCall_1_0() { return cNumeroINTTerminalRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class ExpresionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.Expresion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIngredienteAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cIngredienteIngredienteCrossReference_0_0 = (CrossReference)cIngredienteAssignment_0.eContents().get(0);
		private final RuleCall cIngredienteIngredienteIDTerminalRuleCall_0_0_1 = (RuleCall)cIngredienteIngredienteCrossReference_0_0.eContents().get(1);
		private final Assignment cBowlAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBowlBowlParserRuleCall_1_0 = (RuleCall)cBowlAssignment_1.eContents().get(0);
		
		//Expresion:
		//    ingrediente=[Ingrediente] | bowl=Bowl
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ingrediente=[Ingrediente] | bowl=Bowl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ingrediente=[Ingrediente]
		public Assignment getIngredienteAssignment_0() { return cIngredienteAssignment_0; }
		
		//[Ingrediente]
		public CrossReference getIngredienteIngredienteCrossReference_0_0() { return cIngredienteIngredienteCrossReference_0_0; }
		
		//ID
		public RuleCall getIngredienteIngredienteIDTerminalRuleCall_0_0_1() { return cIngredienteIngredienteIDTerminalRuleCall_0_0_1; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_1() { return cBowlAssignment_1; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_1_0() { return cBowlBowlParserRuleCall_1_0; }
	}
	public class InstruccionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "upb.edu.lp.Cocinita.Instruccion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cBatirKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cExpAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_0_1_0 = (RuleCall)cExpAssignment_0_1.eContents().get(0);
		private final Keyword cEnKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Keyword cElKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cBowlAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_0_4_0 = (RuleCall)cBowlAssignment_0_4.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLicuarKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		private final Keyword cEnKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cElKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cBowlAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_1_4_0 = (RuleCall)cBowlAssignment_1_4.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cHornearKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExpAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_2_1_0 = (RuleCall)cExpAssignment_2_1.eContents().get(0);
		private final Keyword cEnKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cElKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cBowlAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_2_4_0 = (RuleCall)cBowlAssignment_2_4.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cRefrigerarKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExpAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_3_1_0 = (RuleCall)cExpAssignment_3_1.eContents().get(0);
		private final Keyword cEnKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cElKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cBowlAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_3_4_0 = (RuleCall)cBowlAssignment_3_4.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cAgregarKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cExpAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_4_1_0 = (RuleCall)cExpAssignment_4_1.eContents().get(0);
		private final Keyword cEnKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cElKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Assignment cBowlAssignment_4_4 = (Assignment)cGroup_4.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_4_4_0 = (RuleCall)cBowlAssignment_4_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cTamizarKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cExpAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cExpExpresionParserRuleCall_5_1_0 = (RuleCall)cExpAssignment_5_1.eContents().get(0);
		private final Keyword cEnKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Keyword cElKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Assignment cBowlAssignment_5_4 = (Assignment)cGroup_5.eContents().get(4);
		private final RuleCall cBowlBowlParserRuleCall_5_4_0 = (RuleCall)cBowlAssignment_5_4.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cVertirKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cBowlAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cBowlBowlParserRuleCall_6_1_0 = (RuleCall)cBowlAssignment_6_1.eContents().get(0);
		
		//Instruccion:
		//    'Batir' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Licuar' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Hornear' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Refrigerar' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Agregar' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Tamizar' exp=Expresion 'en' 'el' bowl=Bowl |
		//    'Vertir' bowl=Bowl
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Batir' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Licuar' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Hornear' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Refrigerar' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Agregar' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Tamizar' exp=Expresion 'en' 'el' bowl=Bowl |
		//'Vertir' bowl=Bowl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Batir' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_0() { return cGroup_0; }
		
		//'Batir'
		public Keyword getBatirKeyword_0_0() { return cBatirKeyword_0_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_0_1() { return cExpAssignment_0_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_0_1_0() { return cExpExpresionParserRuleCall_0_1_0; }
		
		//'en'
		public Keyword getEnKeyword_0_2() { return cEnKeyword_0_2; }
		
		//'el'
		public Keyword getElKeyword_0_3() { return cElKeyword_0_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_0_4() { return cBowlAssignment_0_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_0_4_0() { return cBowlBowlParserRuleCall_0_4_0; }
		
		//'Licuar' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_1() { return cGroup_1; }
		
		//'Licuar'
		public Keyword getLicuarKeyword_1_0() { return cLicuarKeyword_1_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_1_1_0() { return cExpExpresionParserRuleCall_1_1_0; }
		
		//'en'
		public Keyword getEnKeyword_1_2() { return cEnKeyword_1_2; }
		
		//'el'
		public Keyword getElKeyword_1_3() { return cElKeyword_1_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_1_4() { return cBowlAssignment_1_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_1_4_0() { return cBowlBowlParserRuleCall_1_4_0; }
		
		//'Hornear' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_2() { return cGroup_2; }
		
		//'Hornear'
		public Keyword getHornearKeyword_2_0() { return cHornearKeyword_2_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_2_1() { return cExpAssignment_2_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_2_1_0() { return cExpExpresionParserRuleCall_2_1_0; }
		
		//'en'
		public Keyword getEnKeyword_2_2() { return cEnKeyword_2_2; }
		
		//'el'
		public Keyword getElKeyword_2_3() { return cElKeyword_2_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_2_4() { return cBowlAssignment_2_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_2_4_0() { return cBowlBowlParserRuleCall_2_4_0; }
		
		//'Refrigerar' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_3() { return cGroup_3; }
		
		//'Refrigerar'
		public Keyword getRefrigerarKeyword_3_0() { return cRefrigerarKeyword_3_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_3_1() { return cExpAssignment_3_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_3_1_0() { return cExpExpresionParserRuleCall_3_1_0; }
		
		//'en'
		public Keyword getEnKeyword_3_2() { return cEnKeyword_3_2; }
		
		//'el'
		public Keyword getElKeyword_3_3() { return cElKeyword_3_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_3_4() { return cBowlAssignment_3_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_3_4_0() { return cBowlBowlParserRuleCall_3_4_0; }
		
		//'Agregar' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_4() { return cGroup_4; }
		
		//'Agregar'
		public Keyword getAgregarKeyword_4_0() { return cAgregarKeyword_4_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_4_1() { return cExpAssignment_4_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_4_1_0() { return cExpExpresionParserRuleCall_4_1_0; }
		
		//'en'
		public Keyword getEnKeyword_4_2() { return cEnKeyword_4_2; }
		
		//'el'
		public Keyword getElKeyword_4_3() { return cElKeyword_4_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_4_4() { return cBowlAssignment_4_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_4_4_0() { return cBowlBowlParserRuleCall_4_4_0; }
		
		//'Tamizar' exp=Expresion 'en' 'el' bowl=Bowl
		public Group getGroup_5() { return cGroup_5; }
		
		//'Tamizar'
		public Keyword getTamizarKeyword_5_0() { return cTamizarKeyword_5_0; }
		
		//exp=Expresion
		public Assignment getExpAssignment_5_1() { return cExpAssignment_5_1; }
		
		//Expresion
		public RuleCall getExpExpresionParserRuleCall_5_1_0() { return cExpExpresionParserRuleCall_5_1_0; }
		
		//'en'
		public Keyword getEnKeyword_5_2() { return cEnKeyword_5_2; }
		
		//'el'
		public Keyword getElKeyword_5_3() { return cElKeyword_5_3; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_5_4() { return cBowlAssignment_5_4; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_5_4_0() { return cBowlBowlParserRuleCall_5_4_0; }
		
		//'Vertir' bowl=Bowl
		public Group getGroup_6() { return cGroup_6; }
		
		//'Vertir'
		public Keyword getVertirKeyword_6_0() { return cVertirKeyword_6_0; }
		
		//bowl=Bowl
		public Assignment getBowlAssignment_6_1() { return cBowlAssignment_6_1; }
		
		//Bowl
		public RuleCall getBowlBowlParserRuleCall_6_1_0() { return cBowlBowlParserRuleCall_6_1_0; }
	}
	
	
	private final CocinaElements pCocina;
	private final IngredienteElements pIngrediente;
	private final TipoVariableElements pTipoVariable;
	private final BowlElements pBowl;
	private final ExpresionElements pExpresion;
	private final InstruccionElements pInstruccion;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CocinitaGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCocina = new CocinaElements();
		this.pIngrediente = new IngredienteElements();
		this.pTipoVariable = new TipoVariableElements();
		this.pBowl = new BowlElements();
		this.pExpresion = new ExpresionElements();
		this.pInstruccion = new InstruccionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("upb.edu.lp.Cocinita".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Cocina:
	//    '[RECIPE]' name=ID
	//    'Ingredientes:'
	//    listaIngredientes+=Ingrediente*
	//    'Materiales:'
	//    nBowl=INT '(_).'
	//    'Procedimiento:'
	//    listaInstrucciones+=Instruccion*
	//    ('Servir' bowl=Bowl '.')*
	//;
	public CocinaElements getCocinaAccess() {
		return pCocina;
	}
	
	public ParserRule getCocinaRule() {
		return getCocinaAccess().getRule();
	}
	
	//Ingrediente:
	//    ascii=INT tipo=TipoVariable name=ID '.'
	//;
	public IngredienteElements getIngredienteAccess() {
		return pIngrediente;
	}
	
	public ParserRule getIngredienteRule() {
		return getIngredienteAccess().getRule();
	}
	
	//TipoVariable:
	//    '[-o]' | '[cU]' | '[-O]'
	//;
	public TipoVariableElements getTipoVariableAccess() {
		return pTipoVariable;
	}
	
	public ParserRule getTipoVariableRule() {
		return getTipoVariableAccess().getRule();
	}
	
	//Bowl:
	//    '(' numero=INT ')'
	//;
	public BowlElements getBowlAccess() {
		return pBowl;
	}
	
	public ParserRule getBowlRule() {
		return getBowlAccess().getRule();
	}
	
	//Expresion:
	//    ingrediente=[Ingrediente] | bowl=Bowl
	//;
	public ExpresionElements getExpresionAccess() {
		return pExpresion;
	}
	
	public ParserRule getExpresionRule() {
		return getExpresionAccess().getRule();
	}
	
	//Instruccion:
	//    'Batir' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Licuar' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Hornear' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Refrigerar' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Agregar' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Tamizar' exp=Expresion 'en' 'el' bowl=Bowl |
	//    'Vertir' bowl=Bowl
	//;
	public InstruccionElements getInstruccionAccess() {
		return pInstruccion;
	}
	
	public ParserRule getInstruccionRule() {
		return getInstruccionAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
