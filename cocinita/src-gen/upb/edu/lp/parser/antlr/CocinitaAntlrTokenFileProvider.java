/*
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CocinitaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("upb/edu/lp/parser/antlr/internal/InternalCocinita.tokens");
	}
}
