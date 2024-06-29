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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCocinitaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[-o]'", "'[cU]'", "'[-O]'", "'[RECIPE]'", "'Ingredientes:'", "'Materiales:'", "'(_).'", "'Procedimiento:'", "'Servir'", "'.'", "'('", "')'", "'Batir'", "'en'", "'el'", "'Licuar'", "'Hornear'", "'Refrigerar'", "'Agregar'", "'Tamizar'", "'Vertir'"
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



    // $ANTLR start "entryRuleCocina"
    // InternalCocinita.g:53:1: entryRuleCocina : ruleCocina EOF ;
    public final void entryRuleCocina() throws RecognitionException {
        try {
            // InternalCocinita.g:54:1: ( ruleCocina EOF )
            // InternalCocinita.g:55:1: ruleCocina EOF
            {
             before(grammarAccess.getCocinaRule()); 
            pushFollow(FOLLOW_1);
            ruleCocina();

            state._fsp--;

             after(grammarAccess.getCocinaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCocina"


    // $ANTLR start "ruleCocina"
    // InternalCocinita.g:62:1: ruleCocina : ( ( rule__Cocina__Group__0 ) ) ;
    public final void ruleCocina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:66:2: ( ( ( rule__Cocina__Group__0 ) ) )
            // InternalCocinita.g:67:2: ( ( rule__Cocina__Group__0 ) )
            {
            // InternalCocinita.g:67:2: ( ( rule__Cocina__Group__0 ) )
            // InternalCocinita.g:68:3: ( rule__Cocina__Group__0 )
            {
             before(grammarAccess.getCocinaAccess().getGroup()); 
            // InternalCocinita.g:69:3: ( rule__Cocina__Group__0 )
            // InternalCocinita.g:69:4: rule__Cocina__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCocinaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCocina"


    // $ANTLR start "entryRuleIngrediente"
    // InternalCocinita.g:78:1: entryRuleIngrediente : ruleIngrediente EOF ;
    public final void entryRuleIngrediente() throws RecognitionException {
        try {
            // InternalCocinita.g:79:1: ( ruleIngrediente EOF )
            // InternalCocinita.g:80:1: ruleIngrediente EOF
            {
             before(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getIngredienteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalCocinita.g:87:1: ruleIngrediente : ( ( rule__Ingrediente__Group__0 ) ) ;
    public final void ruleIngrediente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:91:2: ( ( ( rule__Ingrediente__Group__0 ) ) )
            // InternalCocinita.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            {
            // InternalCocinita.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            // InternalCocinita.g:93:3: ( rule__Ingrediente__Group__0 )
            {
             before(grammarAccess.getIngredienteAccess().getGroup()); 
            // InternalCocinita.g:94:3: ( rule__Ingrediente__Group__0 )
            // InternalCocinita.g:94:4: rule__Ingrediente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngrediente"


    // $ANTLR start "entryRuleTipoVariable"
    // InternalCocinita.g:103:1: entryRuleTipoVariable : ruleTipoVariable EOF ;
    public final void entryRuleTipoVariable() throws RecognitionException {
        try {
            // InternalCocinita.g:104:1: ( ruleTipoVariable EOF )
            // InternalCocinita.g:105:1: ruleTipoVariable EOF
            {
             before(grammarAccess.getTipoVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getTipoVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoVariable"


    // $ANTLR start "ruleTipoVariable"
    // InternalCocinita.g:112:1: ruleTipoVariable : ( ( rule__TipoVariable__Alternatives ) ) ;
    public final void ruleTipoVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:116:2: ( ( ( rule__TipoVariable__Alternatives ) ) )
            // InternalCocinita.g:117:2: ( ( rule__TipoVariable__Alternatives ) )
            {
            // InternalCocinita.g:117:2: ( ( rule__TipoVariable__Alternatives ) )
            // InternalCocinita.g:118:3: ( rule__TipoVariable__Alternatives )
            {
             before(grammarAccess.getTipoVariableAccess().getAlternatives()); 
            // InternalCocinita.g:119:3: ( rule__TipoVariable__Alternatives )
            // InternalCocinita.g:119:4: rule__TipoVariable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoVariable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoVariable"


    // $ANTLR start "entryRuleBowl"
    // InternalCocinita.g:128:1: entryRuleBowl : ruleBowl EOF ;
    public final void entryRuleBowl() throws RecognitionException {
        try {
            // InternalCocinita.g:129:1: ( ruleBowl EOF )
            // InternalCocinita.g:130:1: ruleBowl EOF
            {
             before(grammarAccess.getBowlRule()); 
            pushFollow(FOLLOW_1);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getBowlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBowl"


    // $ANTLR start "ruleBowl"
    // InternalCocinita.g:137:1: ruleBowl : ( ( rule__Bowl__Group__0 ) ) ;
    public final void ruleBowl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:141:2: ( ( ( rule__Bowl__Group__0 ) ) )
            // InternalCocinita.g:142:2: ( ( rule__Bowl__Group__0 ) )
            {
            // InternalCocinita.g:142:2: ( ( rule__Bowl__Group__0 ) )
            // InternalCocinita.g:143:3: ( rule__Bowl__Group__0 )
            {
             before(grammarAccess.getBowlAccess().getGroup()); 
            // InternalCocinita.g:144:3: ( rule__Bowl__Group__0 )
            // InternalCocinita.g:144:4: rule__Bowl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bowl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBowlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBowl"


    // $ANTLR start "entryRuleExpresion"
    // InternalCocinita.g:153:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalCocinita.g:154:1: ( ruleExpresion EOF )
            // InternalCocinita.g:155:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalCocinita.g:162:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:166:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // InternalCocinita.g:167:2: ( ( rule__Expresion__Alternatives ) )
            {
            // InternalCocinita.g:167:2: ( ( rule__Expresion__Alternatives ) )
            // InternalCocinita.g:168:3: ( rule__Expresion__Alternatives )
            {
             before(grammarAccess.getExpresionAccess().getAlternatives()); 
            // InternalCocinita.g:169:3: ( rule__Expresion__Alternatives )
            // InternalCocinita.g:169:4: rule__Expresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleInstruccion"
    // InternalCocinita.g:178:1: entryRuleInstruccion : ruleInstruccion EOF ;
    public final void entryRuleInstruccion() throws RecognitionException {
        try {
            // InternalCocinita.g:179:1: ( ruleInstruccion EOF )
            // InternalCocinita.g:180:1: ruleInstruccion EOF
            {
             before(grammarAccess.getInstruccionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getInstruccionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruccion"


    // $ANTLR start "ruleInstruccion"
    // InternalCocinita.g:187:1: ruleInstruccion : ( ( rule__Instruccion__Alternatives ) ) ;
    public final void ruleInstruccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:191:2: ( ( ( rule__Instruccion__Alternatives ) ) )
            // InternalCocinita.g:192:2: ( ( rule__Instruccion__Alternatives ) )
            {
            // InternalCocinita.g:192:2: ( ( rule__Instruccion__Alternatives ) )
            // InternalCocinita.g:193:3: ( rule__Instruccion__Alternatives )
            {
             before(grammarAccess.getInstruccionAccess().getAlternatives()); 
            // InternalCocinita.g:194:3: ( rule__Instruccion__Alternatives )
            // InternalCocinita.g:194:4: rule__Instruccion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruccion"


    // $ANTLR start "rule__TipoVariable__Alternatives"
    // InternalCocinita.g:202:1: rule__TipoVariable__Alternatives : ( ( '[-o]' ) | ( '[cU]' ) | ( '[-O]' ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:206:1: ( ( '[-o]' ) | ( '[cU]' ) | ( '[-O]' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCocinita.g:207:2: ( '[-o]' )
                    {
                    // InternalCocinita.g:207:2: ( '[-o]' )
                    // InternalCocinita.g:208:3: '[-o]'
                    {
                     before(grammarAccess.getTipoVariableAccess().getOKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTipoVariableAccess().getOKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:213:2: ( '[cU]' )
                    {
                    // InternalCocinita.g:213:2: ( '[cU]' )
                    // InternalCocinita.g:214:3: '[cU]'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCUKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTipoVariableAccess().getCUKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocinita.g:219:2: ( '[-O]' )
                    {
                    // InternalCocinita.g:219:2: ( '[-O]' )
                    // InternalCocinita.g:220:3: '[-O]'
                    {
                     before(grammarAccess.getTipoVariableAccess().getOKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTipoVariableAccess().getOKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoVariable__Alternatives"


    // $ANTLR start "rule__Expresion__Alternatives"
    // InternalCocinita.g:229:1: rule__Expresion__Alternatives : ( ( ( rule__Expresion__IngredienteAssignment_0 ) ) | ( ( rule__Expresion__BowlAssignment_1 ) ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:233:1: ( ( ( rule__Expresion__IngredienteAssignment_0 ) ) | ( ( rule__Expresion__BowlAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCocinita.g:234:2: ( ( rule__Expresion__IngredienteAssignment_0 ) )
                    {
                    // InternalCocinita.g:234:2: ( ( rule__Expresion__IngredienteAssignment_0 ) )
                    // InternalCocinita.g:235:3: ( rule__Expresion__IngredienteAssignment_0 )
                    {
                     before(grammarAccess.getExpresionAccess().getIngredienteAssignment_0()); 
                    // InternalCocinita.g:236:3: ( rule__Expresion__IngredienteAssignment_0 )
                    // InternalCocinita.g:236:4: rule__Expresion__IngredienteAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expresion__IngredienteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpresionAccess().getIngredienteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:240:2: ( ( rule__Expresion__BowlAssignment_1 ) )
                    {
                    // InternalCocinita.g:240:2: ( ( rule__Expresion__BowlAssignment_1 ) )
                    // InternalCocinita.g:241:3: ( rule__Expresion__BowlAssignment_1 )
                    {
                     before(grammarAccess.getExpresionAccess().getBowlAssignment_1()); 
                    // InternalCocinita.g:242:3: ( rule__Expresion__BowlAssignment_1 )
                    // InternalCocinita.g:242:4: rule__Expresion__BowlAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expresion__BowlAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpresionAccess().getBowlAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Alternatives"


    // $ANTLR start "rule__Instruccion__Alternatives"
    // InternalCocinita.g:250:1: rule__Instruccion__Alternatives : ( ( ( rule__Instruccion__Group_0__0 ) ) | ( ( rule__Instruccion__Group_1__0 ) ) | ( ( rule__Instruccion__Group_2__0 ) ) | ( ( rule__Instruccion__Group_3__0 ) ) | ( ( rule__Instruccion__Group_4__0 ) ) | ( ( rule__Instruccion__Group_5__0 ) ) | ( ( rule__Instruccion__Group_6__0 ) ) );
    public final void rule__Instruccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:254:1: ( ( ( rule__Instruccion__Group_0__0 ) ) | ( ( rule__Instruccion__Group_1__0 ) ) | ( ( rule__Instruccion__Group_2__0 ) ) | ( ( rule__Instruccion__Group_3__0 ) ) | ( ( rule__Instruccion__Group_4__0 ) ) | ( ( rule__Instruccion__Group_5__0 ) ) | ( ( rule__Instruccion__Group_6__0 ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            case 31:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCocinita.g:255:2: ( ( rule__Instruccion__Group_0__0 ) )
                    {
                    // InternalCocinita.g:255:2: ( ( rule__Instruccion__Group_0__0 ) )
                    // InternalCocinita.g:256:3: ( rule__Instruccion__Group_0__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_0()); 
                    // InternalCocinita.g:257:3: ( rule__Instruccion__Group_0__0 )
                    // InternalCocinita.g:257:4: rule__Instruccion__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:261:2: ( ( rule__Instruccion__Group_1__0 ) )
                    {
                    // InternalCocinita.g:261:2: ( ( rule__Instruccion__Group_1__0 ) )
                    // InternalCocinita.g:262:3: ( rule__Instruccion__Group_1__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_1()); 
                    // InternalCocinita.g:263:3: ( rule__Instruccion__Group_1__0 )
                    // InternalCocinita.g:263:4: rule__Instruccion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocinita.g:267:2: ( ( rule__Instruccion__Group_2__0 ) )
                    {
                    // InternalCocinita.g:267:2: ( ( rule__Instruccion__Group_2__0 ) )
                    // InternalCocinita.g:268:3: ( rule__Instruccion__Group_2__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_2()); 
                    // InternalCocinita.g:269:3: ( rule__Instruccion__Group_2__0 )
                    // InternalCocinita.g:269:4: rule__Instruccion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCocinita.g:273:2: ( ( rule__Instruccion__Group_3__0 ) )
                    {
                    // InternalCocinita.g:273:2: ( ( rule__Instruccion__Group_3__0 ) )
                    // InternalCocinita.g:274:3: ( rule__Instruccion__Group_3__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_3()); 
                    // InternalCocinita.g:275:3: ( rule__Instruccion__Group_3__0 )
                    // InternalCocinita.g:275:4: rule__Instruccion__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCocinita.g:279:2: ( ( rule__Instruccion__Group_4__0 ) )
                    {
                    // InternalCocinita.g:279:2: ( ( rule__Instruccion__Group_4__0 ) )
                    // InternalCocinita.g:280:3: ( rule__Instruccion__Group_4__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_4()); 
                    // InternalCocinita.g:281:3: ( rule__Instruccion__Group_4__0 )
                    // InternalCocinita.g:281:4: rule__Instruccion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCocinita.g:285:2: ( ( rule__Instruccion__Group_5__0 ) )
                    {
                    // InternalCocinita.g:285:2: ( ( rule__Instruccion__Group_5__0 ) )
                    // InternalCocinita.g:286:3: ( rule__Instruccion__Group_5__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_5()); 
                    // InternalCocinita.g:287:3: ( rule__Instruccion__Group_5__0 )
                    // InternalCocinita.g:287:4: rule__Instruccion__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCocinita.g:291:2: ( ( rule__Instruccion__Group_6__0 ) )
                    {
                    // InternalCocinita.g:291:2: ( ( rule__Instruccion__Group_6__0 ) )
                    // InternalCocinita.g:292:3: ( rule__Instruccion__Group_6__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_6()); 
                    // InternalCocinita.g:293:3: ( rule__Instruccion__Group_6__0 )
                    // InternalCocinita.g:293:4: rule__Instruccion__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Alternatives"


    // $ANTLR start "rule__Cocina__Group__0"
    // InternalCocinita.g:301:1: rule__Cocina__Group__0 : rule__Cocina__Group__0__Impl rule__Cocina__Group__1 ;
    public final void rule__Cocina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:305:1: ( rule__Cocina__Group__0__Impl rule__Cocina__Group__1 )
            // InternalCocinita.g:306:2: rule__Cocina__Group__0__Impl rule__Cocina__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cocina__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__0"


    // $ANTLR start "rule__Cocina__Group__0__Impl"
    // InternalCocinita.g:313:1: rule__Cocina__Group__0__Impl : ( '[RECIPE]' ) ;
    public final void rule__Cocina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:317:1: ( ( '[RECIPE]' ) )
            // InternalCocinita.g:318:1: ( '[RECIPE]' )
            {
            // InternalCocinita.g:318:1: ( '[RECIPE]' )
            // InternalCocinita.g:319:2: '[RECIPE]'
            {
             before(grammarAccess.getCocinaAccess().getRECIPEKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getRECIPEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__0__Impl"


    // $ANTLR start "rule__Cocina__Group__1"
    // InternalCocinita.g:328:1: rule__Cocina__Group__1 : rule__Cocina__Group__1__Impl rule__Cocina__Group__2 ;
    public final void rule__Cocina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:332:1: ( rule__Cocina__Group__1__Impl rule__Cocina__Group__2 )
            // InternalCocinita.g:333:2: rule__Cocina__Group__1__Impl rule__Cocina__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Cocina__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__1"


    // $ANTLR start "rule__Cocina__Group__1__Impl"
    // InternalCocinita.g:340:1: rule__Cocina__Group__1__Impl : ( ( rule__Cocina__NameAssignment_1 ) ) ;
    public final void rule__Cocina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:344:1: ( ( ( rule__Cocina__NameAssignment_1 ) ) )
            // InternalCocinita.g:345:1: ( ( rule__Cocina__NameAssignment_1 ) )
            {
            // InternalCocinita.g:345:1: ( ( rule__Cocina__NameAssignment_1 ) )
            // InternalCocinita.g:346:2: ( rule__Cocina__NameAssignment_1 )
            {
             before(grammarAccess.getCocinaAccess().getNameAssignment_1()); 
            // InternalCocinita.g:347:2: ( rule__Cocina__NameAssignment_1 )
            // InternalCocinita.g:347:3: rule__Cocina__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCocinaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__1__Impl"


    // $ANTLR start "rule__Cocina__Group__2"
    // InternalCocinita.g:355:1: rule__Cocina__Group__2 : rule__Cocina__Group__2__Impl rule__Cocina__Group__3 ;
    public final void rule__Cocina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:359:1: ( rule__Cocina__Group__2__Impl rule__Cocina__Group__3 )
            // InternalCocinita.g:360:2: rule__Cocina__Group__2__Impl rule__Cocina__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Cocina__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__2"


    // $ANTLR start "rule__Cocina__Group__2__Impl"
    // InternalCocinita.g:367:1: rule__Cocina__Group__2__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Cocina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:371:1: ( ( 'Ingredientes:' ) )
            // InternalCocinita.g:372:1: ( 'Ingredientes:' )
            {
            // InternalCocinita.g:372:1: ( 'Ingredientes:' )
            // InternalCocinita.g:373:2: 'Ingredientes:'
            {
             before(grammarAccess.getCocinaAccess().getIngredientesKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getIngredientesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__2__Impl"


    // $ANTLR start "rule__Cocina__Group__3"
    // InternalCocinita.g:382:1: rule__Cocina__Group__3 : rule__Cocina__Group__3__Impl rule__Cocina__Group__4 ;
    public final void rule__Cocina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:386:1: ( rule__Cocina__Group__3__Impl rule__Cocina__Group__4 )
            // InternalCocinita.g:387:2: rule__Cocina__Group__3__Impl rule__Cocina__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Cocina__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__3"


    // $ANTLR start "rule__Cocina__Group__3__Impl"
    // InternalCocinita.g:394:1: rule__Cocina__Group__3__Impl : ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) ;
    public final void rule__Cocina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:398:1: ( ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) )
            // InternalCocinita.g:399:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            {
            // InternalCocinita.g:399:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            // InternalCocinita.g:400:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            {
             before(grammarAccess.getCocinaAccess().getListaIngredientesAssignment_3()); 
            // InternalCocinita.g:401:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCocinita.g:401:3: rule__Cocina__ListaIngredientesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Cocina__ListaIngredientesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCocinaAccess().getListaIngredientesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__3__Impl"


    // $ANTLR start "rule__Cocina__Group__4"
    // InternalCocinita.g:409:1: rule__Cocina__Group__4 : rule__Cocina__Group__4__Impl rule__Cocina__Group__5 ;
    public final void rule__Cocina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:413:1: ( rule__Cocina__Group__4__Impl rule__Cocina__Group__5 )
            // InternalCocinita.g:414:2: rule__Cocina__Group__4__Impl rule__Cocina__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Cocina__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__4"


    // $ANTLR start "rule__Cocina__Group__4__Impl"
    // InternalCocinita.g:421:1: rule__Cocina__Group__4__Impl : ( 'Materiales:' ) ;
    public final void rule__Cocina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:425:1: ( ( 'Materiales:' ) )
            // InternalCocinita.g:426:1: ( 'Materiales:' )
            {
            // InternalCocinita.g:426:1: ( 'Materiales:' )
            // InternalCocinita.g:427:2: 'Materiales:'
            {
             before(grammarAccess.getCocinaAccess().getMaterialesKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getMaterialesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__4__Impl"


    // $ANTLR start "rule__Cocina__Group__5"
    // InternalCocinita.g:436:1: rule__Cocina__Group__5 : rule__Cocina__Group__5__Impl rule__Cocina__Group__6 ;
    public final void rule__Cocina__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:440:1: ( rule__Cocina__Group__5__Impl rule__Cocina__Group__6 )
            // InternalCocinita.g:441:2: rule__Cocina__Group__5__Impl rule__Cocina__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Cocina__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__5"


    // $ANTLR start "rule__Cocina__Group__5__Impl"
    // InternalCocinita.g:448:1: rule__Cocina__Group__5__Impl : ( ( rule__Cocina__NBowlAssignment_5 ) ) ;
    public final void rule__Cocina__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:452:1: ( ( ( rule__Cocina__NBowlAssignment_5 ) ) )
            // InternalCocinita.g:453:1: ( ( rule__Cocina__NBowlAssignment_5 ) )
            {
            // InternalCocinita.g:453:1: ( ( rule__Cocina__NBowlAssignment_5 ) )
            // InternalCocinita.g:454:2: ( rule__Cocina__NBowlAssignment_5 )
            {
             before(grammarAccess.getCocinaAccess().getNBowlAssignment_5()); 
            // InternalCocinita.g:455:2: ( rule__Cocina__NBowlAssignment_5 )
            // InternalCocinita.g:455:3: rule__Cocina__NBowlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__NBowlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCocinaAccess().getNBowlAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__5__Impl"


    // $ANTLR start "rule__Cocina__Group__6"
    // InternalCocinita.g:463:1: rule__Cocina__Group__6 : rule__Cocina__Group__6__Impl rule__Cocina__Group__7 ;
    public final void rule__Cocina__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:467:1: ( rule__Cocina__Group__6__Impl rule__Cocina__Group__7 )
            // InternalCocinita.g:468:2: rule__Cocina__Group__6__Impl rule__Cocina__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Cocina__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__6"


    // $ANTLR start "rule__Cocina__Group__6__Impl"
    // InternalCocinita.g:475:1: rule__Cocina__Group__6__Impl : ( '(_).' ) ;
    public final void rule__Cocina__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:479:1: ( ( '(_).' ) )
            // InternalCocinita.g:480:1: ( '(_).' )
            {
            // InternalCocinita.g:480:1: ( '(_).' )
            // InternalCocinita.g:481:2: '(_).'
            {
             before(grammarAccess.getCocinaAccess().get_Keyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().get_Keyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__6__Impl"


    // $ANTLR start "rule__Cocina__Group__7"
    // InternalCocinita.g:490:1: rule__Cocina__Group__7 : rule__Cocina__Group__7__Impl rule__Cocina__Group__8 ;
    public final void rule__Cocina__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:494:1: ( rule__Cocina__Group__7__Impl rule__Cocina__Group__8 )
            // InternalCocinita.g:495:2: rule__Cocina__Group__7__Impl rule__Cocina__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Cocina__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__7"


    // $ANTLR start "rule__Cocina__Group__7__Impl"
    // InternalCocinita.g:502:1: rule__Cocina__Group__7__Impl : ( 'Procedimiento:' ) ;
    public final void rule__Cocina__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:506:1: ( ( 'Procedimiento:' ) )
            // InternalCocinita.g:507:1: ( 'Procedimiento:' )
            {
            // InternalCocinita.g:507:1: ( 'Procedimiento:' )
            // InternalCocinita.g:508:2: 'Procedimiento:'
            {
             before(grammarAccess.getCocinaAccess().getProcedimientoKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getProcedimientoKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__7__Impl"


    // $ANTLR start "rule__Cocina__Group__8"
    // InternalCocinita.g:517:1: rule__Cocina__Group__8 : rule__Cocina__Group__8__Impl rule__Cocina__Group__9 ;
    public final void rule__Cocina__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:521:1: ( rule__Cocina__Group__8__Impl rule__Cocina__Group__9 )
            // InternalCocinita.g:522:2: rule__Cocina__Group__8__Impl rule__Cocina__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Cocina__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__8"


    // $ANTLR start "rule__Cocina__Group__8__Impl"
    // InternalCocinita.g:529:1: rule__Cocina__Group__8__Impl : ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* ) ;
    public final void rule__Cocina__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:533:1: ( ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* ) )
            // InternalCocinita.g:534:1: ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* )
            {
            // InternalCocinita.g:534:1: ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* )
            // InternalCocinita.g:535:2: ( rule__Cocina__ListaInstruccionesAssignment_8 )*
            {
             before(grammarAccess.getCocinaAccess().getListaInstruccionesAssignment_8()); 
            // InternalCocinita.g:536:2: ( rule__Cocina__ListaInstruccionesAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23||(LA5_0>=26 && LA5_0<=31)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCocinita.g:536:3: rule__Cocina__ListaInstruccionesAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Cocina__ListaInstruccionesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCocinaAccess().getListaInstruccionesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__8__Impl"


    // $ANTLR start "rule__Cocina__Group__9"
    // InternalCocinita.g:544:1: rule__Cocina__Group__9 : rule__Cocina__Group__9__Impl ;
    public final void rule__Cocina__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:548:1: ( rule__Cocina__Group__9__Impl )
            // InternalCocinita.g:549:2: rule__Cocina__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__9"


    // $ANTLR start "rule__Cocina__Group__9__Impl"
    // InternalCocinita.g:555:1: rule__Cocina__Group__9__Impl : ( ( rule__Cocina__Group_9__0 )* ) ;
    public final void rule__Cocina__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:559:1: ( ( ( rule__Cocina__Group_9__0 )* ) )
            // InternalCocinita.g:560:1: ( ( rule__Cocina__Group_9__0 )* )
            {
            // InternalCocinita.g:560:1: ( ( rule__Cocina__Group_9__0 )* )
            // InternalCocinita.g:561:2: ( rule__Cocina__Group_9__0 )*
            {
             before(grammarAccess.getCocinaAccess().getGroup_9()); 
            // InternalCocinita.g:562:2: ( rule__Cocina__Group_9__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCocinita.g:562:3: rule__Cocina__Group_9__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Cocina__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCocinaAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group__9__Impl"


    // $ANTLR start "rule__Cocina__Group_9__0"
    // InternalCocinita.g:571:1: rule__Cocina__Group_9__0 : rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1 ;
    public final void rule__Cocina__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:575:1: ( rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1 )
            // InternalCocinita.g:576:2: rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Cocina__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__0"


    // $ANTLR start "rule__Cocina__Group_9__0__Impl"
    // InternalCocinita.g:583:1: rule__Cocina__Group_9__0__Impl : ( 'Servir' ) ;
    public final void rule__Cocina__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:587:1: ( ( 'Servir' ) )
            // InternalCocinita.g:588:1: ( 'Servir' )
            {
            // InternalCocinita.g:588:1: ( 'Servir' )
            // InternalCocinita.g:589:2: 'Servir'
            {
             before(grammarAccess.getCocinaAccess().getServirKeyword_9_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getServirKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__0__Impl"


    // $ANTLR start "rule__Cocina__Group_9__1"
    // InternalCocinita.g:598:1: rule__Cocina__Group_9__1 : rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2 ;
    public final void rule__Cocina__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:602:1: ( rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2 )
            // InternalCocinita.g:603:2: rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2
            {
            pushFollow(FOLLOW_14);
            rule__Cocina__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cocina__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__1"


    // $ANTLR start "rule__Cocina__Group_9__1__Impl"
    // InternalCocinita.g:610:1: rule__Cocina__Group_9__1__Impl : ( ( rule__Cocina__BowlAssignment_9_1 ) ) ;
    public final void rule__Cocina__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:614:1: ( ( ( rule__Cocina__BowlAssignment_9_1 ) ) )
            // InternalCocinita.g:615:1: ( ( rule__Cocina__BowlAssignment_9_1 ) )
            {
            // InternalCocinita.g:615:1: ( ( rule__Cocina__BowlAssignment_9_1 ) )
            // InternalCocinita.g:616:2: ( rule__Cocina__BowlAssignment_9_1 )
            {
             before(grammarAccess.getCocinaAccess().getBowlAssignment_9_1()); 
            // InternalCocinita.g:617:2: ( rule__Cocina__BowlAssignment_9_1 )
            // InternalCocinita.g:617:3: rule__Cocina__BowlAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__BowlAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCocinaAccess().getBowlAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__1__Impl"


    // $ANTLR start "rule__Cocina__Group_9__2"
    // InternalCocinita.g:625:1: rule__Cocina__Group_9__2 : rule__Cocina__Group_9__2__Impl ;
    public final void rule__Cocina__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:629:1: ( rule__Cocina__Group_9__2__Impl )
            // InternalCocinita.g:630:2: rule__Cocina__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__2"


    // $ANTLR start "rule__Cocina__Group_9__2__Impl"
    // InternalCocinita.g:636:1: rule__Cocina__Group_9__2__Impl : ( '.' ) ;
    public final void rule__Cocina__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:640:1: ( ( '.' ) )
            // InternalCocinita.g:641:1: ( '.' )
            {
            // InternalCocinita.g:641:1: ( '.' )
            // InternalCocinita.g:642:2: '.'
            {
             before(grammarAccess.getCocinaAccess().getFullStopKeyword_9_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getFullStopKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__Group_9__2__Impl"


    // $ANTLR start "rule__Ingrediente__Group__0"
    // InternalCocinita.g:652:1: rule__Ingrediente__Group__0 : rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 ;
    public final void rule__Ingrediente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:656:1: ( rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 )
            // InternalCocinita.g:657:2: rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Ingrediente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0"


    // $ANTLR start "rule__Ingrediente__Group__0__Impl"
    // InternalCocinita.g:664:1: rule__Ingrediente__Group__0__Impl : ( ( rule__Ingrediente__AsciiAssignment_0 ) ) ;
    public final void rule__Ingrediente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:668:1: ( ( ( rule__Ingrediente__AsciiAssignment_0 ) ) )
            // InternalCocinita.g:669:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            {
            // InternalCocinita.g:669:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            // InternalCocinita.g:670:2: ( rule__Ingrediente__AsciiAssignment_0 )
            {
             before(grammarAccess.getIngredienteAccess().getAsciiAssignment_0()); 
            // InternalCocinita.g:671:2: ( rule__Ingrediente__AsciiAssignment_0 )
            // InternalCocinita.g:671:3: rule__Ingrediente__AsciiAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__AsciiAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getAsciiAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group__1"
    // InternalCocinita.g:679:1: rule__Ingrediente__Group__1 : rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 ;
    public final void rule__Ingrediente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:683:1: ( rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 )
            // InternalCocinita.g:684:2: rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Ingrediente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1"


    // $ANTLR start "rule__Ingrediente__Group__1__Impl"
    // InternalCocinita.g:691:1: rule__Ingrediente__Group__1__Impl : ( ( rule__Ingrediente__TipoAssignment_1 ) ) ;
    public final void rule__Ingrediente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:695:1: ( ( ( rule__Ingrediente__TipoAssignment_1 ) ) )
            // InternalCocinita.g:696:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            {
            // InternalCocinita.g:696:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            // InternalCocinita.g:697:2: ( rule__Ingrediente__TipoAssignment_1 )
            {
             before(grammarAccess.getIngredienteAccess().getTipoAssignment_1()); 
            // InternalCocinita.g:698:2: ( rule__Ingrediente__TipoAssignment_1 )
            // InternalCocinita.g:698:3: rule__Ingrediente__TipoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1__Impl"


    // $ANTLR start "rule__Ingrediente__Group__2"
    // InternalCocinita.g:706:1: rule__Ingrediente__Group__2 : rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 ;
    public final void rule__Ingrediente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:710:1: ( rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 )
            // InternalCocinita.g:711:2: rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ingrediente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2"


    // $ANTLR start "rule__Ingrediente__Group__2__Impl"
    // InternalCocinita.g:718:1: rule__Ingrediente__Group__2__Impl : ( ( rule__Ingrediente__NameAssignment_2 ) ) ;
    public final void rule__Ingrediente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:722:1: ( ( ( rule__Ingrediente__NameAssignment_2 ) ) )
            // InternalCocinita.g:723:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            {
            // InternalCocinita.g:723:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            // InternalCocinita.g:724:2: ( rule__Ingrediente__NameAssignment_2 )
            {
             before(grammarAccess.getIngredienteAccess().getNameAssignment_2()); 
            // InternalCocinita.g:725:2: ( rule__Ingrediente__NameAssignment_2 )
            // InternalCocinita.g:725:3: rule__Ingrediente__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2__Impl"


    // $ANTLR start "rule__Ingrediente__Group__3"
    // InternalCocinita.g:733:1: rule__Ingrediente__Group__3 : rule__Ingrediente__Group__3__Impl ;
    public final void rule__Ingrediente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:737:1: ( rule__Ingrediente__Group__3__Impl )
            // InternalCocinita.g:738:2: rule__Ingrediente__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3"


    // $ANTLR start "rule__Ingrediente__Group__3__Impl"
    // InternalCocinita.g:744:1: rule__Ingrediente__Group__3__Impl : ( '.' ) ;
    public final void rule__Ingrediente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:748:1: ( ( '.' ) )
            // InternalCocinita.g:749:1: ( '.' )
            {
            // InternalCocinita.g:749:1: ( '.' )
            // InternalCocinita.g:750:2: '.'
            {
             before(grammarAccess.getIngredienteAccess().getFullStopKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3__Impl"


    // $ANTLR start "rule__Bowl__Group__0"
    // InternalCocinita.g:760:1: rule__Bowl__Group__0 : rule__Bowl__Group__0__Impl rule__Bowl__Group__1 ;
    public final void rule__Bowl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:764:1: ( rule__Bowl__Group__0__Impl rule__Bowl__Group__1 )
            // InternalCocinita.g:765:2: rule__Bowl__Group__0__Impl rule__Bowl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Bowl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bowl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__0"


    // $ANTLR start "rule__Bowl__Group__0__Impl"
    // InternalCocinita.g:772:1: rule__Bowl__Group__0__Impl : ( '(' ) ;
    public final void rule__Bowl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:776:1: ( ( '(' ) )
            // InternalCocinita.g:777:1: ( '(' )
            {
            // InternalCocinita.g:777:1: ( '(' )
            // InternalCocinita.g:778:2: '('
            {
             before(grammarAccess.getBowlAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBowlAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__0__Impl"


    // $ANTLR start "rule__Bowl__Group__1"
    // InternalCocinita.g:787:1: rule__Bowl__Group__1 : rule__Bowl__Group__1__Impl rule__Bowl__Group__2 ;
    public final void rule__Bowl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:791:1: ( rule__Bowl__Group__1__Impl rule__Bowl__Group__2 )
            // InternalCocinita.g:792:2: rule__Bowl__Group__1__Impl rule__Bowl__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Bowl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bowl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__1"


    // $ANTLR start "rule__Bowl__Group__1__Impl"
    // InternalCocinita.g:799:1: rule__Bowl__Group__1__Impl : ( ( rule__Bowl__NumeroAssignment_1 ) ) ;
    public final void rule__Bowl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:803:1: ( ( ( rule__Bowl__NumeroAssignment_1 ) ) )
            // InternalCocinita.g:804:1: ( ( rule__Bowl__NumeroAssignment_1 ) )
            {
            // InternalCocinita.g:804:1: ( ( rule__Bowl__NumeroAssignment_1 ) )
            // InternalCocinita.g:805:2: ( rule__Bowl__NumeroAssignment_1 )
            {
             before(grammarAccess.getBowlAccess().getNumeroAssignment_1()); 
            // InternalCocinita.g:806:2: ( rule__Bowl__NumeroAssignment_1 )
            // InternalCocinita.g:806:3: rule__Bowl__NumeroAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bowl__NumeroAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBowlAccess().getNumeroAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__1__Impl"


    // $ANTLR start "rule__Bowl__Group__2"
    // InternalCocinita.g:814:1: rule__Bowl__Group__2 : rule__Bowl__Group__2__Impl ;
    public final void rule__Bowl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:818:1: ( rule__Bowl__Group__2__Impl )
            // InternalCocinita.g:819:2: rule__Bowl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bowl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__2"


    // $ANTLR start "rule__Bowl__Group__2__Impl"
    // InternalCocinita.g:825:1: rule__Bowl__Group__2__Impl : ( ')' ) ;
    public final void rule__Bowl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:829:1: ( ( ')' ) )
            // InternalCocinita.g:830:1: ( ')' )
            {
            // InternalCocinita.g:830:1: ( ')' )
            // InternalCocinita.g:831:2: ')'
            {
             before(grammarAccess.getBowlAccess().getRightParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBowlAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__Group__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_0__0"
    // InternalCocinita.g:841:1: rule__Instruccion__Group_0__0 : rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1 ;
    public final void rule__Instruccion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:845:1: ( rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1 )
            // InternalCocinita.g:846:2: rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__0"


    // $ANTLR start "rule__Instruccion__Group_0__0__Impl"
    // InternalCocinita.g:853:1: rule__Instruccion__Group_0__0__Impl : ( 'Batir' ) ;
    public final void rule__Instruccion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:857:1: ( ( 'Batir' ) )
            // InternalCocinita.g:858:1: ( 'Batir' )
            {
            // InternalCocinita.g:858:1: ( 'Batir' )
            // InternalCocinita.g:859:2: 'Batir'
            {
             before(grammarAccess.getInstruccionAccess().getBatirKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getBatirKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_0__1"
    // InternalCocinita.g:868:1: rule__Instruccion__Group_0__1 : rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2 ;
    public final void rule__Instruccion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:872:1: ( rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2 )
            // InternalCocinita.g:873:2: rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__1"


    // $ANTLR start "rule__Instruccion__Group_0__1__Impl"
    // InternalCocinita.g:880:1: rule__Instruccion__Group_0__1__Impl : ( ( rule__Instruccion__ExpAssignment_0_1 ) ) ;
    public final void rule__Instruccion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:884:1: ( ( ( rule__Instruccion__ExpAssignment_0_1 ) ) )
            // InternalCocinita.g:885:1: ( ( rule__Instruccion__ExpAssignment_0_1 ) )
            {
            // InternalCocinita.g:885:1: ( ( rule__Instruccion__ExpAssignment_0_1 ) )
            // InternalCocinita.g:886:2: ( rule__Instruccion__ExpAssignment_0_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_0_1()); 
            // InternalCocinita.g:887:2: ( rule__Instruccion__ExpAssignment_0_1 )
            // InternalCocinita.g:887:3: rule__Instruccion__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_0__2"
    // InternalCocinita.g:895:1: rule__Instruccion__Group_0__2 : rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3 ;
    public final void rule__Instruccion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:899:1: ( rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3 )
            // InternalCocinita.g:900:2: rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__2"


    // $ANTLR start "rule__Instruccion__Group_0__2__Impl"
    // InternalCocinita.g:907:1: rule__Instruccion__Group_0__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:911:1: ( ( 'en' ) )
            // InternalCocinita.g:912:1: ( 'en' )
            {
            // InternalCocinita.g:912:1: ( 'en' )
            // InternalCocinita.g:913:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_0_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_0__3"
    // InternalCocinita.g:922:1: rule__Instruccion__Group_0__3 : rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4 ;
    public final void rule__Instruccion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:926:1: ( rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4 )
            // InternalCocinita.g:927:2: rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__3"


    // $ANTLR start "rule__Instruccion__Group_0__3__Impl"
    // InternalCocinita.g:934:1: rule__Instruccion__Group_0__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:938:1: ( ( 'el' ) )
            // InternalCocinita.g:939:1: ( 'el' )
            {
            // InternalCocinita.g:939:1: ( 'el' )
            // InternalCocinita.g:940:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_0_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_0__4"
    // InternalCocinita.g:949:1: rule__Instruccion__Group_0__4 : rule__Instruccion__Group_0__4__Impl ;
    public final void rule__Instruccion__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:953:1: ( rule__Instruccion__Group_0__4__Impl )
            // InternalCocinita.g:954:2: rule__Instruccion__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__4"


    // $ANTLR start "rule__Instruccion__Group_0__4__Impl"
    // InternalCocinita.g:960:1: rule__Instruccion__Group_0__4__Impl : ( ( rule__Instruccion__BowlAssignment_0_4 ) ) ;
    public final void rule__Instruccion__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:964:1: ( ( ( rule__Instruccion__BowlAssignment_0_4 ) ) )
            // InternalCocinita.g:965:1: ( ( rule__Instruccion__BowlAssignment_0_4 ) )
            {
            // InternalCocinita.g:965:1: ( ( rule__Instruccion__BowlAssignment_0_4 ) )
            // InternalCocinita.g:966:2: ( rule__Instruccion__BowlAssignment_0_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_0_4()); 
            // InternalCocinita.g:967:2: ( rule__Instruccion__BowlAssignment_0_4 )
            // InternalCocinita.g:967:3: rule__Instruccion__BowlAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_0__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_1__0"
    // InternalCocinita.g:976:1: rule__Instruccion__Group_1__0 : rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1 ;
    public final void rule__Instruccion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:980:1: ( rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1 )
            // InternalCocinita.g:981:2: rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__0"


    // $ANTLR start "rule__Instruccion__Group_1__0__Impl"
    // InternalCocinita.g:988:1: rule__Instruccion__Group_1__0__Impl : ( 'Licuar' ) ;
    public final void rule__Instruccion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:992:1: ( ( 'Licuar' ) )
            // InternalCocinita.g:993:1: ( 'Licuar' )
            {
            // InternalCocinita.g:993:1: ( 'Licuar' )
            // InternalCocinita.g:994:2: 'Licuar'
            {
             before(grammarAccess.getInstruccionAccess().getLicuarKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getLicuarKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_1__1"
    // InternalCocinita.g:1003:1: rule__Instruccion__Group_1__1 : rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2 ;
    public final void rule__Instruccion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1007:1: ( rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2 )
            // InternalCocinita.g:1008:2: rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__1"


    // $ANTLR start "rule__Instruccion__Group_1__1__Impl"
    // InternalCocinita.g:1015:1: rule__Instruccion__Group_1__1__Impl : ( ( rule__Instruccion__ExpAssignment_1_1 ) ) ;
    public final void rule__Instruccion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1019:1: ( ( ( rule__Instruccion__ExpAssignment_1_1 ) ) )
            // InternalCocinita.g:1020:1: ( ( rule__Instruccion__ExpAssignment_1_1 ) )
            {
            // InternalCocinita.g:1020:1: ( ( rule__Instruccion__ExpAssignment_1_1 ) )
            // InternalCocinita.g:1021:2: ( rule__Instruccion__ExpAssignment_1_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_1_1()); 
            // InternalCocinita.g:1022:2: ( rule__Instruccion__ExpAssignment_1_1 )
            // InternalCocinita.g:1022:3: rule__Instruccion__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_1__2"
    // InternalCocinita.g:1030:1: rule__Instruccion__Group_1__2 : rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3 ;
    public final void rule__Instruccion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1034:1: ( rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3 )
            // InternalCocinita.g:1035:2: rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__2"


    // $ANTLR start "rule__Instruccion__Group_1__2__Impl"
    // InternalCocinita.g:1042:1: rule__Instruccion__Group_1__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1046:1: ( ( 'en' ) )
            // InternalCocinita.g:1047:1: ( 'en' )
            {
            // InternalCocinita.g:1047:1: ( 'en' )
            // InternalCocinita.g:1048:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_1__3"
    // InternalCocinita.g:1057:1: rule__Instruccion__Group_1__3 : rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4 ;
    public final void rule__Instruccion__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1061:1: ( rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4 )
            // InternalCocinita.g:1062:2: rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__3"


    // $ANTLR start "rule__Instruccion__Group_1__3__Impl"
    // InternalCocinita.g:1069:1: rule__Instruccion__Group_1__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1073:1: ( ( 'el' ) )
            // InternalCocinita.g:1074:1: ( 'el' )
            {
            // InternalCocinita.g:1074:1: ( 'el' )
            // InternalCocinita.g:1075:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_1_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_1__4"
    // InternalCocinita.g:1084:1: rule__Instruccion__Group_1__4 : rule__Instruccion__Group_1__4__Impl ;
    public final void rule__Instruccion__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1088:1: ( rule__Instruccion__Group_1__4__Impl )
            // InternalCocinita.g:1089:2: rule__Instruccion__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__4"


    // $ANTLR start "rule__Instruccion__Group_1__4__Impl"
    // InternalCocinita.g:1095:1: rule__Instruccion__Group_1__4__Impl : ( ( rule__Instruccion__BowlAssignment_1_4 ) ) ;
    public final void rule__Instruccion__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1099:1: ( ( ( rule__Instruccion__BowlAssignment_1_4 ) ) )
            // InternalCocinita.g:1100:1: ( ( rule__Instruccion__BowlAssignment_1_4 ) )
            {
            // InternalCocinita.g:1100:1: ( ( rule__Instruccion__BowlAssignment_1_4 ) )
            // InternalCocinita.g:1101:2: ( rule__Instruccion__BowlAssignment_1_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_1_4()); 
            // InternalCocinita.g:1102:2: ( rule__Instruccion__BowlAssignment_1_4 )
            // InternalCocinita.g:1102:3: rule__Instruccion__BowlAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_1__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_2__0"
    // InternalCocinita.g:1111:1: rule__Instruccion__Group_2__0 : rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1 ;
    public final void rule__Instruccion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1115:1: ( rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1 )
            // InternalCocinita.g:1116:2: rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__0"


    // $ANTLR start "rule__Instruccion__Group_2__0__Impl"
    // InternalCocinita.g:1123:1: rule__Instruccion__Group_2__0__Impl : ( 'Hornear' ) ;
    public final void rule__Instruccion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1127:1: ( ( 'Hornear' ) )
            // InternalCocinita.g:1128:1: ( 'Hornear' )
            {
            // InternalCocinita.g:1128:1: ( 'Hornear' )
            // InternalCocinita.g:1129:2: 'Hornear'
            {
             before(grammarAccess.getInstruccionAccess().getHornearKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getHornearKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_2__1"
    // InternalCocinita.g:1138:1: rule__Instruccion__Group_2__1 : rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2 ;
    public final void rule__Instruccion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1142:1: ( rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2 )
            // InternalCocinita.g:1143:2: rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__1"


    // $ANTLR start "rule__Instruccion__Group_2__1__Impl"
    // InternalCocinita.g:1150:1: rule__Instruccion__Group_2__1__Impl : ( ( rule__Instruccion__ExpAssignment_2_1 ) ) ;
    public final void rule__Instruccion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1154:1: ( ( ( rule__Instruccion__ExpAssignment_2_1 ) ) )
            // InternalCocinita.g:1155:1: ( ( rule__Instruccion__ExpAssignment_2_1 ) )
            {
            // InternalCocinita.g:1155:1: ( ( rule__Instruccion__ExpAssignment_2_1 ) )
            // InternalCocinita.g:1156:2: ( rule__Instruccion__ExpAssignment_2_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_2_1()); 
            // InternalCocinita.g:1157:2: ( rule__Instruccion__ExpAssignment_2_1 )
            // InternalCocinita.g:1157:3: rule__Instruccion__ExpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_2__2"
    // InternalCocinita.g:1165:1: rule__Instruccion__Group_2__2 : rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3 ;
    public final void rule__Instruccion__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1169:1: ( rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3 )
            // InternalCocinita.g:1170:2: rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__2"


    // $ANTLR start "rule__Instruccion__Group_2__2__Impl"
    // InternalCocinita.g:1177:1: rule__Instruccion__Group_2__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1181:1: ( ( 'en' ) )
            // InternalCocinita.g:1182:1: ( 'en' )
            {
            // InternalCocinita.g:1182:1: ( 'en' )
            // InternalCocinita.g:1183:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_2__3"
    // InternalCocinita.g:1192:1: rule__Instruccion__Group_2__3 : rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4 ;
    public final void rule__Instruccion__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1196:1: ( rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4 )
            // InternalCocinita.g:1197:2: rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__3"


    // $ANTLR start "rule__Instruccion__Group_2__3__Impl"
    // InternalCocinita.g:1204:1: rule__Instruccion__Group_2__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1208:1: ( ( 'el' ) )
            // InternalCocinita.g:1209:1: ( 'el' )
            {
            // InternalCocinita.g:1209:1: ( 'el' )
            // InternalCocinita.g:1210:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_2_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_2__4"
    // InternalCocinita.g:1219:1: rule__Instruccion__Group_2__4 : rule__Instruccion__Group_2__4__Impl ;
    public final void rule__Instruccion__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1223:1: ( rule__Instruccion__Group_2__4__Impl )
            // InternalCocinita.g:1224:2: rule__Instruccion__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__4"


    // $ANTLR start "rule__Instruccion__Group_2__4__Impl"
    // InternalCocinita.g:1230:1: rule__Instruccion__Group_2__4__Impl : ( ( rule__Instruccion__BowlAssignment_2_4 ) ) ;
    public final void rule__Instruccion__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1234:1: ( ( ( rule__Instruccion__BowlAssignment_2_4 ) ) )
            // InternalCocinita.g:1235:1: ( ( rule__Instruccion__BowlAssignment_2_4 ) )
            {
            // InternalCocinita.g:1235:1: ( ( rule__Instruccion__BowlAssignment_2_4 ) )
            // InternalCocinita.g:1236:2: ( rule__Instruccion__BowlAssignment_2_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_2_4()); 
            // InternalCocinita.g:1237:2: ( rule__Instruccion__BowlAssignment_2_4 )
            // InternalCocinita.g:1237:3: rule__Instruccion__BowlAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_2__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_3__0"
    // InternalCocinita.g:1246:1: rule__Instruccion__Group_3__0 : rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1 ;
    public final void rule__Instruccion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1250:1: ( rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1 )
            // InternalCocinita.g:1251:2: rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__0"


    // $ANTLR start "rule__Instruccion__Group_3__0__Impl"
    // InternalCocinita.g:1258:1: rule__Instruccion__Group_3__0__Impl : ( 'Refrigerar' ) ;
    public final void rule__Instruccion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1262:1: ( ( 'Refrigerar' ) )
            // InternalCocinita.g:1263:1: ( 'Refrigerar' )
            {
            // InternalCocinita.g:1263:1: ( 'Refrigerar' )
            // InternalCocinita.g:1264:2: 'Refrigerar'
            {
             before(grammarAccess.getInstruccionAccess().getRefrigerarKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getRefrigerarKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_3__1"
    // InternalCocinita.g:1273:1: rule__Instruccion__Group_3__1 : rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2 ;
    public final void rule__Instruccion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1277:1: ( rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2 )
            // InternalCocinita.g:1278:2: rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__1"


    // $ANTLR start "rule__Instruccion__Group_3__1__Impl"
    // InternalCocinita.g:1285:1: rule__Instruccion__Group_3__1__Impl : ( ( rule__Instruccion__ExpAssignment_3_1 ) ) ;
    public final void rule__Instruccion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1289:1: ( ( ( rule__Instruccion__ExpAssignment_3_1 ) ) )
            // InternalCocinita.g:1290:1: ( ( rule__Instruccion__ExpAssignment_3_1 ) )
            {
            // InternalCocinita.g:1290:1: ( ( rule__Instruccion__ExpAssignment_3_1 ) )
            // InternalCocinita.g:1291:2: ( rule__Instruccion__ExpAssignment_3_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_3_1()); 
            // InternalCocinita.g:1292:2: ( rule__Instruccion__ExpAssignment_3_1 )
            // InternalCocinita.g:1292:3: rule__Instruccion__ExpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_3__2"
    // InternalCocinita.g:1300:1: rule__Instruccion__Group_3__2 : rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3 ;
    public final void rule__Instruccion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1304:1: ( rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3 )
            // InternalCocinita.g:1305:2: rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__2"


    // $ANTLR start "rule__Instruccion__Group_3__2__Impl"
    // InternalCocinita.g:1312:1: rule__Instruccion__Group_3__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1316:1: ( ( 'en' ) )
            // InternalCocinita.g:1317:1: ( 'en' )
            {
            // InternalCocinita.g:1317:1: ( 'en' )
            // InternalCocinita.g:1318:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_3_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_3__3"
    // InternalCocinita.g:1327:1: rule__Instruccion__Group_3__3 : rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4 ;
    public final void rule__Instruccion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1331:1: ( rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4 )
            // InternalCocinita.g:1332:2: rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__3"


    // $ANTLR start "rule__Instruccion__Group_3__3__Impl"
    // InternalCocinita.g:1339:1: rule__Instruccion__Group_3__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1343:1: ( ( 'el' ) )
            // InternalCocinita.g:1344:1: ( 'el' )
            {
            // InternalCocinita.g:1344:1: ( 'el' )
            // InternalCocinita.g:1345:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_3_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_3__4"
    // InternalCocinita.g:1354:1: rule__Instruccion__Group_3__4 : rule__Instruccion__Group_3__4__Impl ;
    public final void rule__Instruccion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1358:1: ( rule__Instruccion__Group_3__4__Impl )
            // InternalCocinita.g:1359:2: rule__Instruccion__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__4"


    // $ANTLR start "rule__Instruccion__Group_3__4__Impl"
    // InternalCocinita.g:1365:1: rule__Instruccion__Group_3__4__Impl : ( ( rule__Instruccion__BowlAssignment_3_4 ) ) ;
    public final void rule__Instruccion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1369:1: ( ( ( rule__Instruccion__BowlAssignment_3_4 ) ) )
            // InternalCocinita.g:1370:1: ( ( rule__Instruccion__BowlAssignment_3_4 ) )
            {
            // InternalCocinita.g:1370:1: ( ( rule__Instruccion__BowlAssignment_3_4 ) )
            // InternalCocinita.g:1371:2: ( rule__Instruccion__BowlAssignment_3_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_3_4()); 
            // InternalCocinita.g:1372:2: ( rule__Instruccion__BowlAssignment_3_4 )
            // InternalCocinita.g:1372:3: rule__Instruccion__BowlAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_3__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_4__0"
    // InternalCocinita.g:1381:1: rule__Instruccion__Group_4__0 : rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1 ;
    public final void rule__Instruccion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1385:1: ( rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1 )
            // InternalCocinita.g:1386:2: rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__0"


    // $ANTLR start "rule__Instruccion__Group_4__0__Impl"
    // InternalCocinita.g:1393:1: rule__Instruccion__Group_4__0__Impl : ( 'Agregar' ) ;
    public final void rule__Instruccion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1397:1: ( ( 'Agregar' ) )
            // InternalCocinita.g:1398:1: ( 'Agregar' )
            {
            // InternalCocinita.g:1398:1: ( 'Agregar' )
            // InternalCocinita.g:1399:2: 'Agregar'
            {
             before(grammarAccess.getInstruccionAccess().getAgregarKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getAgregarKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_4__1"
    // InternalCocinita.g:1408:1: rule__Instruccion__Group_4__1 : rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2 ;
    public final void rule__Instruccion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1412:1: ( rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2 )
            // InternalCocinita.g:1413:2: rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__1"


    // $ANTLR start "rule__Instruccion__Group_4__1__Impl"
    // InternalCocinita.g:1420:1: rule__Instruccion__Group_4__1__Impl : ( ( rule__Instruccion__ExpAssignment_4_1 ) ) ;
    public final void rule__Instruccion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1424:1: ( ( ( rule__Instruccion__ExpAssignment_4_1 ) ) )
            // InternalCocinita.g:1425:1: ( ( rule__Instruccion__ExpAssignment_4_1 ) )
            {
            // InternalCocinita.g:1425:1: ( ( rule__Instruccion__ExpAssignment_4_1 ) )
            // InternalCocinita.g:1426:2: ( rule__Instruccion__ExpAssignment_4_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_4_1()); 
            // InternalCocinita.g:1427:2: ( rule__Instruccion__ExpAssignment_4_1 )
            // InternalCocinita.g:1427:3: rule__Instruccion__ExpAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_4__2"
    // InternalCocinita.g:1435:1: rule__Instruccion__Group_4__2 : rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3 ;
    public final void rule__Instruccion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1439:1: ( rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3 )
            // InternalCocinita.g:1440:2: rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__2"


    // $ANTLR start "rule__Instruccion__Group_4__2__Impl"
    // InternalCocinita.g:1447:1: rule__Instruccion__Group_4__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1451:1: ( ( 'en' ) )
            // InternalCocinita.g:1452:1: ( 'en' )
            {
            // InternalCocinita.g:1452:1: ( 'en' )
            // InternalCocinita.g:1453:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_4_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_4__3"
    // InternalCocinita.g:1462:1: rule__Instruccion__Group_4__3 : rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4 ;
    public final void rule__Instruccion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1466:1: ( rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4 )
            // InternalCocinita.g:1467:2: rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__3"


    // $ANTLR start "rule__Instruccion__Group_4__3__Impl"
    // InternalCocinita.g:1474:1: rule__Instruccion__Group_4__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1478:1: ( ( 'el' ) )
            // InternalCocinita.g:1479:1: ( 'el' )
            {
            // InternalCocinita.g:1479:1: ( 'el' )
            // InternalCocinita.g:1480:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_4_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_4__4"
    // InternalCocinita.g:1489:1: rule__Instruccion__Group_4__4 : rule__Instruccion__Group_4__4__Impl ;
    public final void rule__Instruccion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1493:1: ( rule__Instruccion__Group_4__4__Impl )
            // InternalCocinita.g:1494:2: rule__Instruccion__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__4"


    // $ANTLR start "rule__Instruccion__Group_4__4__Impl"
    // InternalCocinita.g:1500:1: rule__Instruccion__Group_4__4__Impl : ( ( rule__Instruccion__BowlAssignment_4_4 ) ) ;
    public final void rule__Instruccion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1504:1: ( ( ( rule__Instruccion__BowlAssignment_4_4 ) ) )
            // InternalCocinita.g:1505:1: ( ( rule__Instruccion__BowlAssignment_4_4 ) )
            {
            // InternalCocinita.g:1505:1: ( ( rule__Instruccion__BowlAssignment_4_4 ) )
            // InternalCocinita.g:1506:2: ( rule__Instruccion__BowlAssignment_4_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_4_4()); 
            // InternalCocinita.g:1507:2: ( rule__Instruccion__BowlAssignment_4_4 )
            // InternalCocinita.g:1507:3: rule__Instruccion__BowlAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_4__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_5__0"
    // InternalCocinita.g:1516:1: rule__Instruccion__Group_5__0 : rule__Instruccion__Group_5__0__Impl rule__Instruccion__Group_5__1 ;
    public final void rule__Instruccion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1520:1: ( rule__Instruccion__Group_5__0__Impl rule__Instruccion__Group_5__1 )
            // InternalCocinita.g:1521:2: rule__Instruccion__Group_5__0__Impl rule__Instruccion__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Instruccion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__0"


    // $ANTLR start "rule__Instruccion__Group_5__0__Impl"
    // InternalCocinita.g:1528:1: rule__Instruccion__Group_5__0__Impl : ( 'Tamizar' ) ;
    public final void rule__Instruccion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1532:1: ( ( 'Tamizar' ) )
            // InternalCocinita.g:1533:1: ( 'Tamizar' )
            {
            // InternalCocinita.g:1533:1: ( 'Tamizar' )
            // InternalCocinita.g:1534:2: 'Tamizar'
            {
             before(grammarAccess.getInstruccionAccess().getTamizarKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getTamizarKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_5__1"
    // InternalCocinita.g:1543:1: rule__Instruccion__Group_5__1 : rule__Instruccion__Group_5__1__Impl rule__Instruccion__Group_5__2 ;
    public final void rule__Instruccion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1547:1: ( rule__Instruccion__Group_5__1__Impl rule__Instruccion__Group_5__2 )
            // InternalCocinita.g:1548:2: rule__Instruccion__Group_5__1__Impl rule__Instruccion__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Instruccion__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__1"


    // $ANTLR start "rule__Instruccion__Group_5__1__Impl"
    // InternalCocinita.g:1555:1: rule__Instruccion__Group_5__1__Impl : ( ( rule__Instruccion__ExpAssignment_5_1 ) ) ;
    public final void rule__Instruccion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1559:1: ( ( ( rule__Instruccion__ExpAssignment_5_1 ) ) )
            // InternalCocinita.g:1560:1: ( ( rule__Instruccion__ExpAssignment_5_1 ) )
            {
            // InternalCocinita.g:1560:1: ( ( rule__Instruccion__ExpAssignment_5_1 ) )
            // InternalCocinita.g:1561:2: ( rule__Instruccion__ExpAssignment_5_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_5_1()); 
            // InternalCocinita.g:1562:2: ( rule__Instruccion__ExpAssignment_5_1 )
            // InternalCocinita.g:1562:3: rule__Instruccion__ExpAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__ExpAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getExpAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__1__Impl"


    // $ANTLR start "rule__Instruccion__Group_5__2"
    // InternalCocinita.g:1570:1: rule__Instruccion__Group_5__2 : rule__Instruccion__Group_5__2__Impl rule__Instruccion__Group_5__3 ;
    public final void rule__Instruccion__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1574:1: ( rule__Instruccion__Group_5__2__Impl rule__Instruccion__Group_5__3 )
            // InternalCocinita.g:1575:2: rule__Instruccion__Group_5__2__Impl rule__Instruccion__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__Instruccion__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__2"


    // $ANTLR start "rule__Instruccion__Group_5__2__Impl"
    // InternalCocinita.g:1582:1: rule__Instruccion__Group_5__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1586:1: ( ( 'en' ) )
            // InternalCocinita.g:1587:1: ( 'en' )
            {
            // InternalCocinita.g:1587:1: ( 'en' )
            // InternalCocinita.g:1588:2: 'en'
            {
             before(grammarAccess.getInstruccionAccess().getEnKeyword_5_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getEnKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__2__Impl"


    // $ANTLR start "rule__Instruccion__Group_5__3"
    // InternalCocinita.g:1597:1: rule__Instruccion__Group_5__3 : rule__Instruccion__Group_5__3__Impl rule__Instruccion__Group_5__4 ;
    public final void rule__Instruccion__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1601:1: ( rule__Instruccion__Group_5__3__Impl rule__Instruccion__Group_5__4 )
            // InternalCocinita.g:1602:2: rule__Instruccion__Group_5__3__Impl rule__Instruccion__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__3"


    // $ANTLR start "rule__Instruccion__Group_5__3__Impl"
    // InternalCocinita.g:1609:1: rule__Instruccion__Group_5__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1613:1: ( ( 'el' ) )
            // InternalCocinita.g:1614:1: ( 'el' )
            {
            // InternalCocinita.g:1614:1: ( 'el' )
            // InternalCocinita.g:1615:2: 'el'
            {
             before(grammarAccess.getInstruccionAccess().getElKeyword_5_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getElKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__3__Impl"


    // $ANTLR start "rule__Instruccion__Group_5__4"
    // InternalCocinita.g:1624:1: rule__Instruccion__Group_5__4 : rule__Instruccion__Group_5__4__Impl ;
    public final void rule__Instruccion__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1628:1: ( rule__Instruccion__Group_5__4__Impl )
            // InternalCocinita.g:1629:2: rule__Instruccion__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__4"


    // $ANTLR start "rule__Instruccion__Group_5__4__Impl"
    // InternalCocinita.g:1635:1: rule__Instruccion__Group_5__4__Impl : ( ( rule__Instruccion__BowlAssignment_5_4 ) ) ;
    public final void rule__Instruccion__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1639:1: ( ( ( rule__Instruccion__BowlAssignment_5_4 ) ) )
            // InternalCocinita.g:1640:1: ( ( rule__Instruccion__BowlAssignment_5_4 ) )
            {
            // InternalCocinita.g:1640:1: ( ( rule__Instruccion__BowlAssignment_5_4 ) )
            // InternalCocinita.g:1641:2: ( rule__Instruccion__BowlAssignment_5_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_5_4()); 
            // InternalCocinita.g:1642:2: ( rule__Instruccion__BowlAssignment_5_4 )
            // InternalCocinita.g:1642:3: rule__Instruccion__BowlAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_5__4__Impl"


    // $ANTLR start "rule__Instruccion__Group_6__0"
    // InternalCocinita.g:1651:1: rule__Instruccion__Group_6__0 : rule__Instruccion__Group_6__0__Impl rule__Instruccion__Group_6__1 ;
    public final void rule__Instruccion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1655:1: ( rule__Instruccion__Group_6__0__Impl rule__Instruccion__Group_6__1 )
            // InternalCocinita.g:1656:2: rule__Instruccion__Group_6__0__Impl rule__Instruccion__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Instruccion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_6__0"


    // $ANTLR start "rule__Instruccion__Group_6__0__Impl"
    // InternalCocinita.g:1663:1: rule__Instruccion__Group_6__0__Impl : ( 'Vertir' ) ;
    public final void rule__Instruccion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1667:1: ( ( 'Vertir' ) )
            // InternalCocinita.g:1668:1: ( 'Vertir' )
            {
            // InternalCocinita.g:1668:1: ( 'Vertir' )
            // InternalCocinita.g:1669:2: 'Vertir'
            {
             before(grammarAccess.getInstruccionAccess().getVertirKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getVertirKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_6__0__Impl"


    // $ANTLR start "rule__Instruccion__Group_6__1"
    // InternalCocinita.g:1678:1: rule__Instruccion__Group_6__1 : rule__Instruccion__Group_6__1__Impl ;
    public final void rule__Instruccion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1682:1: ( rule__Instruccion__Group_6__1__Impl )
            // InternalCocinita.g:1683:2: rule__Instruccion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_6__1"


    // $ANTLR start "rule__Instruccion__Group_6__1__Impl"
    // InternalCocinita.g:1689:1: rule__Instruccion__Group_6__1__Impl : ( ( rule__Instruccion__BowlAssignment_6_1 ) ) ;
    public final void rule__Instruccion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1693:1: ( ( ( rule__Instruccion__BowlAssignment_6_1 ) ) )
            // InternalCocinita.g:1694:1: ( ( rule__Instruccion__BowlAssignment_6_1 ) )
            {
            // InternalCocinita.g:1694:1: ( ( rule__Instruccion__BowlAssignment_6_1 ) )
            // InternalCocinita.g:1695:2: ( rule__Instruccion__BowlAssignment_6_1 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_6_1()); 
            // InternalCocinita.g:1696:2: ( rule__Instruccion__BowlAssignment_6_1 )
            // InternalCocinita.g:1696:3: rule__Instruccion__BowlAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__BowlAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getBowlAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__Group_6__1__Impl"


    // $ANTLR start "rule__Cocina__NameAssignment_1"
    // InternalCocinita.g:1705:1: rule__Cocina__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cocina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1709:1: ( ( RULE_ID ) )
            // InternalCocinita.g:1710:2: ( RULE_ID )
            {
            // InternalCocinita.g:1710:2: ( RULE_ID )
            // InternalCocinita.g:1711:3: RULE_ID
            {
             before(grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__NameAssignment_1"


    // $ANTLR start "rule__Cocina__ListaIngredientesAssignment_3"
    // InternalCocinita.g:1720:1: rule__Cocina__ListaIngredientesAssignment_3 : ( ruleIngrediente ) ;
    public final void rule__Cocina__ListaIngredientesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1724:1: ( ( ruleIngrediente ) )
            // InternalCocinita.g:1725:2: ( ruleIngrediente )
            {
            // InternalCocinita.g:1725:2: ( ruleIngrediente )
            // InternalCocinita.g:1726:3: ruleIngrediente
            {
             before(grammarAccess.getCocinaAccess().getListaIngredientesIngredienteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getCocinaAccess().getListaIngredientesIngredienteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__ListaIngredientesAssignment_3"


    // $ANTLR start "rule__Cocina__NBowlAssignment_5"
    // InternalCocinita.g:1735:1: rule__Cocina__NBowlAssignment_5 : ( RULE_INT ) ;
    public final void rule__Cocina__NBowlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1739:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1740:2: ( RULE_INT )
            {
            // InternalCocinita.g:1740:2: ( RULE_INT )
            // InternalCocinita.g:1741:3: RULE_INT
            {
             before(grammarAccess.getCocinaAccess().getNBowlINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getNBowlINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__NBowlAssignment_5"


    // $ANTLR start "rule__Cocina__ListaInstruccionesAssignment_8"
    // InternalCocinita.g:1750:1: rule__Cocina__ListaInstruccionesAssignment_8 : ( ruleInstruccion ) ;
    public final void rule__Cocina__ListaInstruccionesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1754:1: ( ( ruleInstruccion ) )
            // InternalCocinita.g:1755:2: ( ruleInstruccion )
            {
            // InternalCocinita.g:1755:2: ( ruleInstruccion )
            // InternalCocinita.g:1756:3: ruleInstruccion
            {
             before(grammarAccess.getCocinaAccess().getListaInstruccionesInstruccionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruccion();

            state._fsp--;

             after(grammarAccess.getCocinaAccess().getListaInstruccionesInstruccionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__ListaInstruccionesAssignment_8"


    // $ANTLR start "rule__Cocina__BowlAssignment_9_1"
    // InternalCocinita.g:1765:1: rule__Cocina__BowlAssignment_9_1 : ( ruleBowl ) ;
    public final void rule__Cocina__BowlAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1769:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1770:2: ( ruleBowl )
            {
            // InternalCocinita.g:1770:2: ( ruleBowl )
            // InternalCocinita.g:1771:3: ruleBowl
            {
             before(grammarAccess.getCocinaAccess().getBowlBowlParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getCocinaAccess().getBowlBowlParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cocina__BowlAssignment_9_1"


    // $ANTLR start "rule__Ingrediente__AsciiAssignment_0"
    // InternalCocinita.g:1780:1: rule__Ingrediente__AsciiAssignment_0 : ( RULE_INT ) ;
    public final void rule__Ingrediente__AsciiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1784:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1785:2: ( RULE_INT )
            {
            // InternalCocinita.g:1785:2: ( RULE_INT )
            // InternalCocinita.g:1786:3: RULE_INT
            {
             before(grammarAccess.getIngredienteAccess().getAsciiINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getAsciiINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__AsciiAssignment_0"


    // $ANTLR start "rule__Ingrediente__TipoAssignment_1"
    // InternalCocinita.g:1795:1: rule__Ingrediente__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__Ingrediente__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1799:1: ( ( ruleTipoVariable ) )
            // InternalCocinita.g:1800:2: ( ruleTipoVariable )
            {
            // InternalCocinita.g:1800:2: ( ruleTipoVariable )
            // InternalCocinita.g:1801:3: ruleTipoVariable
            {
             before(grammarAccess.getIngredienteAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getIngredienteAccess().getTipoTipoVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__TipoAssignment_1"


    // $ANTLR start "rule__Ingrediente__NameAssignment_2"
    // InternalCocinita.g:1810:1: rule__Ingrediente__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Ingrediente__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1814:1: ( ( RULE_ID ) )
            // InternalCocinita.g:1815:2: ( RULE_ID )
            {
            // InternalCocinita.g:1815:2: ( RULE_ID )
            // InternalCocinita.g:1816:3: RULE_ID
            {
             before(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__NameAssignment_2"


    // $ANTLR start "rule__Bowl__NumeroAssignment_1"
    // InternalCocinita.g:1825:1: rule__Bowl__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bowl__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1829:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1830:2: ( RULE_INT )
            {
            // InternalCocinita.g:1830:2: ( RULE_INT )
            // InternalCocinita.g:1831:3: RULE_INT
            {
             before(grammarAccess.getBowlAccess().getNumeroINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBowlAccess().getNumeroINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bowl__NumeroAssignment_1"


    // $ANTLR start "rule__Expresion__IngredienteAssignment_0"
    // InternalCocinita.g:1840:1: rule__Expresion__IngredienteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Expresion__IngredienteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1844:1: ( ( ( RULE_ID ) ) )
            // InternalCocinita.g:1845:2: ( ( RULE_ID ) )
            {
            // InternalCocinita.g:1845:2: ( ( RULE_ID ) )
            // InternalCocinita.g:1846:3: ( RULE_ID )
            {
             before(grammarAccess.getExpresionAccess().getIngredienteIngredienteCrossReference_0_0()); 
            // InternalCocinita.g:1847:3: ( RULE_ID )
            // InternalCocinita.g:1848:4: RULE_ID
            {
             before(grammarAccess.getExpresionAccess().getIngredienteIngredienteIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpresionAccess().getIngredienteIngredienteIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getExpresionAccess().getIngredienteIngredienteCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__IngredienteAssignment_0"


    // $ANTLR start "rule__Expresion__BowlAssignment_1"
    // InternalCocinita.g:1859:1: rule__Expresion__BowlAssignment_1 : ( ruleBowl ) ;
    public final void rule__Expresion__BowlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1863:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1864:2: ( ruleBowl )
            {
            // InternalCocinita.g:1864:2: ( ruleBowl )
            // InternalCocinita.g:1865:3: ruleBowl
            {
             before(grammarAccess.getExpresionAccess().getBowlBowlParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getExpresionAccess().getBowlBowlParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__BowlAssignment_1"


    // $ANTLR start "rule__Instruccion__ExpAssignment_0_1"
    // InternalCocinita.g:1874:1: rule__Instruccion__ExpAssignment_0_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1878:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1879:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1879:2: ( ruleExpresion )
            // InternalCocinita.g:1880:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_0_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_0_4"
    // InternalCocinita.g:1889:1: rule__Instruccion__BowlAssignment_0_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1893:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1894:2: ( ruleBowl )
            {
            // InternalCocinita.g:1894:2: ( ruleBowl )
            // InternalCocinita.g:1895:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_0_4"


    // $ANTLR start "rule__Instruccion__ExpAssignment_1_1"
    // InternalCocinita.g:1904:1: rule__Instruccion__ExpAssignment_1_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1908:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1909:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1909:2: ( ruleExpresion )
            // InternalCocinita.g:1910:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_1_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_1_4"
    // InternalCocinita.g:1919:1: rule__Instruccion__BowlAssignment_1_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1923:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1924:2: ( ruleBowl )
            {
            // InternalCocinita.g:1924:2: ( ruleBowl )
            // InternalCocinita.g:1925:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_1_4"


    // $ANTLR start "rule__Instruccion__ExpAssignment_2_1"
    // InternalCocinita.g:1934:1: rule__Instruccion__ExpAssignment_2_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1938:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1939:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1939:2: ( ruleExpresion )
            // InternalCocinita.g:1940:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_2_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_2_4"
    // InternalCocinita.g:1949:1: rule__Instruccion__BowlAssignment_2_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1953:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1954:2: ( ruleBowl )
            {
            // InternalCocinita.g:1954:2: ( ruleBowl )
            // InternalCocinita.g:1955:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_2_4"


    // $ANTLR start "rule__Instruccion__ExpAssignment_3_1"
    // InternalCocinita.g:1964:1: rule__Instruccion__ExpAssignment_3_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1968:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1969:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1969:2: ( ruleExpresion )
            // InternalCocinita.g:1970:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_3_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_3_4"
    // InternalCocinita.g:1979:1: rule__Instruccion__BowlAssignment_3_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1983:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1984:2: ( ruleBowl )
            {
            // InternalCocinita.g:1984:2: ( ruleBowl )
            // InternalCocinita.g:1985:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_3_4"


    // $ANTLR start "rule__Instruccion__ExpAssignment_4_1"
    // InternalCocinita.g:1994:1: rule__Instruccion__ExpAssignment_4_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1998:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1999:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1999:2: ( ruleExpresion )
            // InternalCocinita.g:2000:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_4_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_4_4"
    // InternalCocinita.g:2009:1: rule__Instruccion__BowlAssignment_4_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:2013:1: ( ( ruleBowl ) )
            // InternalCocinita.g:2014:2: ( ruleBowl )
            {
            // InternalCocinita.g:2014:2: ( ruleBowl )
            // InternalCocinita.g:2015:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_4_4"


    // $ANTLR start "rule__Instruccion__ExpAssignment_5_1"
    // InternalCocinita.g:2024:1: rule__Instruccion__ExpAssignment_5_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:2028:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:2029:2: ( ruleExpresion )
            {
            // InternalCocinita.g:2029:2: ( ruleExpresion )
            // InternalCocinita.g:2030:3: ruleExpresion
            {
             before(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getExpExpresionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__ExpAssignment_5_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_5_4"
    // InternalCocinita.g:2039:1: rule__Instruccion__BowlAssignment_5_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:2043:1: ( ( ruleBowl ) )
            // InternalCocinita.g:2044:2: ( ruleBowl )
            {
            // InternalCocinita.g:2044:2: ( ruleBowl )
            // InternalCocinita.g:2045:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_5_4"


    // $ANTLR start "rule__Instruccion__BowlAssignment_6_1"
    // InternalCocinita.g:2054:1: rule__Instruccion__BowlAssignment_6_1 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:2058:1: ( ( ruleBowl ) )
            // InternalCocinita.g:2059:2: ( ruleBowl )
            {
            // InternalCocinita.g:2059:2: ( ruleBowl )
            // InternalCocinita.g:2060:3: ruleBowl
            {
             before(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBowl();

            state._fsp--;

             after(grammarAccess.getInstruccionAccess().getBowlBowlParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruccion__BowlAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000FC880000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000FC800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});

}