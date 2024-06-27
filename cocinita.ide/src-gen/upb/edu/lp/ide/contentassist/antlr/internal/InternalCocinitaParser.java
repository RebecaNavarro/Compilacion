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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[-o]'", "'[cU]'", "'[-O]'", "'[RECIPE]'", "'Ingredientes:'", "'Materiales:'", "'(_).'", "'Procedimiento:'", "'Servir'", "'.'", "'('", "')'", "'Batir'", "'en'", "'el'", "'Licuar'", "'Hornear'", "'Refrigerar'", "'Agregar'"
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


    // $ANTLR start "entryRuleInstruccion"
    // InternalCocinita.g:153:1: entryRuleInstruccion : ruleInstruccion EOF ;
    public final void entryRuleInstruccion() throws RecognitionException {
        try {
            // InternalCocinita.g:154:1: ( ruleInstruccion EOF )
            // InternalCocinita.g:155:1: ruleInstruccion EOF
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
    // InternalCocinita.g:162:1: ruleInstruccion : ( ( rule__Instruccion__Alternatives ) ) ;
    public final void ruleInstruccion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:166:2: ( ( ( rule__Instruccion__Alternatives ) ) )
            // InternalCocinita.g:167:2: ( ( rule__Instruccion__Alternatives ) )
            {
            // InternalCocinita.g:167:2: ( ( rule__Instruccion__Alternatives ) )
            // InternalCocinita.g:168:3: ( rule__Instruccion__Alternatives )
            {
             before(grammarAccess.getInstruccionAccess().getAlternatives()); 
            // InternalCocinita.g:169:3: ( rule__Instruccion__Alternatives )
            // InternalCocinita.g:169:4: rule__Instruccion__Alternatives
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


    // $ANTLR start "entryRuleExpresion"
    // InternalCocinita.g:178:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalCocinita.g:179:1: ( ruleExpresion EOF )
            // InternalCocinita.g:180:1: ruleExpresion EOF
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
    // InternalCocinita.g:187:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:191:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // InternalCocinita.g:192:2: ( ( rule__Expresion__Alternatives ) )
            {
            // InternalCocinita.g:192:2: ( ( rule__Expresion__Alternatives ) )
            // InternalCocinita.g:193:3: ( rule__Expresion__Alternatives )
            {
             before(grammarAccess.getExpresionAccess().getAlternatives()); 
            // InternalCocinita.g:194:3: ( rule__Expresion__Alternatives )
            // InternalCocinita.g:194:4: rule__Expresion__Alternatives
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


    // $ANTLR start "rule__Instruccion__Alternatives"
    // InternalCocinita.g:229:1: rule__Instruccion__Alternatives : ( ( ( rule__Instruccion__Group_0__0 ) ) | ( ( rule__Instruccion__Group_1__0 ) ) | ( ( rule__Instruccion__Group_2__0 ) ) | ( ( rule__Instruccion__Group_3__0 ) ) | ( ( rule__Instruccion__Group_4__0 ) ) );
    public final void rule__Instruccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:233:1: ( ( ( rule__Instruccion__Group_0__0 ) ) | ( ( rule__Instruccion__Group_1__0 ) ) | ( ( rule__Instruccion__Group_2__0 ) ) | ( ( rule__Instruccion__Group_3__0 ) ) | ( ( rule__Instruccion__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCocinita.g:234:2: ( ( rule__Instruccion__Group_0__0 ) )
                    {
                    // InternalCocinita.g:234:2: ( ( rule__Instruccion__Group_0__0 ) )
                    // InternalCocinita.g:235:3: ( rule__Instruccion__Group_0__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_0()); 
                    // InternalCocinita.g:236:3: ( rule__Instruccion__Group_0__0 )
                    // InternalCocinita.g:236:4: rule__Instruccion__Group_0__0
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
                    // InternalCocinita.g:240:2: ( ( rule__Instruccion__Group_1__0 ) )
                    {
                    // InternalCocinita.g:240:2: ( ( rule__Instruccion__Group_1__0 ) )
                    // InternalCocinita.g:241:3: ( rule__Instruccion__Group_1__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_1()); 
                    // InternalCocinita.g:242:3: ( rule__Instruccion__Group_1__0 )
                    // InternalCocinita.g:242:4: rule__Instruccion__Group_1__0
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
                    // InternalCocinita.g:246:2: ( ( rule__Instruccion__Group_2__0 ) )
                    {
                    // InternalCocinita.g:246:2: ( ( rule__Instruccion__Group_2__0 ) )
                    // InternalCocinita.g:247:3: ( rule__Instruccion__Group_2__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_2()); 
                    // InternalCocinita.g:248:3: ( rule__Instruccion__Group_2__0 )
                    // InternalCocinita.g:248:4: rule__Instruccion__Group_2__0
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
                    // InternalCocinita.g:252:2: ( ( rule__Instruccion__Group_3__0 ) )
                    {
                    // InternalCocinita.g:252:2: ( ( rule__Instruccion__Group_3__0 ) )
                    // InternalCocinita.g:253:3: ( rule__Instruccion__Group_3__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_3()); 
                    // InternalCocinita.g:254:3: ( rule__Instruccion__Group_3__0 )
                    // InternalCocinita.g:254:4: rule__Instruccion__Group_3__0
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
                    // InternalCocinita.g:258:2: ( ( rule__Instruccion__Group_4__0 ) )
                    {
                    // InternalCocinita.g:258:2: ( ( rule__Instruccion__Group_4__0 ) )
                    // InternalCocinita.g:259:3: ( rule__Instruccion__Group_4__0 )
                    {
                     before(grammarAccess.getInstruccionAccess().getGroup_4()); 
                    // InternalCocinita.g:260:3: ( rule__Instruccion__Group_4__0 )
                    // InternalCocinita.g:260:4: rule__Instruccion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruccion__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstruccionAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Expresion__Alternatives"
    // InternalCocinita.g:268:1: rule__Expresion__Alternatives : ( ( ( rule__Expresion__IngredienteAssignment_0 ) ) | ( ( rule__Expresion__BowlAssignment_1 ) ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:272:1: ( ( ( rule__Expresion__IngredienteAssignment_0 ) ) | ( ( rule__Expresion__BowlAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCocinita.g:273:2: ( ( rule__Expresion__IngredienteAssignment_0 ) )
                    {
                    // InternalCocinita.g:273:2: ( ( rule__Expresion__IngredienteAssignment_0 ) )
                    // InternalCocinita.g:274:3: ( rule__Expresion__IngredienteAssignment_0 )
                    {
                     before(grammarAccess.getExpresionAccess().getIngredienteAssignment_0()); 
                    // InternalCocinita.g:275:3: ( rule__Expresion__IngredienteAssignment_0 )
                    // InternalCocinita.g:275:4: rule__Expresion__IngredienteAssignment_0
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
                    // InternalCocinita.g:279:2: ( ( rule__Expresion__BowlAssignment_1 ) )
                    {
                    // InternalCocinita.g:279:2: ( ( rule__Expresion__BowlAssignment_1 ) )
                    // InternalCocinita.g:280:3: ( rule__Expresion__BowlAssignment_1 )
                    {
                     before(grammarAccess.getExpresionAccess().getBowlAssignment_1()); 
                    // InternalCocinita.g:281:3: ( rule__Expresion__BowlAssignment_1 )
                    // InternalCocinita.g:281:4: rule__Expresion__BowlAssignment_1
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


    // $ANTLR start "rule__Cocina__Group__0"
    // InternalCocinita.g:289:1: rule__Cocina__Group__0 : rule__Cocina__Group__0__Impl rule__Cocina__Group__1 ;
    public final void rule__Cocina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:293:1: ( rule__Cocina__Group__0__Impl rule__Cocina__Group__1 )
            // InternalCocinita.g:294:2: rule__Cocina__Group__0__Impl rule__Cocina__Group__1
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
    // InternalCocinita.g:301:1: rule__Cocina__Group__0__Impl : ( '[RECIPE]' ) ;
    public final void rule__Cocina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:305:1: ( ( '[RECIPE]' ) )
            // InternalCocinita.g:306:1: ( '[RECIPE]' )
            {
            // InternalCocinita.g:306:1: ( '[RECIPE]' )
            // InternalCocinita.g:307:2: '[RECIPE]'
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
    // InternalCocinita.g:316:1: rule__Cocina__Group__1 : rule__Cocina__Group__1__Impl rule__Cocina__Group__2 ;
    public final void rule__Cocina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:320:1: ( rule__Cocina__Group__1__Impl rule__Cocina__Group__2 )
            // InternalCocinita.g:321:2: rule__Cocina__Group__1__Impl rule__Cocina__Group__2
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
    // InternalCocinita.g:328:1: rule__Cocina__Group__1__Impl : ( ( rule__Cocina__NameAssignment_1 ) ) ;
    public final void rule__Cocina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:332:1: ( ( ( rule__Cocina__NameAssignment_1 ) ) )
            // InternalCocinita.g:333:1: ( ( rule__Cocina__NameAssignment_1 ) )
            {
            // InternalCocinita.g:333:1: ( ( rule__Cocina__NameAssignment_1 ) )
            // InternalCocinita.g:334:2: ( rule__Cocina__NameAssignment_1 )
            {
             before(grammarAccess.getCocinaAccess().getNameAssignment_1()); 
            // InternalCocinita.g:335:2: ( rule__Cocina__NameAssignment_1 )
            // InternalCocinita.g:335:3: rule__Cocina__NameAssignment_1
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
    // InternalCocinita.g:343:1: rule__Cocina__Group__2 : rule__Cocina__Group__2__Impl rule__Cocina__Group__3 ;
    public final void rule__Cocina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:347:1: ( rule__Cocina__Group__2__Impl rule__Cocina__Group__3 )
            // InternalCocinita.g:348:2: rule__Cocina__Group__2__Impl rule__Cocina__Group__3
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
    // InternalCocinita.g:355:1: rule__Cocina__Group__2__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Cocina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:359:1: ( ( 'Ingredientes:' ) )
            // InternalCocinita.g:360:1: ( 'Ingredientes:' )
            {
            // InternalCocinita.g:360:1: ( 'Ingredientes:' )
            // InternalCocinita.g:361:2: 'Ingredientes:'
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
    // InternalCocinita.g:370:1: rule__Cocina__Group__3 : rule__Cocina__Group__3__Impl rule__Cocina__Group__4 ;
    public final void rule__Cocina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:374:1: ( rule__Cocina__Group__3__Impl rule__Cocina__Group__4 )
            // InternalCocinita.g:375:2: rule__Cocina__Group__3__Impl rule__Cocina__Group__4
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
    // InternalCocinita.g:382:1: rule__Cocina__Group__3__Impl : ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) ;
    public final void rule__Cocina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:386:1: ( ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) )
            // InternalCocinita.g:387:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            {
            // InternalCocinita.g:387:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            // InternalCocinita.g:388:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            {
             before(grammarAccess.getCocinaAccess().getListaIngredientesAssignment_3()); 
            // InternalCocinita.g:389:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCocinita.g:389:3: rule__Cocina__ListaIngredientesAssignment_3
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
    // InternalCocinita.g:397:1: rule__Cocina__Group__4 : rule__Cocina__Group__4__Impl rule__Cocina__Group__5 ;
    public final void rule__Cocina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:401:1: ( rule__Cocina__Group__4__Impl rule__Cocina__Group__5 )
            // InternalCocinita.g:402:2: rule__Cocina__Group__4__Impl rule__Cocina__Group__5
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
    // InternalCocinita.g:409:1: rule__Cocina__Group__4__Impl : ( 'Materiales:' ) ;
    public final void rule__Cocina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:413:1: ( ( 'Materiales:' ) )
            // InternalCocinita.g:414:1: ( 'Materiales:' )
            {
            // InternalCocinita.g:414:1: ( 'Materiales:' )
            // InternalCocinita.g:415:2: 'Materiales:'
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
    // InternalCocinita.g:424:1: rule__Cocina__Group__5 : rule__Cocina__Group__5__Impl rule__Cocina__Group__6 ;
    public final void rule__Cocina__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:428:1: ( rule__Cocina__Group__5__Impl rule__Cocina__Group__6 )
            // InternalCocinita.g:429:2: rule__Cocina__Group__5__Impl rule__Cocina__Group__6
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
    // InternalCocinita.g:436:1: rule__Cocina__Group__5__Impl : ( ( rule__Cocina__NBowlAssignment_5 ) ) ;
    public final void rule__Cocina__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:440:1: ( ( ( rule__Cocina__NBowlAssignment_5 ) ) )
            // InternalCocinita.g:441:1: ( ( rule__Cocina__NBowlAssignment_5 ) )
            {
            // InternalCocinita.g:441:1: ( ( rule__Cocina__NBowlAssignment_5 ) )
            // InternalCocinita.g:442:2: ( rule__Cocina__NBowlAssignment_5 )
            {
             before(grammarAccess.getCocinaAccess().getNBowlAssignment_5()); 
            // InternalCocinita.g:443:2: ( rule__Cocina__NBowlAssignment_5 )
            // InternalCocinita.g:443:3: rule__Cocina__NBowlAssignment_5
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
    // InternalCocinita.g:451:1: rule__Cocina__Group__6 : rule__Cocina__Group__6__Impl rule__Cocina__Group__7 ;
    public final void rule__Cocina__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:455:1: ( rule__Cocina__Group__6__Impl rule__Cocina__Group__7 )
            // InternalCocinita.g:456:2: rule__Cocina__Group__6__Impl rule__Cocina__Group__7
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
    // InternalCocinita.g:463:1: rule__Cocina__Group__6__Impl : ( '(_).' ) ;
    public final void rule__Cocina__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:467:1: ( ( '(_).' ) )
            // InternalCocinita.g:468:1: ( '(_).' )
            {
            // InternalCocinita.g:468:1: ( '(_).' )
            // InternalCocinita.g:469:2: '(_).'
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
    // InternalCocinita.g:478:1: rule__Cocina__Group__7 : rule__Cocina__Group__7__Impl rule__Cocina__Group__8 ;
    public final void rule__Cocina__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:482:1: ( rule__Cocina__Group__7__Impl rule__Cocina__Group__8 )
            // InternalCocinita.g:483:2: rule__Cocina__Group__7__Impl rule__Cocina__Group__8
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
    // InternalCocinita.g:490:1: rule__Cocina__Group__7__Impl : ( 'Procedimiento:' ) ;
    public final void rule__Cocina__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:494:1: ( ( 'Procedimiento:' ) )
            // InternalCocinita.g:495:1: ( 'Procedimiento:' )
            {
            // InternalCocinita.g:495:1: ( 'Procedimiento:' )
            // InternalCocinita.g:496:2: 'Procedimiento:'
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
    // InternalCocinita.g:505:1: rule__Cocina__Group__8 : rule__Cocina__Group__8__Impl rule__Cocina__Group__9 ;
    public final void rule__Cocina__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:509:1: ( rule__Cocina__Group__8__Impl rule__Cocina__Group__9 )
            // InternalCocinita.g:510:2: rule__Cocina__Group__8__Impl rule__Cocina__Group__9
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
    // InternalCocinita.g:517:1: rule__Cocina__Group__8__Impl : ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* ) ;
    public final void rule__Cocina__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:521:1: ( ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* ) )
            // InternalCocinita.g:522:1: ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* )
            {
            // InternalCocinita.g:522:1: ( ( rule__Cocina__ListaInstruccionesAssignment_8 )* )
            // InternalCocinita.g:523:2: ( rule__Cocina__ListaInstruccionesAssignment_8 )*
            {
             before(grammarAccess.getCocinaAccess().getListaInstruccionesAssignment_8()); 
            // InternalCocinita.g:524:2: ( rule__Cocina__ListaInstruccionesAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23||(LA5_0>=26 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCocinita.g:524:3: rule__Cocina__ListaInstruccionesAssignment_8
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
    // InternalCocinita.g:532:1: rule__Cocina__Group__9 : rule__Cocina__Group__9__Impl ;
    public final void rule__Cocina__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:536:1: ( rule__Cocina__Group__9__Impl )
            // InternalCocinita.g:537:2: rule__Cocina__Group__9__Impl
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
    // InternalCocinita.g:543:1: rule__Cocina__Group__9__Impl : ( ( rule__Cocina__Group_9__0 )* ) ;
    public final void rule__Cocina__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:547:1: ( ( ( rule__Cocina__Group_9__0 )* ) )
            // InternalCocinita.g:548:1: ( ( rule__Cocina__Group_9__0 )* )
            {
            // InternalCocinita.g:548:1: ( ( rule__Cocina__Group_9__0 )* )
            // InternalCocinita.g:549:2: ( rule__Cocina__Group_9__0 )*
            {
             before(grammarAccess.getCocinaAccess().getGroup_9()); 
            // InternalCocinita.g:550:2: ( rule__Cocina__Group_9__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCocinita.g:550:3: rule__Cocina__Group_9__0
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
    // InternalCocinita.g:559:1: rule__Cocina__Group_9__0 : rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1 ;
    public final void rule__Cocina__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:563:1: ( rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1 )
            // InternalCocinita.g:564:2: rule__Cocina__Group_9__0__Impl rule__Cocina__Group_9__1
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
    // InternalCocinita.g:571:1: rule__Cocina__Group_9__0__Impl : ( 'Servir' ) ;
    public final void rule__Cocina__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:575:1: ( ( 'Servir' ) )
            // InternalCocinita.g:576:1: ( 'Servir' )
            {
            // InternalCocinita.g:576:1: ( 'Servir' )
            // InternalCocinita.g:577:2: 'Servir'
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
    // InternalCocinita.g:586:1: rule__Cocina__Group_9__1 : rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2 ;
    public final void rule__Cocina__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:590:1: ( rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2 )
            // InternalCocinita.g:591:2: rule__Cocina__Group_9__1__Impl rule__Cocina__Group_9__2
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
    // InternalCocinita.g:598:1: rule__Cocina__Group_9__1__Impl : ( ( rule__Cocina__BowlAssignment_9_1 ) ) ;
    public final void rule__Cocina__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:602:1: ( ( ( rule__Cocina__BowlAssignment_9_1 ) ) )
            // InternalCocinita.g:603:1: ( ( rule__Cocina__BowlAssignment_9_1 ) )
            {
            // InternalCocinita.g:603:1: ( ( rule__Cocina__BowlAssignment_9_1 ) )
            // InternalCocinita.g:604:2: ( rule__Cocina__BowlAssignment_9_1 )
            {
             before(grammarAccess.getCocinaAccess().getBowlAssignment_9_1()); 
            // InternalCocinita.g:605:2: ( rule__Cocina__BowlAssignment_9_1 )
            // InternalCocinita.g:605:3: rule__Cocina__BowlAssignment_9_1
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
    // InternalCocinita.g:613:1: rule__Cocina__Group_9__2 : rule__Cocina__Group_9__2__Impl ;
    public final void rule__Cocina__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:617:1: ( rule__Cocina__Group_9__2__Impl )
            // InternalCocinita.g:618:2: rule__Cocina__Group_9__2__Impl
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
    // InternalCocinita.g:624:1: rule__Cocina__Group_9__2__Impl : ( '.' ) ;
    public final void rule__Cocina__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:628:1: ( ( '.' ) )
            // InternalCocinita.g:629:1: ( '.' )
            {
            // InternalCocinita.g:629:1: ( '.' )
            // InternalCocinita.g:630:2: '.'
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
    // InternalCocinita.g:640:1: rule__Ingrediente__Group__0 : rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 ;
    public final void rule__Ingrediente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:644:1: ( rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 )
            // InternalCocinita.g:645:2: rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1
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
    // InternalCocinita.g:652:1: rule__Ingrediente__Group__0__Impl : ( ( rule__Ingrediente__AsciiAssignment_0 ) ) ;
    public final void rule__Ingrediente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:656:1: ( ( ( rule__Ingrediente__AsciiAssignment_0 ) ) )
            // InternalCocinita.g:657:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            {
            // InternalCocinita.g:657:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            // InternalCocinita.g:658:2: ( rule__Ingrediente__AsciiAssignment_0 )
            {
             before(grammarAccess.getIngredienteAccess().getAsciiAssignment_0()); 
            // InternalCocinita.g:659:2: ( rule__Ingrediente__AsciiAssignment_0 )
            // InternalCocinita.g:659:3: rule__Ingrediente__AsciiAssignment_0
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
    // InternalCocinita.g:667:1: rule__Ingrediente__Group__1 : rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 ;
    public final void rule__Ingrediente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:671:1: ( rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 )
            // InternalCocinita.g:672:2: rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2
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
    // InternalCocinita.g:679:1: rule__Ingrediente__Group__1__Impl : ( ( rule__Ingrediente__TipoAssignment_1 ) ) ;
    public final void rule__Ingrediente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:683:1: ( ( ( rule__Ingrediente__TipoAssignment_1 ) ) )
            // InternalCocinita.g:684:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            {
            // InternalCocinita.g:684:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            // InternalCocinita.g:685:2: ( rule__Ingrediente__TipoAssignment_1 )
            {
             before(grammarAccess.getIngredienteAccess().getTipoAssignment_1()); 
            // InternalCocinita.g:686:2: ( rule__Ingrediente__TipoAssignment_1 )
            // InternalCocinita.g:686:3: rule__Ingrediente__TipoAssignment_1
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
    // InternalCocinita.g:694:1: rule__Ingrediente__Group__2 : rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 ;
    public final void rule__Ingrediente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:698:1: ( rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 )
            // InternalCocinita.g:699:2: rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3
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
    // InternalCocinita.g:706:1: rule__Ingrediente__Group__2__Impl : ( ( rule__Ingrediente__NameAssignment_2 ) ) ;
    public final void rule__Ingrediente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:710:1: ( ( ( rule__Ingrediente__NameAssignment_2 ) ) )
            // InternalCocinita.g:711:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            {
            // InternalCocinita.g:711:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            // InternalCocinita.g:712:2: ( rule__Ingrediente__NameAssignment_2 )
            {
             before(grammarAccess.getIngredienteAccess().getNameAssignment_2()); 
            // InternalCocinita.g:713:2: ( rule__Ingrediente__NameAssignment_2 )
            // InternalCocinita.g:713:3: rule__Ingrediente__NameAssignment_2
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
    // InternalCocinita.g:721:1: rule__Ingrediente__Group__3 : rule__Ingrediente__Group__3__Impl ;
    public final void rule__Ingrediente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:725:1: ( rule__Ingrediente__Group__3__Impl )
            // InternalCocinita.g:726:2: rule__Ingrediente__Group__3__Impl
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
    // InternalCocinita.g:732:1: rule__Ingrediente__Group__3__Impl : ( '.' ) ;
    public final void rule__Ingrediente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:736:1: ( ( '.' ) )
            // InternalCocinita.g:737:1: ( '.' )
            {
            // InternalCocinita.g:737:1: ( '.' )
            // InternalCocinita.g:738:2: '.'
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
    // InternalCocinita.g:748:1: rule__Bowl__Group__0 : rule__Bowl__Group__0__Impl rule__Bowl__Group__1 ;
    public final void rule__Bowl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:752:1: ( rule__Bowl__Group__0__Impl rule__Bowl__Group__1 )
            // InternalCocinita.g:753:2: rule__Bowl__Group__0__Impl rule__Bowl__Group__1
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
    // InternalCocinita.g:760:1: rule__Bowl__Group__0__Impl : ( '(' ) ;
    public final void rule__Bowl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:764:1: ( ( '(' ) )
            // InternalCocinita.g:765:1: ( '(' )
            {
            // InternalCocinita.g:765:1: ( '(' )
            // InternalCocinita.g:766:2: '('
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
    // InternalCocinita.g:775:1: rule__Bowl__Group__1 : rule__Bowl__Group__1__Impl rule__Bowl__Group__2 ;
    public final void rule__Bowl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:779:1: ( rule__Bowl__Group__1__Impl rule__Bowl__Group__2 )
            // InternalCocinita.g:780:2: rule__Bowl__Group__1__Impl rule__Bowl__Group__2
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
    // InternalCocinita.g:787:1: rule__Bowl__Group__1__Impl : ( ( rule__Bowl__NumeroAssignment_1 ) ) ;
    public final void rule__Bowl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:791:1: ( ( ( rule__Bowl__NumeroAssignment_1 ) ) )
            // InternalCocinita.g:792:1: ( ( rule__Bowl__NumeroAssignment_1 ) )
            {
            // InternalCocinita.g:792:1: ( ( rule__Bowl__NumeroAssignment_1 ) )
            // InternalCocinita.g:793:2: ( rule__Bowl__NumeroAssignment_1 )
            {
             before(grammarAccess.getBowlAccess().getNumeroAssignment_1()); 
            // InternalCocinita.g:794:2: ( rule__Bowl__NumeroAssignment_1 )
            // InternalCocinita.g:794:3: rule__Bowl__NumeroAssignment_1
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
    // InternalCocinita.g:802:1: rule__Bowl__Group__2 : rule__Bowl__Group__2__Impl ;
    public final void rule__Bowl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:806:1: ( rule__Bowl__Group__2__Impl )
            // InternalCocinita.g:807:2: rule__Bowl__Group__2__Impl
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
    // InternalCocinita.g:813:1: rule__Bowl__Group__2__Impl : ( ')' ) ;
    public final void rule__Bowl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:817:1: ( ( ')' ) )
            // InternalCocinita.g:818:1: ( ')' )
            {
            // InternalCocinita.g:818:1: ( ')' )
            // InternalCocinita.g:819:2: ')'
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
    // InternalCocinita.g:829:1: rule__Instruccion__Group_0__0 : rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1 ;
    public final void rule__Instruccion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:833:1: ( rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1 )
            // InternalCocinita.g:834:2: rule__Instruccion__Group_0__0__Impl rule__Instruccion__Group_0__1
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
    // InternalCocinita.g:841:1: rule__Instruccion__Group_0__0__Impl : ( 'Batir' ) ;
    public final void rule__Instruccion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:845:1: ( ( 'Batir' ) )
            // InternalCocinita.g:846:1: ( 'Batir' )
            {
            // InternalCocinita.g:846:1: ( 'Batir' )
            // InternalCocinita.g:847:2: 'Batir'
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
    // InternalCocinita.g:856:1: rule__Instruccion__Group_0__1 : rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2 ;
    public final void rule__Instruccion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:860:1: ( rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2 )
            // InternalCocinita.g:861:2: rule__Instruccion__Group_0__1__Impl rule__Instruccion__Group_0__2
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
    // InternalCocinita.g:868:1: rule__Instruccion__Group_0__1__Impl : ( ( rule__Instruccion__ExpAssignment_0_1 ) ) ;
    public final void rule__Instruccion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:872:1: ( ( ( rule__Instruccion__ExpAssignment_0_1 ) ) )
            // InternalCocinita.g:873:1: ( ( rule__Instruccion__ExpAssignment_0_1 ) )
            {
            // InternalCocinita.g:873:1: ( ( rule__Instruccion__ExpAssignment_0_1 ) )
            // InternalCocinita.g:874:2: ( rule__Instruccion__ExpAssignment_0_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_0_1()); 
            // InternalCocinita.g:875:2: ( rule__Instruccion__ExpAssignment_0_1 )
            // InternalCocinita.g:875:3: rule__Instruccion__ExpAssignment_0_1
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
    // InternalCocinita.g:883:1: rule__Instruccion__Group_0__2 : rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3 ;
    public final void rule__Instruccion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:887:1: ( rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3 )
            // InternalCocinita.g:888:2: rule__Instruccion__Group_0__2__Impl rule__Instruccion__Group_0__3
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
    // InternalCocinita.g:895:1: rule__Instruccion__Group_0__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:899:1: ( ( 'en' ) )
            // InternalCocinita.g:900:1: ( 'en' )
            {
            // InternalCocinita.g:900:1: ( 'en' )
            // InternalCocinita.g:901:2: 'en'
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
    // InternalCocinita.g:910:1: rule__Instruccion__Group_0__3 : rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4 ;
    public final void rule__Instruccion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:914:1: ( rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4 )
            // InternalCocinita.g:915:2: rule__Instruccion__Group_0__3__Impl rule__Instruccion__Group_0__4
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
    // InternalCocinita.g:922:1: rule__Instruccion__Group_0__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:926:1: ( ( 'el' ) )
            // InternalCocinita.g:927:1: ( 'el' )
            {
            // InternalCocinita.g:927:1: ( 'el' )
            // InternalCocinita.g:928:2: 'el'
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
    // InternalCocinita.g:937:1: rule__Instruccion__Group_0__4 : rule__Instruccion__Group_0__4__Impl ;
    public final void rule__Instruccion__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:941:1: ( rule__Instruccion__Group_0__4__Impl )
            // InternalCocinita.g:942:2: rule__Instruccion__Group_0__4__Impl
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
    // InternalCocinita.g:948:1: rule__Instruccion__Group_0__4__Impl : ( ( rule__Instruccion__BowlAssignment_0_4 ) ) ;
    public final void rule__Instruccion__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:952:1: ( ( ( rule__Instruccion__BowlAssignment_0_4 ) ) )
            // InternalCocinita.g:953:1: ( ( rule__Instruccion__BowlAssignment_0_4 ) )
            {
            // InternalCocinita.g:953:1: ( ( rule__Instruccion__BowlAssignment_0_4 ) )
            // InternalCocinita.g:954:2: ( rule__Instruccion__BowlAssignment_0_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_0_4()); 
            // InternalCocinita.g:955:2: ( rule__Instruccion__BowlAssignment_0_4 )
            // InternalCocinita.g:955:3: rule__Instruccion__BowlAssignment_0_4
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
    // InternalCocinita.g:964:1: rule__Instruccion__Group_1__0 : rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1 ;
    public final void rule__Instruccion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:968:1: ( rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1 )
            // InternalCocinita.g:969:2: rule__Instruccion__Group_1__0__Impl rule__Instruccion__Group_1__1
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
    // InternalCocinita.g:976:1: rule__Instruccion__Group_1__0__Impl : ( 'Licuar' ) ;
    public final void rule__Instruccion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:980:1: ( ( 'Licuar' ) )
            // InternalCocinita.g:981:1: ( 'Licuar' )
            {
            // InternalCocinita.g:981:1: ( 'Licuar' )
            // InternalCocinita.g:982:2: 'Licuar'
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
    // InternalCocinita.g:991:1: rule__Instruccion__Group_1__1 : rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2 ;
    public final void rule__Instruccion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:995:1: ( rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2 )
            // InternalCocinita.g:996:2: rule__Instruccion__Group_1__1__Impl rule__Instruccion__Group_1__2
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
    // InternalCocinita.g:1003:1: rule__Instruccion__Group_1__1__Impl : ( ( rule__Instruccion__ExpAssignment_1_1 ) ) ;
    public final void rule__Instruccion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1007:1: ( ( ( rule__Instruccion__ExpAssignment_1_1 ) ) )
            // InternalCocinita.g:1008:1: ( ( rule__Instruccion__ExpAssignment_1_1 ) )
            {
            // InternalCocinita.g:1008:1: ( ( rule__Instruccion__ExpAssignment_1_1 ) )
            // InternalCocinita.g:1009:2: ( rule__Instruccion__ExpAssignment_1_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_1_1()); 
            // InternalCocinita.g:1010:2: ( rule__Instruccion__ExpAssignment_1_1 )
            // InternalCocinita.g:1010:3: rule__Instruccion__ExpAssignment_1_1
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
    // InternalCocinita.g:1018:1: rule__Instruccion__Group_1__2 : rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3 ;
    public final void rule__Instruccion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1022:1: ( rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3 )
            // InternalCocinita.g:1023:2: rule__Instruccion__Group_1__2__Impl rule__Instruccion__Group_1__3
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
    // InternalCocinita.g:1030:1: rule__Instruccion__Group_1__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1034:1: ( ( 'en' ) )
            // InternalCocinita.g:1035:1: ( 'en' )
            {
            // InternalCocinita.g:1035:1: ( 'en' )
            // InternalCocinita.g:1036:2: 'en'
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
    // InternalCocinita.g:1045:1: rule__Instruccion__Group_1__3 : rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4 ;
    public final void rule__Instruccion__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1049:1: ( rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4 )
            // InternalCocinita.g:1050:2: rule__Instruccion__Group_1__3__Impl rule__Instruccion__Group_1__4
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
    // InternalCocinita.g:1057:1: rule__Instruccion__Group_1__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1061:1: ( ( 'el' ) )
            // InternalCocinita.g:1062:1: ( 'el' )
            {
            // InternalCocinita.g:1062:1: ( 'el' )
            // InternalCocinita.g:1063:2: 'el'
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
    // InternalCocinita.g:1072:1: rule__Instruccion__Group_1__4 : rule__Instruccion__Group_1__4__Impl ;
    public final void rule__Instruccion__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1076:1: ( rule__Instruccion__Group_1__4__Impl )
            // InternalCocinita.g:1077:2: rule__Instruccion__Group_1__4__Impl
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
    // InternalCocinita.g:1083:1: rule__Instruccion__Group_1__4__Impl : ( ( rule__Instruccion__BowlAssignment_1_4 ) ) ;
    public final void rule__Instruccion__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1087:1: ( ( ( rule__Instruccion__BowlAssignment_1_4 ) ) )
            // InternalCocinita.g:1088:1: ( ( rule__Instruccion__BowlAssignment_1_4 ) )
            {
            // InternalCocinita.g:1088:1: ( ( rule__Instruccion__BowlAssignment_1_4 ) )
            // InternalCocinita.g:1089:2: ( rule__Instruccion__BowlAssignment_1_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_1_4()); 
            // InternalCocinita.g:1090:2: ( rule__Instruccion__BowlAssignment_1_4 )
            // InternalCocinita.g:1090:3: rule__Instruccion__BowlAssignment_1_4
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
    // InternalCocinita.g:1099:1: rule__Instruccion__Group_2__0 : rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1 ;
    public final void rule__Instruccion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1103:1: ( rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1 )
            // InternalCocinita.g:1104:2: rule__Instruccion__Group_2__0__Impl rule__Instruccion__Group_2__1
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
    // InternalCocinita.g:1111:1: rule__Instruccion__Group_2__0__Impl : ( 'Hornear' ) ;
    public final void rule__Instruccion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1115:1: ( ( 'Hornear' ) )
            // InternalCocinita.g:1116:1: ( 'Hornear' )
            {
            // InternalCocinita.g:1116:1: ( 'Hornear' )
            // InternalCocinita.g:1117:2: 'Hornear'
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
    // InternalCocinita.g:1126:1: rule__Instruccion__Group_2__1 : rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2 ;
    public final void rule__Instruccion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1130:1: ( rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2 )
            // InternalCocinita.g:1131:2: rule__Instruccion__Group_2__1__Impl rule__Instruccion__Group_2__2
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
    // InternalCocinita.g:1138:1: rule__Instruccion__Group_2__1__Impl : ( ( rule__Instruccion__ExpAssignment_2_1 ) ) ;
    public final void rule__Instruccion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1142:1: ( ( ( rule__Instruccion__ExpAssignment_2_1 ) ) )
            // InternalCocinita.g:1143:1: ( ( rule__Instruccion__ExpAssignment_2_1 ) )
            {
            // InternalCocinita.g:1143:1: ( ( rule__Instruccion__ExpAssignment_2_1 ) )
            // InternalCocinita.g:1144:2: ( rule__Instruccion__ExpAssignment_2_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_2_1()); 
            // InternalCocinita.g:1145:2: ( rule__Instruccion__ExpAssignment_2_1 )
            // InternalCocinita.g:1145:3: rule__Instruccion__ExpAssignment_2_1
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
    // InternalCocinita.g:1153:1: rule__Instruccion__Group_2__2 : rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3 ;
    public final void rule__Instruccion__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1157:1: ( rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3 )
            // InternalCocinita.g:1158:2: rule__Instruccion__Group_2__2__Impl rule__Instruccion__Group_2__3
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
    // InternalCocinita.g:1165:1: rule__Instruccion__Group_2__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1169:1: ( ( 'en' ) )
            // InternalCocinita.g:1170:1: ( 'en' )
            {
            // InternalCocinita.g:1170:1: ( 'en' )
            // InternalCocinita.g:1171:2: 'en'
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
    // InternalCocinita.g:1180:1: rule__Instruccion__Group_2__3 : rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4 ;
    public final void rule__Instruccion__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1184:1: ( rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4 )
            // InternalCocinita.g:1185:2: rule__Instruccion__Group_2__3__Impl rule__Instruccion__Group_2__4
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
    // InternalCocinita.g:1192:1: rule__Instruccion__Group_2__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1196:1: ( ( 'el' ) )
            // InternalCocinita.g:1197:1: ( 'el' )
            {
            // InternalCocinita.g:1197:1: ( 'el' )
            // InternalCocinita.g:1198:2: 'el'
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
    // InternalCocinita.g:1207:1: rule__Instruccion__Group_2__4 : rule__Instruccion__Group_2__4__Impl ;
    public final void rule__Instruccion__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1211:1: ( rule__Instruccion__Group_2__4__Impl )
            // InternalCocinita.g:1212:2: rule__Instruccion__Group_2__4__Impl
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
    // InternalCocinita.g:1218:1: rule__Instruccion__Group_2__4__Impl : ( ( rule__Instruccion__BowlAssignment_2_4 ) ) ;
    public final void rule__Instruccion__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1222:1: ( ( ( rule__Instruccion__BowlAssignment_2_4 ) ) )
            // InternalCocinita.g:1223:1: ( ( rule__Instruccion__BowlAssignment_2_4 ) )
            {
            // InternalCocinita.g:1223:1: ( ( rule__Instruccion__BowlAssignment_2_4 ) )
            // InternalCocinita.g:1224:2: ( rule__Instruccion__BowlAssignment_2_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_2_4()); 
            // InternalCocinita.g:1225:2: ( rule__Instruccion__BowlAssignment_2_4 )
            // InternalCocinita.g:1225:3: rule__Instruccion__BowlAssignment_2_4
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
    // InternalCocinita.g:1234:1: rule__Instruccion__Group_3__0 : rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1 ;
    public final void rule__Instruccion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1238:1: ( rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1 )
            // InternalCocinita.g:1239:2: rule__Instruccion__Group_3__0__Impl rule__Instruccion__Group_3__1
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
    // InternalCocinita.g:1246:1: rule__Instruccion__Group_3__0__Impl : ( 'Refrigerar' ) ;
    public final void rule__Instruccion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1250:1: ( ( 'Refrigerar' ) )
            // InternalCocinita.g:1251:1: ( 'Refrigerar' )
            {
            // InternalCocinita.g:1251:1: ( 'Refrigerar' )
            // InternalCocinita.g:1252:2: 'Refrigerar'
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
    // InternalCocinita.g:1261:1: rule__Instruccion__Group_3__1 : rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2 ;
    public final void rule__Instruccion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1265:1: ( rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2 )
            // InternalCocinita.g:1266:2: rule__Instruccion__Group_3__1__Impl rule__Instruccion__Group_3__2
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
    // InternalCocinita.g:1273:1: rule__Instruccion__Group_3__1__Impl : ( ( rule__Instruccion__ExpAssignment_3_1 ) ) ;
    public final void rule__Instruccion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1277:1: ( ( ( rule__Instruccion__ExpAssignment_3_1 ) ) )
            // InternalCocinita.g:1278:1: ( ( rule__Instruccion__ExpAssignment_3_1 ) )
            {
            // InternalCocinita.g:1278:1: ( ( rule__Instruccion__ExpAssignment_3_1 ) )
            // InternalCocinita.g:1279:2: ( rule__Instruccion__ExpAssignment_3_1 )
            {
             before(grammarAccess.getInstruccionAccess().getExpAssignment_3_1()); 
            // InternalCocinita.g:1280:2: ( rule__Instruccion__ExpAssignment_3_1 )
            // InternalCocinita.g:1280:3: rule__Instruccion__ExpAssignment_3_1
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
    // InternalCocinita.g:1288:1: rule__Instruccion__Group_3__2 : rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3 ;
    public final void rule__Instruccion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1292:1: ( rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3 )
            // InternalCocinita.g:1293:2: rule__Instruccion__Group_3__2__Impl rule__Instruccion__Group_3__3
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
    // InternalCocinita.g:1300:1: rule__Instruccion__Group_3__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1304:1: ( ( 'en' ) )
            // InternalCocinita.g:1305:1: ( 'en' )
            {
            // InternalCocinita.g:1305:1: ( 'en' )
            // InternalCocinita.g:1306:2: 'en'
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
    // InternalCocinita.g:1315:1: rule__Instruccion__Group_3__3 : rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4 ;
    public final void rule__Instruccion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1319:1: ( rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4 )
            // InternalCocinita.g:1320:2: rule__Instruccion__Group_3__3__Impl rule__Instruccion__Group_3__4
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
    // InternalCocinita.g:1327:1: rule__Instruccion__Group_3__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1331:1: ( ( 'el' ) )
            // InternalCocinita.g:1332:1: ( 'el' )
            {
            // InternalCocinita.g:1332:1: ( 'el' )
            // InternalCocinita.g:1333:2: 'el'
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
    // InternalCocinita.g:1342:1: rule__Instruccion__Group_3__4 : rule__Instruccion__Group_3__4__Impl ;
    public final void rule__Instruccion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1346:1: ( rule__Instruccion__Group_3__4__Impl )
            // InternalCocinita.g:1347:2: rule__Instruccion__Group_3__4__Impl
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
    // InternalCocinita.g:1353:1: rule__Instruccion__Group_3__4__Impl : ( ( rule__Instruccion__BowlAssignment_3_4 ) ) ;
    public final void rule__Instruccion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1357:1: ( ( ( rule__Instruccion__BowlAssignment_3_4 ) ) )
            // InternalCocinita.g:1358:1: ( ( rule__Instruccion__BowlAssignment_3_4 ) )
            {
            // InternalCocinita.g:1358:1: ( ( rule__Instruccion__BowlAssignment_3_4 ) )
            // InternalCocinita.g:1359:2: ( rule__Instruccion__BowlAssignment_3_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_3_4()); 
            // InternalCocinita.g:1360:2: ( rule__Instruccion__BowlAssignment_3_4 )
            // InternalCocinita.g:1360:3: rule__Instruccion__BowlAssignment_3_4
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
    // InternalCocinita.g:1369:1: rule__Instruccion__Group_4__0 : rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1 ;
    public final void rule__Instruccion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1373:1: ( rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1 )
            // InternalCocinita.g:1374:2: rule__Instruccion__Group_4__0__Impl rule__Instruccion__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCocinita.g:1381:1: rule__Instruccion__Group_4__0__Impl : ( 'Agregar' ) ;
    public final void rule__Instruccion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1385:1: ( ( 'Agregar' ) )
            // InternalCocinita.g:1386:1: ( 'Agregar' )
            {
            // InternalCocinita.g:1386:1: ( 'Agregar' )
            // InternalCocinita.g:1387:2: 'Agregar'
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
    // InternalCocinita.g:1396:1: rule__Instruccion__Group_4__1 : rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2 ;
    public final void rule__Instruccion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1400:1: ( rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2 )
            // InternalCocinita.g:1401:2: rule__Instruccion__Group_4__1__Impl rule__Instruccion__Group_4__2
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
    // InternalCocinita.g:1408:1: rule__Instruccion__Group_4__1__Impl : ( ( rule__Instruccion__IngredienteAssignment_4_1 ) ) ;
    public final void rule__Instruccion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1412:1: ( ( ( rule__Instruccion__IngredienteAssignment_4_1 ) ) )
            // InternalCocinita.g:1413:1: ( ( rule__Instruccion__IngredienteAssignment_4_1 ) )
            {
            // InternalCocinita.g:1413:1: ( ( rule__Instruccion__IngredienteAssignment_4_1 ) )
            // InternalCocinita.g:1414:2: ( rule__Instruccion__IngredienteAssignment_4_1 )
            {
             before(grammarAccess.getInstruccionAccess().getIngredienteAssignment_4_1()); 
            // InternalCocinita.g:1415:2: ( rule__Instruccion__IngredienteAssignment_4_1 )
            // InternalCocinita.g:1415:3: rule__Instruccion__IngredienteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Instruccion__IngredienteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInstruccionAccess().getIngredienteAssignment_4_1()); 

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
    // InternalCocinita.g:1423:1: rule__Instruccion__Group_4__2 : rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3 ;
    public final void rule__Instruccion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1427:1: ( rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3 )
            // InternalCocinita.g:1428:2: rule__Instruccion__Group_4__2__Impl rule__Instruccion__Group_4__3
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
    // InternalCocinita.g:1435:1: rule__Instruccion__Group_4__2__Impl : ( 'en' ) ;
    public final void rule__Instruccion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1439:1: ( ( 'en' ) )
            // InternalCocinita.g:1440:1: ( 'en' )
            {
            // InternalCocinita.g:1440:1: ( 'en' )
            // InternalCocinita.g:1441:2: 'en'
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
    // InternalCocinita.g:1450:1: rule__Instruccion__Group_4__3 : rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4 ;
    public final void rule__Instruccion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1454:1: ( rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4 )
            // InternalCocinita.g:1455:2: rule__Instruccion__Group_4__3__Impl rule__Instruccion__Group_4__4
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
    // InternalCocinita.g:1462:1: rule__Instruccion__Group_4__3__Impl : ( 'el' ) ;
    public final void rule__Instruccion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1466:1: ( ( 'el' ) )
            // InternalCocinita.g:1467:1: ( 'el' )
            {
            // InternalCocinita.g:1467:1: ( 'el' )
            // InternalCocinita.g:1468:2: 'el'
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
    // InternalCocinita.g:1477:1: rule__Instruccion__Group_4__4 : rule__Instruccion__Group_4__4__Impl ;
    public final void rule__Instruccion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1481:1: ( rule__Instruccion__Group_4__4__Impl )
            // InternalCocinita.g:1482:2: rule__Instruccion__Group_4__4__Impl
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
    // InternalCocinita.g:1488:1: rule__Instruccion__Group_4__4__Impl : ( ( rule__Instruccion__BowlAssignment_4_4 ) ) ;
    public final void rule__Instruccion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1492:1: ( ( ( rule__Instruccion__BowlAssignment_4_4 ) ) )
            // InternalCocinita.g:1493:1: ( ( rule__Instruccion__BowlAssignment_4_4 ) )
            {
            // InternalCocinita.g:1493:1: ( ( rule__Instruccion__BowlAssignment_4_4 ) )
            // InternalCocinita.g:1494:2: ( rule__Instruccion__BowlAssignment_4_4 )
            {
             before(grammarAccess.getInstruccionAccess().getBowlAssignment_4_4()); 
            // InternalCocinita.g:1495:2: ( rule__Instruccion__BowlAssignment_4_4 )
            // InternalCocinita.g:1495:3: rule__Instruccion__BowlAssignment_4_4
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


    // $ANTLR start "rule__Cocina__NameAssignment_1"
    // InternalCocinita.g:1504:1: rule__Cocina__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cocina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1508:1: ( ( RULE_ID ) )
            // InternalCocinita.g:1509:2: ( RULE_ID )
            {
            // InternalCocinita.g:1509:2: ( RULE_ID )
            // InternalCocinita.g:1510:3: RULE_ID
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
    // InternalCocinita.g:1519:1: rule__Cocina__ListaIngredientesAssignment_3 : ( ruleIngrediente ) ;
    public final void rule__Cocina__ListaIngredientesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1523:1: ( ( ruleIngrediente ) )
            // InternalCocinita.g:1524:2: ( ruleIngrediente )
            {
            // InternalCocinita.g:1524:2: ( ruleIngrediente )
            // InternalCocinita.g:1525:3: ruleIngrediente
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
    // InternalCocinita.g:1534:1: rule__Cocina__NBowlAssignment_5 : ( RULE_INT ) ;
    public final void rule__Cocina__NBowlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1538:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1539:2: ( RULE_INT )
            {
            // InternalCocinita.g:1539:2: ( RULE_INT )
            // InternalCocinita.g:1540:3: RULE_INT
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
    // InternalCocinita.g:1549:1: rule__Cocina__ListaInstruccionesAssignment_8 : ( ruleInstruccion ) ;
    public final void rule__Cocina__ListaInstruccionesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1553:1: ( ( ruleInstruccion ) )
            // InternalCocinita.g:1554:2: ( ruleInstruccion )
            {
            // InternalCocinita.g:1554:2: ( ruleInstruccion )
            // InternalCocinita.g:1555:3: ruleInstruccion
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
    // InternalCocinita.g:1564:1: rule__Cocina__BowlAssignment_9_1 : ( ruleBowl ) ;
    public final void rule__Cocina__BowlAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1568:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1569:2: ( ruleBowl )
            {
            // InternalCocinita.g:1569:2: ( ruleBowl )
            // InternalCocinita.g:1570:3: ruleBowl
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
    // InternalCocinita.g:1579:1: rule__Ingrediente__AsciiAssignment_0 : ( RULE_INT ) ;
    public final void rule__Ingrediente__AsciiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1583:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1584:2: ( RULE_INT )
            {
            // InternalCocinita.g:1584:2: ( RULE_INT )
            // InternalCocinita.g:1585:3: RULE_INT
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
    // InternalCocinita.g:1594:1: rule__Ingrediente__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__Ingrediente__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1598:1: ( ( ruleTipoVariable ) )
            // InternalCocinita.g:1599:2: ( ruleTipoVariable )
            {
            // InternalCocinita.g:1599:2: ( ruleTipoVariable )
            // InternalCocinita.g:1600:3: ruleTipoVariable
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
    // InternalCocinita.g:1609:1: rule__Ingrediente__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Ingrediente__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1613:1: ( ( RULE_ID ) )
            // InternalCocinita.g:1614:2: ( RULE_ID )
            {
            // InternalCocinita.g:1614:2: ( RULE_ID )
            // InternalCocinita.g:1615:3: RULE_ID
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
    // InternalCocinita.g:1624:1: rule__Bowl__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bowl__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1628:1: ( ( RULE_INT ) )
            // InternalCocinita.g:1629:2: ( RULE_INT )
            {
            // InternalCocinita.g:1629:2: ( RULE_INT )
            // InternalCocinita.g:1630:3: RULE_INT
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


    // $ANTLR start "rule__Instruccion__ExpAssignment_0_1"
    // InternalCocinita.g:1639:1: rule__Instruccion__ExpAssignment_0_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1643:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1644:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1644:2: ( ruleExpresion )
            // InternalCocinita.g:1645:3: ruleExpresion
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
    // InternalCocinita.g:1654:1: rule__Instruccion__BowlAssignment_0_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1658:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1659:2: ( ruleBowl )
            {
            // InternalCocinita.g:1659:2: ( ruleBowl )
            // InternalCocinita.g:1660:3: ruleBowl
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
    // InternalCocinita.g:1669:1: rule__Instruccion__ExpAssignment_1_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1673:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1674:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1674:2: ( ruleExpresion )
            // InternalCocinita.g:1675:3: ruleExpresion
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
    // InternalCocinita.g:1684:1: rule__Instruccion__BowlAssignment_1_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1688:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1689:2: ( ruleBowl )
            {
            // InternalCocinita.g:1689:2: ( ruleBowl )
            // InternalCocinita.g:1690:3: ruleBowl
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
    // InternalCocinita.g:1699:1: rule__Instruccion__ExpAssignment_2_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1703:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1704:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1704:2: ( ruleExpresion )
            // InternalCocinita.g:1705:3: ruleExpresion
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
    // InternalCocinita.g:1714:1: rule__Instruccion__BowlAssignment_2_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1718:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1719:2: ( ruleBowl )
            {
            // InternalCocinita.g:1719:2: ( ruleBowl )
            // InternalCocinita.g:1720:3: ruleBowl
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
    // InternalCocinita.g:1729:1: rule__Instruccion__ExpAssignment_3_1 : ( ruleExpresion ) ;
    public final void rule__Instruccion__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1733:1: ( ( ruleExpresion ) )
            // InternalCocinita.g:1734:2: ( ruleExpresion )
            {
            // InternalCocinita.g:1734:2: ( ruleExpresion )
            // InternalCocinita.g:1735:3: ruleExpresion
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
    // InternalCocinita.g:1744:1: rule__Instruccion__BowlAssignment_3_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1748:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1749:2: ( ruleBowl )
            {
            // InternalCocinita.g:1749:2: ( ruleBowl )
            // InternalCocinita.g:1750:3: ruleBowl
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


    // $ANTLR start "rule__Instruccion__IngredienteAssignment_4_1"
    // InternalCocinita.g:1759:1: rule__Instruccion__IngredienteAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Instruccion__IngredienteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1763:1: ( ( ( RULE_ID ) ) )
            // InternalCocinita.g:1764:2: ( ( RULE_ID ) )
            {
            // InternalCocinita.g:1764:2: ( ( RULE_ID ) )
            // InternalCocinita.g:1765:3: ( RULE_ID )
            {
             before(grammarAccess.getInstruccionAccess().getIngredienteIngredienteCrossReference_4_1_0()); 
            // InternalCocinita.g:1766:3: ( RULE_ID )
            // InternalCocinita.g:1767:4: RULE_ID
            {
             before(grammarAccess.getInstruccionAccess().getIngredienteIngredienteIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstruccionAccess().getIngredienteIngredienteIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInstruccionAccess().getIngredienteIngredienteCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Instruccion__IngredienteAssignment_4_1"


    // $ANTLR start "rule__Instruccion__BowlAssignment_4_4"
    // InternalCocinita.g:1778:1: rule__Instruccion__BowlAssignment_4_4 : ( ruleBowl ) ;
    public final void rule__Instruccion__BowlAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1782:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1783:2: ( ruleBowl )
            {
            // InternalCocinita.g:1783:2: ( ruleBowl )
            // InternalCocinita.g:1784:3: ruleBowl
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


    // $ANTLR start "rule__Expresion__IngredienteAssignment_0"
    // InternalCocinita.g:1793:1: rule__Expresion__IngredienteAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Expresion__IngredienteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1797:1: ( ( ( RULE_ID ) ) )
            // InternalCocinita.g:1798:2: ( ( RULE_ID ) )
            {
            // InternalCocinita.g:1798:2: ( ( RULE_ID ) )
            // InternalCocinita.g:1799:3: ( RULE_ID )
            {
             before(grammarAccess.getExpresionAccess().getIngredienteIngredienteCrossReference_0_0()); 
            // InternalCocinita.g:1800:3: ( RULE_ID )
            // InternalCocinita.g:1801:4: RULE_ID
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
    // InternalCocinita.g:1812:1: rule__Expresion__BowlAssignment_1 : ( ruleBowl ) ;
    public final void rule__Expresion__BowlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:1816:1: ( ( ruleBowl ) )
            // InternalCocinita.g:1817:2: ( ruleBowl )
            {
            // InternalCocinita.g:1817:2: ( ruleBowl )
            // InternalCocinita.g:1818:3: ruleBowl
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003C880000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000003C800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});

}