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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[RECIPE]'", "'Ingredientes:'", "'Procedimiento:'", "'[-o]'", "'[cU]'", "'[-O]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalCocinita.g:71:1: ruleCocina returns [EObject current=null] : (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Procedimiento:' ) ;
    public final EObject ruleCocina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ListaIngredientes_3_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:77:2: ( (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Procedimiento:' ) )
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Procedimiento:' )
            {
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Procedimiento:' )
            // InternalCocinita.g:79:3: otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Procedimiento:'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

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
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCocinaAccess().getIngredientesKeyword_2());
            		
            // InternalCocinita.g:105:3: ( (lv_ListaIngredientes_3_0= ruleIngrediente ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCocinita.g:106:4: (lv_ListaIngredientes_3_0= ruleIngrediente )
            	    {
            	    // InternalCocinita.g:106:4: (lv_ListaIngredientes_3_0= ruleIngrediente )
            	    // InternalCocinita.g:107:5: lv_ListaIngredientes_3_0= ruleIngrediente
            	    {

            	    					newCompositeNode(grammarAccess.getCocinaAccess().getListaIngredientesIngredienteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ListaIngredientes_3_0=ruleIngrediente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCocinaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ListaIngredientes",
            	    						lv_ListaIngredientes_3_0,
            	    						"upb.edu.lp.Cocinita.Ingrediente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleIngrediente"
    // InternalCocinita.g:132:1: entryRuleIngrediente returns [EObject current=null] : iv_ruleIngrediente= ruleIngrediente EOF ;
    public final EObject entryRuleIngrediente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngrediente = null;


        try {
            // InternalCocinita.g:132:52: (iv_ruleIngrediente= ruleIngrediente EOF )
            // InternalCocinita.g:133:2: iv_ruleIngrediente= ruleIngrediente EOF
            {
             newCompositeNode(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngrediente=ruleIngrediente();

            state._fsp--;

             current =iv_ruleIngrediente; 
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
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalCocinita.g:139:1: ruleIngrediente returns [EObject current=null] : ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIngrediente() throws RecognitionException {
        EObject current = null;

        Token lv_ascii_0_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:145:2: ( ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalCocinita.g:146:2: ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalCocinita.g:146:2: ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalCocinita.g:147:3: ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalCocinita.g:147:3: ( (lv_ascii_0_0= RULE_INT ) )
            // InternalCocinita.g:148:4: (lv_ascii_0_0= RULE_INT )
            {
            // InternalCocinita.g:148:4: (lv_ascii_0_0= RULE_INT )
            // InternalCocinita.g:149:5: lv_ascii_0_0= RULE_INT
            {
            lv_ascii_0_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_ascii_0_0, grammarAccess.getIngredienteAccess().getAsciiINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ascii",
            						lv_ascii_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCocinita.g:165:3: ( (lv_tipo_1_0= ruleTipoVariable ) )
            // InternalCocinita.g:166:4: (lv_tipo_1_0= ruleTipoVariable )
            {
            // InternalCocinita.g:166:4: (lv_tipo_1_0= ruleTipoVariable )
            // InternalCocinita.g:167:5: lv_tipo_1_0= ruleTipoVariable
            {

            					newCompositeNode(grammarAccess.getIngredienteAccess().getTipoTipoVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_tipo_1_0=ruleTipoVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredienteRule());
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

            					newLeafNode(lv_name_2_0, grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleIngrediente"


    // $ANTLR start "entryRuleTipoVariable"
    // InternalCocinita.g:206:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // InternalCocinita.g:206:52: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // InternalCocinita.g:207:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
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
    // InternalCocinita.g:213:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCocinita.g:219:2: ( (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' ) )
            // InternalCocinita.g:220:2: (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' )
            {
            // InternalCocinita.g:220:2: (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCocinita.g:221:3: kw= '[-o]'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariableAccess().getOKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCocinita.g:227:3: kw= '[cU]'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCUKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCocinita.g:233:3: kw= '[-O]'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariableAccess().getOKeyword_2());
                    		

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});

}