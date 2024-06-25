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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCocinitaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ASCII", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[RECIPE]'", "'Ingredientes:'", "'Procedimiento:'", "'[-o]'", "'[cU]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ASCII=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCocinitaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCocinitaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCocinitaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCocinita.g"; }



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




    // $ANTLR start "entryRuleCocina"
    // InternalCocinita.g:64:1: entryRuleCocina returns [EObject current=null] : iv_ruleCocina= ruleCocina EOF ;
    public final EObject entryRuleCocina() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCocina = null;


        try {
            // InternalCocinita.g:64:47: (iv_ruleCocina= ruleCocina EOF )
            // InternalCocinita.g:65:2: iv_ruleCocina= ruleCocina EOF
            {
             newCompositeNode(grammarAccess.getCocinaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCocina=ruleCocina();

            state._fsp--;

             current =iv_ruleCocina; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCocina"


    // $ANTLR start "ruleCocina"
    // InternalCocinita.g:71:1: ruleCocina returns [EObject current=null] : (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )* otherlv_4= 'Procedimiento:' ) ;
    public final EObject ruleCocina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Ingrediente_3_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:77:2: ( (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )* otherlv_4= 'Procedimiento:' ) )
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )* otherlv_4= 'Procedimiento:' )
            {
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )* otherlv_4= 'Procedimiento:' )
            // InternalCocinita.g:79:3: otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )* otherlv_4= 'Procedimiento:'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCocinaAccess().getRECIPEKeyword_0());
            		
            // InternalCocinita.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCocinita.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCocinita.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalCocinita.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCocinaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"upb.edu.lp.Cocinita.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCocinaAccess().getIngredientesKeyword_2());
            		
            // InternalCocinita.g:105:3: ( (lv_Ingrediente_3_0= ruleListaIngredientes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ASCII) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCocinita.g:106:4: (lv_Ingrediente_3_0= ruleListaIngredientes )
            	    {
            	    // InternalCocinita.g:106:4: (lv_Ingrediente_3_0= ruleListaIngredientes )
            	    // InternalCocinita.g:107:5: lv_Ingrediente_3_0= ruleListaIngredientes
            	    {

            	    					newCompositeNode(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_Ingrediente_3_0=ruleListaIngredientes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCocinaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Ingrediente",
            	    						lv_Ingrediente_3_0,
            	    						"upb.edu.lp.Cocinita.ListaIngredientes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCocinaAccess().getProcedimientoKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCocina"


    // $ANTLR start "entryRuleListaIngredientes"
    // InternalCocinita.g:132:1: entryRuleListaIngredientes returns [EObject current=null] : iv_ruleListaIngredientes= ruleListaIngredientes EOF ;
    public final EObject entryRuleListaIngredientes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaIngredientes = null;


        try {
            // InternalCocinita.g:132:58: (iv_ruleListaIngredientes= ruleListaIngredientes EOF )
            // InternalCocinita.g:133:2: iv_ruleListaIngredientes= ruleListaIngredientes EOF
            {
             newCompositeNode(grammarAccess.getListaIngredientesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaIngredientes=ruleListaIngredientes();

            state._fsp--;

             current =iv_ruleListaIngredientes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListaIngredientes"


    // $ANTLR start "ruleListaIngredientes"
    // InternalCocinita.g:139:1: ruleListaIngredientes returns [EObject current=null] : ( ( (lv_ascii_0_0= RULE_ASCII ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleListaIngredientes() throws RecognitionException {
        EObject current = null;

        Token lv_ascii_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:145:2: ( ( ( (lv_ascii_0_0= RULE_ASCII ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalCocinita.g:146:2: ( ( (lv_ascii_0_0= RULE_ASCII ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalCocinita.g:146:2: ( ( (lv_ascii_0_0= RULE_ASCII ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalCocinita.g:147:3: ( (lv_ascii_0_0= RULE_ASCII ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalCocinita.g:147:3: ( (lv_ascii_0_0= RULE_ASCII ) )
            // InternalCocinita.g:148:4: (lv_ascii_0_0= RULE_ASCII )
            {
            // InternalCocinita.g:148:4: (lv_ascii_0_0= RULE_ASCII )
            // InternalCocinita.g:149:5: lv_ascii_0_0= RULE_ASCII
            {
            lv_ascii_0_0=(Token)match(input,RULE_ASCII,FOLLOW_6); 

            					newLeafNode(lv_ascii_0_0, grammarAccess.getListaIngredientesAccess().getAsciiASCIITerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListaIngredientesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ascii",
            						lv_ascii_0_0,
            						"upb.edu.lp.Cocinita.ASCII");
            				

            }


            }

            // InternalCocinita.g:165:3: ( (lv_tipo_1_0= ruleTipoVariable ) )
            // InternalCocinita.g:166:4: (lv_tipo_1_0= ruleTipoVariable )
            {
            // InternalCocinita.g:166:4: (lv_tipo_1_0= ruleTipoVariable )
            // InternalCocinita.g:167:5: lv_tipo_1_0= ruleTipoVariable
            {

            					newCompositeNode(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_tipo_1_0=ruleTipoVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListaIngredientesRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_1_0,
            						"upb.edu.lp.Cocinita.TipoVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCocinita.g:184:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCocinita.g:185:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCocinita.g:185:4: (lv_name_2_0= RULE_ID )
            // InternalCocinita.g:186:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListaIngredientesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"upb.edu.lp.Cocinita.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListaIngredientes"


    // $ANTLR start "entryRuleTipoVariable"
    // InternalCocinita.g:206:1: entryRuleTipoVariable returns [EObject current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final EObject entryRuleTipoVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoVariable = null;


        try {
            // InternalCocinita.g:206:53: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // InternalCocinita.g:207:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoVariable"


    // $ANTLR start "ruleTipoVariable"
    // InternalCocinita.g:213:1: ruleTipoVariable returns [EObject current=null] : ( ( (lv_INT_0_0= '[-o]' ) ) | ( (lv_String_1_0= '[cU]' ) ) ) ;
    public final EObject ruleTipoVariable() throws RecognitionException {
        EObject current = null;

        Token lv_INT_0_0=null;
        Token lv_String_1_0=null;


        	enterRule();

        try {
            // InternalCocinita.g:219:2: ( ( ( (lv_INT_0_0= '[-o]' ) ) | ( (lv_String_1_0= '[cU]' ) ) ) )
            // InternalCocinita.g:220:2: ( ( (lv_INT_0_0= '[-o]' ) ) | ( (lv_String_1_0= '[cU]' ) ) )
            {
            // InternalCocinita.g:220:2: ( ( (lv_INT_0_0= '[-o]' ) ) | ( (lv_String_1_0= '[cU]' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCocinita.g:221:3: ( (lv_INT_0_0= '[-o]' ) )
                    {
                    // InternalCocinita.g:221:3: ( (lv_INT_0_0= '[-o]' ) )
                    // InternalCocinita.g:222:4: (lv_INT_0_0= '[-o]' )
                    {
                    // InternalCocinita.g:222:4: (lv_INT_0_0= '[-o]' )
                    // InternalCocinita.g:223:5: lv_INT_0_0= '[-o]'
                    {
                    lv_INT_0_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_INT_0_0, grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTipoVariableRule());
                    					}
                    					setWithLastConsumed(current, "INT", lv_INT_0_0, "[-o]");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:236:3: ( (lv_String_1_0= '[cU]' ) )
                    {
                    // InternalCocinita.g:236:3: ( (lv_String_1_0= '[cU]' ) )
                    // InternalCocinita.g:237:4: (lv_String_1_0= '[cU]' )
                    {
                    // InternalCocinita.g:237:4: (lv_String_1_0= '[cU]' )
                    // InternalCocinita.g:238:5: lv_String_1_0= '[cU]'
                    {
                    lv_String_1_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_String_1_0, grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTipoVariableRule());
                    					}
                    					setWithLastConsumed(current, "String", lv_String_1_0, "[cU]");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});

}