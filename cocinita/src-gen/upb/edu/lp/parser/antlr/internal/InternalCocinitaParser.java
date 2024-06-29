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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[RECIPE]'", "'Ingredientes:'", "'Materiales:'", "'(_).'", "'Procedimiento:'", "'Servir'", "'.'", "'[-o]'", "'[cU]'", "'[-O]'", "'('", "')'", "'Batir'", "'en'", "'el'", "'Licuar'", "'Hornear'", "'Refrigerar'", "'Agregar'", "'Tamizar'", "'Vertir'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalCocinita.g:71:1: ruleCocina returns [EObject current=null] : (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_listaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Materiales:' ( (lv_nBowl_5_0= RULE_INT ) ) otherlv_6= '(_).' otherlv_7= 'Procedimiento:' ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )* (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )* ) ;
    public final EObject ruleCocina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_nBowl_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_listaIngredientes_3_0 = null;

        EObject lv_listaInstrucciones_8_0 = null;

        EObject lv_bowl_10_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:77:2: ( (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_listaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Materiales:' ( (lv_nBowl_5_0= RULE_INT ) ) otherlv_6= '(_).' otherlv_7= 'Procedimiento:' ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )* (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )* ) )
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_listaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Materiales:' ( (lv_nBowl_5_0= RULE_INT ) ) otherlv_6= '(_).' otherlv_7= 'Procedimiento:' ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )* (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )* )
            {
            // InternalCocinita.g:78:2: (otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_listaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Materiales:' ( (lv_nBowl_5_0= RULE_INT ) ) otherlv_6= '(_).' otherlv_7= 'Procedimiento:' ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )* (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )* )
            // InternalCocinita.g:79:3: otherlv_0= '[RECIPE]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Ingredientes:' ( (lv_listaIngredientes_3_0= ruleIngrediente ) )* otherlv_4= 'Materiales:' ( (lv_nBowl_5_0= RULE_INT ) ) otherlv_6= '(_).' otherlv_7= 'Procedimiento:' ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )* (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )*
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
            		
            // InternalCocinita.g:105:3: ( (lv_listaIngredientes_3_0= ruleIngrediente ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCocinita.g:106:4: (lv_listaIngredientes_3_0= ruleIngrediente )
            	    {
            	    // InternalCocinita.g:106:4: (lv_listaIngredientes_3_0= ruleIngrediente )
            	    // InternalCocinita.g:107:5: lv_listaIngredientes_3_0= ruleIngrediente
            	    {

            	    					newCompositeNode(grammarAccess.getCocinaAccess().getListaIngredientesIngredienteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_listaIngredientes_3_0=ruleIngrediente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCocinaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listaIngredientes",
            	    						lv_listaIngredientes_3_0,
            	    						"upb.edu.lp.Cocinita.Ingrediente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCocinaAccess().getMaterialesKeyword_4());
            		
            // InternalCocinita.g:128:3: ( (lv_nBowl_5_0= RULE_INT ) )
            // InternalCocinita.g:129:4: (lv_nBowl_5_0= RULE_INT )
            {
            // InternalCocinita.g:129:4: (lv_nBowl_5_0= RULE_INT )
            // InternalCocinita.g:130:5: lv_nBowl_5_0= RULE_INT
            {
            lv_nBowl_5_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_nBowl_5_0, grammarAccess.getCocinaAccess().getNBowlINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCocinaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nBowl",
            						lv_nBowl_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCocinaAccess().get_Keyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCocinaAccess().getProcedimientoKeyword_7());
            		
            // InternalCocinita.g:154:3: ( (lv_listaInstrucciones_8_0= ruleInstruccion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23||(LA2_0>=26 && LA2_0<=31)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCocinita.g:155:4: (lv_listaInstrucciones_8_0= ruleInstruccion )
            	    {
            	    // InternalCocinita.g:155:4: (lv_listaInstrucciones_8_0= ruleInstruccion )
            	    // InternalCocinita.g:156:5: lv_listaInstrucciones_8_0= ruleInstruccion
            	    {

            	    					newCompositeNode(grammarAccess.getCocinaAccess().getListaInstruccionesInstruccionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_listaInstrucciones_8_0=ruleInstruccion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCocinaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"listaInstrucciones",
            	    						lv_listaInstrucciones_8_0,
            	    						"upb.edu.lp.Cocinita.Instruccion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCocinita.g:173:3: (otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCocinita.g:174:4: otherlv_9= 'Servir' ( (lv_bowl_10_0= ruleBowl ) ) otherlv_11= '.'
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCocinaAccess().getServirKeyword_9_0());
            	    			
            	    // InternalCocinita.g:178:4: ( (lv_bowl_10_0= ruleBowl ) )
            	    // InternalCocinita.g:179:5: (lv_bowl_10_0= ruleBowl )
            	    {
            	    // InternalCocinita.g:179:5: (lv_bowl_10_0= ruleBowl )
            	    // InternalCocinita.g:180:6: lv_bowl_10_0= ruleBowl
            	    {

            	    						newCompositeNode(grammarAccess.getCocinaAccess().getBowlBowlParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_bowl_10_0=ruleBowl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCocinaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"bowl",
            	    							lv_bowl_10_0,
            	    							"upb.edu.lp.Cocinita.Bowl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCocinaAccess().getFullStopKeyword_9_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // InternalCocinita.g:206:1: entryRuleIngrediente returns [EObject current=null] : iv_ruleIngrediente= ruleIngrediente EOF ;
    public final EObject entryRuleIngrediente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngrediente = null;


        try {
            // InternalCocinita.g:206:52: (iv_ruleIngrediente= ruleIngrediente EOF )
            // InternalCocinita.g:207:2: iv_ruleIngrediente= ruleIngrediente EOF
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
    // InternalCocinita.g:213:1: ruleIngrediente returns [EObject current=null] : ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) ;
    public final EObject ruleIngrediente() throws RecognitionException {
        EObject current = null;

        Token lv_ascii_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_1_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:219:2: ( ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' ) )
            // InternalCocinita.g:220:2: ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            {
            // InternalCocinita.g:220:2: ( ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.' )
            // InternalCocinita.g:221:3: ( (lv_ascii_0_0= RULE_INT ) ) ( (lv_tipo_1_0= ruleTipoVariable ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.'
            {
            // InternalCocinita.g:221:3: ( (lv_ascii_0_0= RULE_INT ) )
            // InternalCocinita.g:222:4: (lv_ascii_0_0= RULE_INT )
            {
            // InternalCocinita.g:222:4: (lv_ascii_0_0= RULE_INT )
            // InternalCocinita.g:223:5: lv_ascii_0_0= RULE_INT
            {
            lv_ascii_0_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            // InternalCocinita.g:239:3: ( (lv_tipo_1_0= ruleTipoVariable ) )
            // InternalCocinita.g:240:4: (lv_tipo_1_0= ruleTipoVariable )
            {
            // InternalCocinita.g:240:4: (lv_tipo_1_0= ruleTipoVariable )
            // InternalCocinita.g:241:5: lv_tipo_1_0= ruleTipoVariable
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

            // InternalCocinita.g:258:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCocinita.g:259:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCocinita.g:259:4: (lv_name_2_0= RULE_ID )
            // InternalCocinita.g:260:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIngredienteAccess().getFullStopKeyword_3());
            		

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
    // InternalCocinita.g:284:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // InternalCocinita.g:284:52: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // InternalCocinita.g:285:2: iv_ruleTipoVariable= ruleTipoVariable EOF
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
    // InternalCocinita.g:291:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCocinita.g:297:2: ( (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' ) )
            // InternalCocinita.g:298:2: (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' )
            {
            // InternalCocinita.g:298:2: (kw= '[-o]' | kw= '[cU]' | kw= '[-O]' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCocinita.g:299:3: kw= '[-o]'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariableAccess().getOKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCocinita.g:305:3: kw= '[cU]'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCUKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCocinita.g:311:3: kw= '[-O]'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBowl"
    // InternalCocinita.g:320:1: entryRuleBowl returns [EObject current=null] : iv_ruleBowl= ruleBowl EOF ;
    public final EObject entryRuleBowl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBowl = null;


        try {
            // InternalCocinita.g:320:45: (iv_ruleBowl= ruleBowl EOF )
            // InternalCocinita.g:321:2: iv_ruleBowl= ruleBowl EOF
            {
             newCompositeNode(grammarAccess.getBowlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBowl=ruleBowl();

            state._fsp--;

             current =iv_ruleBowl; 
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
    // $ANTLR end "entryRuleBowl"


    // $ANTLR start "ruleBowl"
    // InternalCocinita.g:327:1: ruleBowl returns [EObject current=null] : (otherlv_0= '(' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= ')' ) ;
    public final EObject ruleBowl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numero_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCocinita.g:333:2: ( (otherlv_0= '(' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= ')' ) )
            // InternalCocinita.g:334:2: (otherlv_0= '(' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= ')' )
            {
            // InternalCocinita.g:334:2: (otherlv_0= '(' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= ')' )
            // InternalCocinita.g:335:3: otherlv_0= '(' ( (lv_numero_1_0= RULE_INT ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBowlAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCocinita.g:339:3: ( (lv_numero_1_0= RULE_INT ) )
            // InternalCocinita.g:340:4: (lv_numero_1_0= RULE_INT )
            {
            // InternalCocinita.g:340:4: (lv_numero_1_0= RULE_INT )
            // InternalCocinita.g:341:5: lv_numero_1_0= RULE_INT
            {
            lv_numero_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_numero_1_0, grammarAccess.getBowlAccess().getNumeroINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBowlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numero",
            						lv_numero_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBowlAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleBowl"


    // $ANTLR start "entryRuleExpresion"
    // InternalCocinita.g:365:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalCocinita.g:365:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalCocinita.g:366:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalCocinita.g:372:1: ruleExpresion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_bowl_1_0= ruleBowl ) ) ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bowl_1_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:378:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_bowl_1_0= ruleBowl ) ) ) )
            // InternalCocinita.g:379:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_bowl_1_0= ruleBowl ) ) )
            {
            // InternalCocinita.g:379:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_bowl_1_0= ruleBowl ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCocinita.g:380:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalCocinita.g:380:3: ( (otherlv_0= RULE_ID ) )
                    // InternalCocinita.g:381:4: (otherlv_0= RULE_ID )
                    {
                    // InternalCocinita.g:381:4: (otherlv_0= RULE_ID )
                    // InternalCocinita.g:382:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getExpresionAccess().getIngredienteIngredienteCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:394:3: ( (lv_bowl_1_0= ruleBowl ) )
                    {
                    // InternalCocinita.g:394:3: ( (lv_bowl_1_0= ruleBowl ) )
                    // InternalCocinita.g:395:4: (lv_bowl_1_0= ruleBowl )
                    {
                    // InternalCocinita.g:395:4: (lv_bowl_1_0= ruleBowl )
                    // InternalCocinita.g:396:5: lv_bowl_1_0= ruleBowl
                    {

                    					newCompositeNode(grammarAccess.getExpresionAccess().getBowlBowlParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bowl_1_0=ruleBowl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRule());
                    					}
                    					set(
                    						current,
                    						"bowl",
                    						lv_bowl_1_0,
                    						"upb.edu.lp.Cocinita.Bowl");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleInstruccion"
    // InternalCocinita.g:417:1: entryRuleInstruccion returns [EObject current=null] : iv_ruleInstruccion= ruleInstruccion EOF ;
    public final EObject entryRuleInstruccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruccion = null;


        try {
            // InternalCocinita.g:417:52: (iv_ruleInstruccion= ruleInstruccion EOF )
            // InternalCocinita.g:418:2: iv_ruleInstruccion= ruleInstruccion EOF
            {
             newCompositeNode(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruccion=ruleInstruccion();

            state._fsp--;

             current =iv_ruleInstruccion; 
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
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalCocinita.g:424:1: ruleInstruccion returns [EObject current=null] : ( (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) ) | (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) ) | (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) ) | (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) ) | (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) ) | (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) ) | (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) ) ) ;
    public final EObject ruleInstruccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        EObject lv_exp_1_0 = null;

        EObject lv_bowl_4_0 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_bowl_9_0 = null;

        EObject lv_exp_11_0 = null;

        EObject lv_bowl_14_0 = null;

        EObject lv_exp_16_0 = null;

        EObject lv_bowl_19_0 = null;

        EObject lv_exp_21_0 = null;

        EObject lv_bowl_24_0 = null;

        EObject lv_exp_26_0 = null;

        EObject lv_bowl_29_0 = null;

        EObject lv_bowl_31_0 = null;



        	enterRule();

        try {
            // InternalCocinita.g:430:2: ( ( (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) ) | (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) ) | (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) ) | (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) ) | (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) ) | (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) ) | (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) ) ) )
            // InternalCocinita.g:431:2: ( (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) ) | (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) ) | (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) ) | (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) ) | (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) ) | (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) ) | (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) ) )
            {
            // InternalCocinita.g:431:2: ( (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) ) | (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) ) | (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) ) | (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) ) | (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) ) | (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) ) | (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 31:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCocinita.g:432:3: (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:432:3: (otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) ) )
                    // InternalCocinita.g:433:4: otherlv_0= 'Batir' ( (lv_exp_1_0= ruleExpresion ) ) otherlv_2= 'en' otherlv_3= 'el' ( (lv_bowl_4_0= ruleBowl ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getInstruccionAccess().getBatirKeyword_0_0());
                    			
                    // InternalCocinita.g:437:4: ( (lv_exp_1_0= ruleExpresion ) )
                    // InternalCocinita.g:438:5: (lv_exp_1_0= ruleExpresion )
                    {
                    // InternalCocinita.g:438:5: (lv_exp_1_0= ruleExpresion )
                    // InternalCocinita.g:439:6: lv_exp_1_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_1_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getInstruccionAccess().getEnKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getInstruccionAccess().getElKeyword_0_3());
                    			
                    // InternalCocinita.g:464:4: ( (lv_bowl_4_0= ruleBowl ) )
                    // InternalCocinita.g:465:5: (lv_bowl_4_0= ruleBowl )
                    {
                    // InternalCocinita.g:465:5: (lv_bowl_4_0= ruleBowl )
                    // InternalCocinita.g:466:6: lv_bowl_4_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_4_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_4_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:485:3: (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:485:3: (otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) ) )
                    // InternalCocinita.g:486:4: otherlv_5= 'Licuar' ( (lv_exp_6_0= ruleExpresion ) ) otherlv_7= 'en' otherlv_8= 'el' ( (lv_bowl_9_0= ruleBowl ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getInstruccionAccess().getLicuarKeyword_1_0());
                    			
                    // InternalCocinita.g:490:4: ( (lv_exp_6_0= ruleExpresion ) )
                    // InternalCocinita.g:491:5: (lv_exp_6_0= ruleExpresion )
                    {
                    // InternalCocinita.g:491:5: (lv_exp_6_0= ruleExpresion )
                    // InternalCocinita.g:492:6: lv_exp_6_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_6_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getInstruccionAccess().getEnKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getInstruccionAccess().getElKeyword_1_3());
                    			
                    // InternalCocinita.g:517:4: ( (lv_bowl_9_0= ruleBowl ) )
                    // InternalCocinita.g:518:5: (lv_bowl_9_0= ruleBowl )
                    {
                    // InternalCocinita.g:518:5: (lv_bowl_9_0= ruleBowl )
                    // InternalCocinita.g:519:6: lv_bowl_9_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_9_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_9_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCocinita.g:538:3: (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:538:3: (otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) ) )
                    // InternalCocinita.g:539:4: otherlv_10= 'Hornear' ( (lv_exp_11_0= ruleExpresion ) ) otherlv_12= 'en' otherlv_13= 'el' ( (lv_bowl_14_0= ruleBowl ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getInstruccionAccess().getHornearKeyword_2_0());
                    			
                    // InternalCocinita.g:543:4: ( (lv_exp_11_0= ruleExpresion ) )
                    // InternalCocinita.g:544:5: (lv_exp_11_0= ruleExpresion )
                    {
                    // InternalCocinita.g:544:5: (lv_exp_11_0= ruleExpresion )
                    // InternalCocinita.g:545:6: lv_exp_11_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_11_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_11_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getInstruccionAccess().getEnKeyword_2_2());
                    			
                    otherlv_13=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getInstruccionAccess().getElKeyword_2_3());
                    			
                    // InternalCocinita.g:570:4: ( (lv_bowl_14_0= ruleBowl ) )
                    // InternalCocinita.g:571:5: (lv_bowl_14_0= ruleBowl )
                    {
                    // InternalCocinita.g:571:5: (lv_bowl_14_0= ruleBowl )
                    // InternalCocinita.g:572:6: lv_bowl_14_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_14_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_14_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCocinita.g:591:3: (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:591:3: (otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) ) )
                    // InternalCocinita.g:592:4: otherlv_15= 'Refrigerar' ( (lv_exp_16_0= ruleExpresion ) ) otherlv_17= 'en' otherlv_18= 'el' ( (lv_bowl_19_0= ruleBowl ) )
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getInstruccionAccess().getRefrigerarKeyword_3_0());
                    			
                    // InternalCocinita.g:596:4: ( (lv_exp_16_0= ruleExpresion ) )
                    // InternalCocinita.g:597:5: (lv_exp_16_0= ruleExpresion )
                    {
                    // InternalCocinita.g:597:5: (lv_exp_16_0= ruleExpresion )
                    // InternalCocinita.g:598:6: lv_exp_16_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_16_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_16_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getInstruccionAccess().getEnKeyword_3_2());
                    			
                    otherlv_18=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getInstruccionAccess().getElKeyword_3_3());
                    			
                    // InternalCocinita.g:623:4: ( (lv_bowl_19_0= ruleBowl ) )
                    // InternalCocinita.g:624:5: (lv_bowl_19_0= ruleBowl )
                    {
                    // InternalCocinita.g:624:5: (lv_bowl_19_0= ruleBowl )
                    // InternalCocinita.g:625:6: lv_bowl_19_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_19_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_19_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCocinita.g:644:3: (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:644:3: (otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) ) )
                    // InternalCocinita.g:645:4: otherlv_20= 'Agregar' ( (lv_exp_21_0= ruleExpresion ) ) otherlv_22= 'en' otherlv_23= 'el' ( (lv_bowl_24_0= ruleBowl ) )
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getInstruccionAccess().getAgregarKeyword_4_0());
                    			
                    // InternalCocinita.g:649:4: ( (lv_exp_21_0= ruleExpresion ) )
                    // InternalCocinita.g:650:5: (lv_exp_21_0= ruleExpresion )
                    {
                    // InternalCocinita.g:650:5: (lv_exp_21_0= ruleExpresion )
                    // InternalCocinita.g:651:6: lv_exp_21_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_21_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_21_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getInstruccionAccess().getEnKeyword_4_2());
                    			
                    otherlv_23=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_23, grammarAccess.getInstruccionAccess().getElKeyword_4_3());
                    			
                    // InternalCocinita.g:676:4: ( (lv_bowl_24_0= ruleBowl ) )
                    // InternalCocinita.g:677:5: (lv_bowl_24_0= ruleBowl )
                    {
                    // InternalCocinita.g:677:5: (lv_bowl_24_0= ruleBowl )
                    // InternalCocinita.g:678:6: lv_bowl_24_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_24_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_24_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCocinita.g:697:3: (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:697:3: (otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) ) )
                    // InternalCocinita.g:698:4: otherlv_25= 'Tamizar' ( (lv_exp_26_0= ruleExpresion ) ) otherlv_27= 'en' otherlv_28= 'el' ( (lv_bowl_29_0= ruleBowl ) )
                    {
                    otherlv_25=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getInstruccionAccess().getTamizarKeyword_5_0());
                    			
                    // InternalCocinita.g:702:4: ( (lv_exp_26_0= ruleExpresion ) )
                    // InternalCocinita.g:703:5: (lv_exp_26_0= ruleExpresion )
                    {
                    // InternalCocinita.g:703:5: (lv_exp_26_0= ruleExpresion )
                    // InternalCocinita.g:704:6: lv_exp_26_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_26_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_26_0,
                    							"upb.edu.lp.Cocinita.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_27, grammarAccess.getInstruccionAccess().getEnKeyword_5_2());
                    			
                    otherlv_28=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_28, grammarAccess.getInstruccionAccess().getElKeyword_5_3());
                    			
                    // InternalCocinita.g:729:4: ( (lv_bowl_29_0= ruleBowl ) )
                    // InternalCocinita.g:730:5: (lv_bowl_29_0= ruleBowl )
                    {
                    // InternalCocinita.g:730:5: (lv_bowl_29_0= ruleBowl )
                    // InternalCocinita.g:731:6: lv_bowl_29_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_29_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_29_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalCocinita.g:750:3: (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) )
                    {
                    // InternalCocinita.g:750:3: (otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) ) )
                    // InternalCocinita.g:751:4: otherlv_30= 'Vertir' ( (lv_bowl_31_0= ruleBowl ) )
                    {
                    otherlv_30=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_30, grammarAccess.getInstruccionAccess().getVertirKeyword_6_0());
                    			
                    // InternalCocinita.g:755:4: ( (lv_bowl_31_0= ruleBowl ) )
                    // InternalCocinita.g:756:5: (lv_bowl_31_0= ruleBowl )
                    {
                    // InternalCocinita.g:756:5: (lv_bowl_31_0= ruleBowl )
                    // InternalCocinita.g:757:6: lv_bowl_31_0= ruleBowl
                    {

                    						newCompositeNode(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bowl_31_0=ruleBowl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstruccionRule());
                    						}
                    						set(
                    							current,
                    							"bowl",
                    							lv_bowl_31_0,
                    							"upb.edu.lp.Cocinita.Bowl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleInstruccion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000FC810002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}