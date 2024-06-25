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


    // $ANTLR start "entryRuleListaIngredientes"
    // InternalCocinita.g:78:1: entryRuleListaIngredientes : ruleListaIngredientes EOF ;
    public final void entryRuleListaIngredientes() throws RecognitionException {
        try {
            // InternalCocinita.g:79:1: ( ruleListaIngredientes EOF )
            // InternalCocinita.g:80:1: ruleListaIngredientes EOF
            {
             before(grammarAccess.getListaIngredientesRule()); 
            pushFollow(FOLLOW_1);
            ruleListaIngredientes();

            state._fsp--;

             after(grammarAccess.getListaIngredientesRule()); 
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
    // $ANTLR end "entryRuleListaIngredientes"


    // $ANTLR start "ruleListaIngredientes"
    // InternalCocinita.g:87:1: ruleListaIngredientes : ( ( rule__ListaIngredientes__Group__0 ) ) ;
    public final void ruleListaIngredientes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:91:2: ( ( ( rule__ListaIngredientes__Group__0 ) ) )
            // InternalCocinita.g:92:2: ( ( rule__ListaIngredientes__Group__0 ) )
            {
            // InternalCocinita.g:92:2: ( ( rule__ListaIngredientes__Group__0 ) )
            // InternalCocinita.g:93:3: ( rule__ListaIngredientes__Group__0 )
            {
             before(grammarAccess.getListaIngredientesAccess().getGroup()); 
            // InternalCocinita.g:94:3: ( rule__ListaIngredientes__Group__0 )
            // InternalCocinita.g:94:4: rule__ListaIngredientes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaIngredientesAccess().getGroup()); 

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
    // $ANTLR end "ruleListaIngredientes"


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
    // InternalCocinita.g:127:1: rule__TipoVariable__Alternatives : ( ( ( rule__TipoVariable__INTAssignment_0 ) ) | ( ( rule__TipoVariable__StringAssignment_1 ) ) );
    public final void rule__TipoVariable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:131:1: ( ( ( rule__TipoVariable__INTAssignment_0 ) ) | ( ( rule__TipoVariable__StringAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCocinita.g:132:2: ( ( rule__TipoVariable__INTAssignment_0 ) )
                    {
                    // InternalCocinita.g:132:2: ( ( rule__TipoVariable__INTAssignment_0 ) )
                    // InternalCocinita.g:133:3: ( rule__TipoVariable__INTAssignment_0 )
                    {
                     before(grammarAccess.getTipoVariableAccess().getINTAssignment_0()); 
                    // InternalCocinita.g:134:3: ( rule__TipoVariable__INTAssignment_0 )
                    // InternalCocinita.g:134:4: rule__TipoVariable__INTAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoVariable__INTAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoVariableAccess().getINTAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCocinita.g:138:2: ( ( rule__TipoVariable__StringAssignment_1 ) )
                    {
                    // InternalCocinita.g:138:2: ( ( rule__TipoVariable__StringAssignment_1 ) )
                    // InternalCocinita.g:139:3: ( rule__TipoVariable__StringAssignment_1 )
                    {
                     before(grammarAccess.getTipoVariableAccess().getStringAssignment_1()); 
                    // InternalCocinita.g:140:3: ( rule__TipoVariable__StringAssignment_1 )
                    // InternalCocinita.g:140:4: rule__TipoVariable__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoVariable__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoVariableAccess().getStringAssignment_1()); 

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
    // InternalCocinita.g:148:1: rule__Cocina__Group__0 : rule__Cocina__Group__0__Impl rule__Cocina__Group__1 ;
    public final void rule__Cocina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:152:1: ( rule__Cocina__Group__0__Impl rule__Cocina__Group__1 )
            // InternalCocinita.g:153:2: rule__Cocina__Group__0__Impl rule__Cocina__Group__1
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
    // InternalCocinita.g:160:1: rule__Cocina__Group__0__Impl : ( '[RECIPE]' ) ;
    public final void rule__Cocina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:164:1: ( ( '[RECIPE]' ) )
            // InternalCocinita.g:165:1: ( '[RECIPE]' )
            {
            // InternalCocinita.g:165:1: ( '[RECIPE]' )
            // InternalCocinita.g:166:2: '[RECIPE]'
            {
             before(grammarAccess.getCocinaAccess().getRECIPEKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalCocinita.g:175:1: rule__Cocina__Group__1 : rule__Cocina__Group__1__Impl rule__Cocina__Group__2 ;
    public final void rule__Cocina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:179:1: ( rule__Cocina__Group__1__Impl rule__Cocina__Group__2 )
            // InternalCocinita.g:180:2: rule__Cocina__Group__1__Impl rule__Cocina__Group__2
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
    // InternalCocinita.g:187:1: rule__Cocina__Group__1__Impl : ( ( rule__Cocina__NameAssignment_1 ) ) ;
    public final void rule__Cocina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:191:1: ( ( ( rule__Cocina__NameAssignment_1 ) ) )
            // InternalCocinita.g:192:1: ( ( rule__Cocina__NameAssignment_1 ) )
            {
            // InternalCocinita.g:192:1: ( ( rule__Cocina__NameAssignment_1 ) )
            // InternalCocinita.g:193:2: ( rule__Cocina__NameAssignment_1 )
            {
             before(grammarAccess.getCocinaAccess().getNameAssignment_1()); 
            // InternalCocinita.g:194:2: ( rule__Cocina__NameAssignment_1 )
            // InternalCocinita.g:194:3: rule__Cocina__NameAssignment_1
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
    // InternalCocinita.g:202:1: rule__Cocina__Group__2 : rule__Cocina__Group__2__Impl rule__Cocina__Group__3 ;
    public final void rule__Cocina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:206:1: ( rule__Cocina__Group__2__Impl rule__Cocina__Group__3 )
            // InternalCocinita.g:207:2: rule__Cocina__Group__2__Impl rule__Cocina__Group__3
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
    // InternalCocinita.g:214:1: rule__Cocina__Group__2__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Cocina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:218:1: ( ( 'Ingredientes:' ) )
            // InternalCocinita.g:219:1: ( 'Ingredientes:' )
            {
            // InternalCocinita.g:219:1: ( 'Ingredientes:' )
            // InternalCocinita.g:220:2: 'Ingredientes:'
            {
             before(grammarAccess.getCocinaAccess().getIngredientesKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalCocinita.g:229:1: rule__Cocina__Group__3 : rule__Cocina__Group__3__Impl rule__Cocina__Group__4 ;
    public final void rule__Cocina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:233:1: ( rule__Cocina__Group__3__Impl rule__Cocina__Group__4 )
            // InternalCocinita.g:234:2: rule__Cocina__Group__3__Impl rule__Cocina__Group__4
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
    // InternalCocinita.g:241:1: rule__Cocina__Group__3__Impl : ( ( rule__Cocina__IngredienteAssignment_3 )* ) ;
    public final void rule__Cocina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:245:1: ( ( ( rule__Cocina__IngredienteAssignment_3 )* ) )
            // InternalCocinita.g:246:1: ( ( rule__Cocina__IngredienteAssignment_3 )* )
            {
            // InternalCocinita.g:246:1: ( ( rule__Cocina__IngredienteAssignment_3 )* )
            // InternalCocinita.g:247:2: ( rule__Cocina__IngredienteAssignment_3 )*
            {
             before(grammarAccess.getCocinaAccess().getIngredienteAssignment_3()); 
            // InternalCocinita.g:248:2: ( rule__Cocina__IngredienteAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ASCII) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCocinita.g:248:3: rule__Cocina__IngredienteAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Cocina__IngredienteAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCocinaAccess().getIngredienteAssignment_3()); 

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
    // InternalCocinita.g:256:1: rule__Cocina__Group__4 : rule__Cocina__Group__4__Impl ;
    public final void rule__Cocina__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:260:1: ( rule__Cocina__Group__4__Impl )
            // InternalCocinita.g:261:2: rule__Cocina__Group__4__Impl
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
    // InternalCocinita.g:267:1: rule__Cocina__Group__4__Impl : ( 'Procedimiento:' ) ;
    public final void rule__Cocina__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:271:1: ( ( 'Procedimiento:' ) )
            // InternalCocinita.g:272:1: ( 'Procedimiento:' )
            {
            // InternalCocinita.g:272:1: ( 'Procedimiento:' )
            // InternalCocinita.g:273:2: 'Procedimiento:'
            {
             before(grammarAccess.getCocinaAccess().getProcedimientoKeyword_4()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__ListaIngredientes__Group__0"
    // InternalCocinita.g:283:1: rule__ListaIngredientes__Group__0 : rule__ListaIngredientes__Group__0__Impl rule__ListaIngredientes__Group__1 ;
    public final void rule__ListaIngredientes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:287:1: ( rule__ListaIngredientes__Group__0__Impl rule__ListaIngredientes__Group__1 )
            // InternalCocinita.g:288:2: rule__ListaIngredientes__Group__0__Impl rule__ListaIngredientes__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ListaIngredientes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__Group__1();

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
    // $ANTLR end "rule__ListaIngredientes__Group__0"


    // $ANTLR start "rule__ListaIngredientes__Group__0__Impl"
    // InternalCocinita.g:295:1: rule__ListaIngredientes__Group__0__Impl : ( ( rule__ListaIngredientes__AsciiAssignment_0 ) ) ;
    public final void rule__ListaIngredientes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:299:1: ( ( ( rule__ListaIngredientes__AsciiAssignment_0 ) ) )
            // InternalCocinita.g:300:1: ( ( rule__ListaIngredientes__AsciiAssignment_0 ) )
            {
            // InternalCocinita.g:300:1: ( ( rule__ListaIngredientes__AsciiAssignment_0 ) )
            // InternalCocinita.g:301:2: ( rule__ListaIngredientes__AsciiAssignment_0 )
            {
             before(grammarAccess.getListaIngredientesAccess().getAsciiAssignment_0()); 
            // InternalCocinita.g:302:2: ( rule__ListaIngredientes__AsciiAssignment_0 )
            // InternalCocinita.g:302:3: rule__ListaIngredientes__AsciiAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__AsciiAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListaIngredientesAccess().getAsciiAssignment_0()); 

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
    // $ANTLR end "rule__ListaIngredientes__Group__0__Impl"


    // $ANTLR start "rule__ListaIngredientes__Group__1"
    // InternalCocinita.g:310:1: rule__ListaIngredientes__Group__1 : rule__ListaIngredientes__Group__1__Impl rule__ListaIngredientes__Group__2 ;
    public final void rule__ListaIngredientes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:314:1: ( rule__ListaIngredientes__Group__1__Impl rule__ListaIngredientes__Group__2 )
            // InternalCocinita.g:315:2: rule__ListaIngredientes__Group__1__Impl rule__ListaIngredientes__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ListaIngredientes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__Group__2();

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
    // $ANTLR end "rule__ListaIngredientes__Group__1"


    // $ANTLR start "rule__ListaIngredientes__Group__1__Impl"
    // InternalCocinita.g:322:1: rule__ListaIngredientes__Group__1__Impl : ( ( rule__ListaIngredientes__TipoAssignment_1 ) ) ;
    public final void rule__ListaIngredientes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:326:1: ( ( ( rule__ListaIngredientes__TipoAssignment_1 ) ) )
            // InternalCocinita.g:327:1: ( ( rule__ListaIngredientes__TipoAssignment_1 ) )
            {
            // InternalCocinita.g:327:1: ( ( rule__ListaIngredientes__TipoAssignment_1 ) )
            // InternalCocinita.g:328:2: ( rule__ListaIngredientes__TipoAssignment_1 )
            {
             before(grammarAccess.getListaIngredientesAccess().getTipoAssignment_1()); 
            // InternalCocinita.g:329:2: ( rule__ListaIngredientes__TipoAssignment_1 )
            // InternalCocinita.g:329:3: rule__ListaIngredientes__TipoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListaIngredientesAccess().getTipoAssignment_1()); 

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
    // $ANTLR end "rule__ListaIngredientes__Group__1__Impl"


    // $ANTLR start "rule__ListaIngredientes__Group__2"
    // InternalCocinita.g:337:1: rule__ListaIngredientes__Group__2 : rule__ListaIngredientes__Group__2__Impl ;
    public final void rule__ListaIngredientes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:341:1: ( rule__ListaIngredientes__Group__2__Impl )
            // InternalCocinita.g:342:2: rule__ListaIngredientes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__Group__2__Impl();

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
    // $ANTLR end "rule__ListaIngredientes__Group__2"


    // $ANTLR start "rule__ListaIngredientes__Group__2__Impl"
    // InternalCocinita.g:348:1: rule__ListaIngredientes__Group__2__Impl : ( ( rule__ListaIngredientes__NameAssignment_2 ) ) ;
    public final void rule__ListaIngredientes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:352:1: ( ( ( rule__ListaIngredientes__NameAssignment_2 ) ) )
            // InternalCocinita.g:353:1: ( ( rule__ListaIngredientes__NameAssignment_2 ) )
            {
            // InternalCocinita.g:353:1: ( ( rule__ListaIngredientes__NameAssignment_2 ) )
            // InternalCocinita.g:354:2: ( rule__ListaIngredientes__NameAssignment_2 )
            {
             before(grammarAccess.getListaIngredientesAccess().getNameAssignment_2()); 
            // InternalCocinita.g:355:2: ( rule__ListaIngredientes__NameAssignment_2 )
            // InternalCocinita.g:355:3: rule__ListaIngredientes__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListaIngredientes__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListaIngredientesAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ListaIngredientes__Group__2__Impl"


    // $ANTLR start "rule__Cocina__NameAssignment_1"
    // InternalCocinita.g:364:1: rule__Cocina__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cocina__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:368:1: ( ( RULE_ID ) )
            // InternalCocinita.g:369:2: ( RULE_ID )
            {
            // InternalCocinita.g:369:2: ( RULE_ID )
            // InternalCocinita.g:370:3: RULE_ID
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


    // $ANTLR start "rule__Cocina__IngredienteAssignment_3"
    // InternalCocinita.g:379:1: rule__Cocina__IngredienteAssignment_3 : ( ruleListaIngredientes ) ;
    public final void rule__Cocina__IngredienteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:383:1: ( ( ruleListaIngredientes ) )
            // InternalCocinita.g:384:2: ( ruleListaIngredientes )
            {
            // InternalCocinita.g:384:2: ( ruleListaIngredientes )
            // InternalCocinita.g:385:3: ruleListaIngredientes
            {
             before(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListaIngredientes();

            state._fsp--;

             after(grammarAccess.getCocinaAccess().getIngredienteListaIngredientesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cocina__IngredienteAssignment_3"


    // $ANTLR start "rule__ListaIngredientes__AsciiAssignment_0"
    // InternalCocinita.g:394:1: rule__ListaIngredientes__AsciiAssignment_0 : ( RULE_ASCII ) ;
    public final void rule__ListaIngredientes__AsciiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:398:1: ( ( RULE_ASCII ) )
            // InternalCocinita.g:399:2: ( RULE_ASCII )
            {
            // InternalCocinita.g:399:2: ( RULE_ASCII )
            // InternalCocinita.g:400:3: RULE_ASCII
            {
             before(grammarAccess.getListaIngredientesAccess().getAsciiASCIITerminalRuleCall_0_0()); 
            match(input,RULE_ASCII,FOLLOW_2); 
             after(grammarAccess.getListaIngredientesAccess().getAsciiASCIITerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListaIngredientes__AsciiAssignment_0"


    // $ANTLR start "rule__ListaIngredientes__TipoAssignment_1"
    // InternalCocinita.g:409:1: rule__ListaIngredientes__TipoAssignment_1 : ( ruleTipoVariable ) ;
    public final void rule__ListaIngredientes__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:413:1: ( ( ruleTipoVariable ) )
            // InternalCocinita.g:414:2: ( ruleTipoVariable )
            {
            // InternalCocinita.g:414:2: ( ruleTipoVariable )
            // InternalCocinita.g:415:3: ruleTipoVariable
            {
             before(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoVariable();

            state._fsp--;

             after(grammarAccess.getListaIngredientesAccess().getTipoTipoVariableParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListaIngredientes__TipoAssignment_1"


    // $ANTLR start "rule__ListaIngredientes__NameAssignment_2"
    // InternalCocinita.g:424:1: rule__ListaIngredientes__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ListaIngredientes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:428:1: ( ( RULE_ID ) )
            // InternalCocinita.g:429:2: ( RULE_ID )
            {
            // InternalCocinita.g:429:2: ( RULE_ID )
            // InternalCocinita.g:430:3: RULE_ID
            {
             before(grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListaIngredientesAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ListaIngredientes__NameAssignment_2"


    // $ANTLR start "rule__TipoVariable__INTAssignment_0"
    // InternalCocinita.g:439:1: rule__TipoVariable__INTAssignment_0 : ( ( '[-o]' ) ) ;
    public final void rule__TipoVariable__INTAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:443:1: ( ( ( '[-o]' ) ) )
            // InternalCocinita.g:444:2: ( ( '[-o]' ) )
            {
            // InternalCocinita.g:444:2: ( ( '[-o]' ) )
            // InternalCocinita.g:445:3: ( '[-o]' )
            {
             before(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); 
            // InternalCocinita.g:446:3: ( '[-o]' )
            // InternalCocinita.g:447:4: '[-o]'
            {
             before(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); 

            }

             after(grammarAccess.getTipoVariableAccess().getINTOKeyword_0_0()); 

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
    // $ANTLR end "rule__TipoVariable__INTAssignment_0"


    // $ANTLR start "rule__TipoVariable__StringAssignment_1"
    // InternalCocinita.g:458:1: rule__TipoVariable__StringAssignment_1 : ( ( '[cU]' ) ) ;
    public final void rule__TipoVariable__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCocinita.g:462:1: ( ( ( '[cU]' ) ) )
            // InternalCocinita.g:463:2: ( ( '[cU]' ) )
            {
            // InternalCocinita.g:463:2: ( ( '[cU]' ) )
            // InternalCocinita.g:464:3: ( '[cU]' )
            {
             before(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); 
            // InternalCocinita.g:465:3: ( '[cU]' )
            // InternalCocinita.g:466:4: '[cU]'
            {
             before(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); 

            }

             after(grammarAccess.getTipoVariableAccess().getStringCUKeyword_1_0()); 

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
    // $ANTLR end "rule__TipoVariable__StringAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});

}