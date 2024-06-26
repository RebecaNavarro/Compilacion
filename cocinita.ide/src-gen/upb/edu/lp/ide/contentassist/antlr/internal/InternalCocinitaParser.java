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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[-o]'", "'[cU]'", "'[-O]'", "'[RECIPE]'", "'Ingredientes:'", "'Procedimiento:'"
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


    // $ANTLR start "rule__TipoVariable__Alternatives"
    // InternalCocinita.g:127:1: rule__TipoVariable__Alternatives : ( ( '[-o]' ) | ( '[cU]' ) | ( '[-O]' ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:131:1: ( ( '[-o]' ) | ( '[cU]' ) | ( '[-O]' ) )
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
                    // InternalCocinita.g:132:2: ( '[-o]' )
                    {
                    // InternalCocinita.g:132:2: ( '[-o]' )
                    // InternalCocinita.g:133:3: '[-o]'
                    {
                     before(grammarAccess.getTipoVariableAccess().getOKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTipoVariableAccess().getOKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:138:2: ( '[cU]' )
                    {
                    // InternalCocinita.g:138:2: ( '[cU]' )
                    // InternalCocinita.g:139:3: '[cU]'
                    {
                     before(grammarAccess.getTipoVariableAccess().getCUKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTipoVariableAccess().getCUKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCocinita.g:144:2: ( '[-O]' )
                    {
                    // InternalCocinita.g:144:2: ( '[-O]' )
                    // InternalCocinita.g:145:3: '[-O]'
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


    // $ANTLR start "rule__Cocina__Group__0"
    // InternalCocinita.g:154:1: rule__Cocina__Group__0 : rule__Cocina__Group__0__Impl rule__Cocina__Group__1 ;
    public final void rule__Cocina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:158:1: ( rule__Cocina__Group__0__Impl rule__Cocina__Group__1 )
            // InternalCocinita.g:159:2: rule__Cocina__Group__0__Impl rule__Cocina__Group__1
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
    // InternalCocinita.g:166:1: rule__Cocina__Group__0__Impl : ( '[RECIPE]' ) ;
    public final void rule__Cocina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:170:1: ( ( '[RECIPE]' ) )
            // InternalCocinita.g:171:1: ( '[RECIPE]' )
            {
            // InternalCocinita.g:171:1: ( '[RECIPE]' )
            // InternalCocinita.g:172:2: '[RECIPE]'
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
    // InternalCocinita.g:181:1: rule__Cocina__Group__1 : rule__Cocina__Group__1__Impl rule__Cocina__Group__2 ;
    public final void rule__Cocina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:185:1: ( rule__Cocina__Group__1__Impl rule__Cocina__Group__2 )
            // InternalCocinita.g:186:2: rule__Cocina__Group__1__Impl rule__Cocina__Group__2
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
    // InternalCocinita.g:193:1: rule__Cocina__Group__1__Impl : ( ( rule__Cocina__NameAssignment_1 ) ) ;
    public final void rule__Cocina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:197:1: ( ( ( rule__Cocina__NameAssignment_1 ) ) )
            // InternalCocinita.g:198:1: ( ( rule__Cocina__NameAssignment_1 ) )
            {
            // InternalCocinita.g:198:1: ( ( rule__Cocina__NameAssignment_1 ) )
            // InternalCocinita.g:199:2: ( rule__Cocina__NameAssignment_1 )
            {
             before(grammarAccess.getCocinaAccess().getNameAssignment_1()); 
            // InternalCocinita.g:200:2: ( rule__Cocina__NameAssignment_1 )
            // InternalCocinita.g:200:3: rule__Cocina__NameAssignment_1
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
    // InternalCocinita.g:208:1: rule__Cocina__Group__2 : rule__Cocina__Group__2__Impl rule__Cocina__Group__3 ;
    public final void rule__Cocina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:212:1: ( rule__Cocina__Group__2__Impl rule__Cocina__Group__3 )
            // InternalCocinita.g:213:2: rule__Cocina__Group__2__Impl rule__Cocina__Group__3
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
    // InternalCocinita.g:220:1: rule__Cocina__Group__2__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Cocina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:224:1: ( ( 'Ingredientes:' ) )
            // InternalCocinita.g:225:1: ( 'Ingredientes:' )
            {
            // InternalCocinita.g:225:1: ( 'Ingredientes:' )
            // InternalCocinita.g:226:2: 'Ingredientes:'
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
    // InternalCocinita.g:235:1: rule__Cocina__Group__3 : rule__Cocina__Group__3__Impl rule__Cocina__Group__4 ;
    public final void rule__Cocina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:239:1: ( rule__Cocina__Group__3__Impl rule__Cocina__Group__4 )
            // InternalCocinita.g:240:2: rule__Cocina__Group__3__Impl rule__Cocina__Group__4
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
    // InternalCocinita.g:247:1: rule__Cocina__Group__3__Impl : ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) ;
    public final void rule__Cocina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:251:1: ( ( ( rule__Cocina__ListaIngredientesAssignment_3 )* ) )
            // InternalCocinita.g:252:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            {
            // InternalCocinita.g:252:1: ( ( rule__Cocina__ListaIngredientesAssignment_3 )* )
            // InternalCocinita.g:253:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            {
             before(grammarAccess.getCocinaAccess().getListaIngredientesAssignment_3()); 
            // InternalCocinita.g:254:2: ( rule__Cocina__ListaIngredientesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCocinita.g:254:3: rule__Cocina__ListaIngredientesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Cocina__ListaIngredientesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalCocinita.g:262:1: rule__Cocina__Group__4 : rule__Cocina__Group__4__Impl ;
    public final void rule__Cocina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:266:1: ( rule__Cocina__Group__4__Impl )
            // InternalCocinita.g:267:2: rule__Cocina__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cocina__Group__4__Impl();

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
    // InternalCocinita.g:273:1: rule__Cocina__Group__4__Impl : ( 'Procedimiento:' ) ;
    public final void rule__Cocina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:277:1: ( ( 'Procedimiento:' ) )
            // InternalCocinita.g:278:1: ( 'Procedimiento:' )
            {
            // InternalCocinita.g:278:1: ( 'Procedimiento:' )
            // InternalCocinita.g:279:2: 'Procedimiento:'
            {
             before(grammarAccess.getCocinaAccess().getProcedimientoKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCocinaAccess().getProcedimientoKeyword_4()); 

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


    // $ANTLR start "rule__Ingrediente__Group__0"
    // InternalCocinita.g:289:1: rule__Ingrediente__Group__0 : rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 ;
    public final void rule__Ingrediente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:293:1: ( rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 )
            // InternalCocinita.g:294:2: rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCocinita.g:301:1: rule__Ingrediente__Group__0__Impl : ( ( rule__Ingrediente__AsciiAssignment_0 ) ) ;
    public final void rule__Ingrediente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:305:1: ( ( ( rule__Ingrediente__AsciiAssignment_0 ) ) )
            // InternalCocinita.g:306:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            {
            // InternalCocinita.g:306:1: ( ( rule__Ingrediente__AsciiAssignment_0 ) )
            // InternalCocinita.g:307:2: ( rule__Ingrediente__AsciiAssignment_0 )
            {
             before(grammarAccess.getIngredienteAccess().getAsciiAssignment_0()); 
            // InternalCocinita.g:308:2: ( rule__Ingrediente__AsciiAssignment_0 )
            // InternalCocinita.g:308:3: rule__Ingrediente__AsciiAssignment_0
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
    // InternalCocinita.g:316:1: rule__Ingrediente__Group__1 : rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 ;
    public final void rule__Ingrediente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:320:1: ( rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 )
            // InternalCocinita.g:321:2: rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2
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
    // InternalCocinita.g:328:1: rule__Ingrediente__Group__1__Impl : ( ( rule__Ingrediente__TipoAssignment_1 ) ) ;
    public final void rule__Ingrediente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:332:1: ( ( ( rule__Ingrediente__TipoAssignment_1 ) ) )
            // InternalCocinita.g:333:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            {
            // InternalCocinita.g:333:1: ( ( rule__Ingrediente__TipoAssignment_1 ) )
            // InternalCocinita.g:334:2: ( rule__Ingrediente__TipoAssignment_1 )
            {
             before(grammarAccess.getIngredienteAccess().getTipoAssignment_1()); 
            // InternalCocinita.g:335:2: ( rule__Ingrediente__TipoAssignment_1 )
            // InternalCocinita.g:335:3: rule__Ingrediente__TipoAssignment_1
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
    // InternalCocinita.g:343:1: rule__Ingrediente__Group__2 : rule__Ingrediente__Group__2__Impl ;
    public final void rule__Ingrediente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:347:1: ( rule__Ingrediente__Group__2__Impl )
            // InternalCocinita.g:348:2: rule__Ingrediente__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__2__Impl();

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
    // InternalCocinita.g:354:1: rule__Ingrediente__Group__2__Impl : ( ( rule__Ingrediente__NameAssignment_2 ) ) ;
    public final void rule__Ingrediente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:358:1: ( ( ( rule__Ingrediente__NameAssignment_2 ) ) )
            // InternalCocinita.g:359:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            {
            // InternalCocinita.g:359:1: ( ( rule__Ingrediente__NameAssignment_2 ) )
            // InternalCocinita.g:360:2: ( rule__Ingrediente__NameAssignment_2 )
            {
             before(grammarAccess.getIngredienteAccess().getNameAssignment_2()); 
            // InternalCocinita.g:361:2: ( rule__Ingrediente__NameAssignment_2 )
            // InternalCocinita.g:361:3: rule__Ingrediente__NameAssignment_2
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


    // $ANTLR start "rule__Cocina__NameAssignment_1"
    // InternalCocinita.g:370:1: rule__Cocina__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cocina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:374:1: ( ( RULE_ID ) )
            // InternalCocinita.g:375:2: ( RULE_ID )
            {
            // InternalCocinita.g:375:2: ( RULE_ID )
            // InternalCocinita.g:376:3: RULE_ID
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
    // InternalCocinita.g:385:1: rule__Cocina__ListaIngredientesAssignment_3 : ( ruleIngrediente ) ;
    public final void rule__Cocina__ListaIngredientesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:389:1: ( ( ruleIngrediente ) )
            // InternalCocinita.g:390:2: ( ruleIngrediente )
            {
            // InternalCocinita.g:390:2: ( ruleIngrediente )
            // InternalCocinita.g:391:3: ruleIngrediente
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


    // $ANTLR start "rule__Ingrediente__AsciiAssignment_0"
    // InternalCocinita.g:400:1: rule__Ingrediente__AsciiAssignment_0 : ( RULE_INT ) ;
    public final void rule__Ingrediente__AsciiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:404:1: ( ( RULE_INT ) )
            // InternalCocinita.g:405:2: ( RULE_INT )
            {
            // InternalCocinita.g:405:2: ( RULE_INT )
            // InternalCocinita.g:406:3: RULE_INT
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
    // InternalCocinita.g:415:1: rule__Ingrediente__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__Ingrediente__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:419:1: ( ( ruleTipoVariable ) )
            // InternalCocinita.g:420:2: ( ruleTipoVariable )
            {
            // InternalCocinita.g:420:2: ( ruleTipoVariable )
            // InternalCocinita.g:421:3: ruleTipoVariable
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
    // InternalCocinita.g:430:1: rule__Ingrediente__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Ingrediente__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:434:1: ( ( RULE_ID ) )
            // InternalCocinita.g:435:2: ( RULE_ID )
            {
            // InternalCocinita.g:435:2: ( RULE_ID )
            // InternalCocinita.g:436:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});

}