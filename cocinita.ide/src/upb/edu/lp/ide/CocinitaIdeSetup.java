/*
 * generated by Xtext 2.35.0
 */
package upb.edu.lp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import upb.edu.lp.CocinitaRuntimeModule;
import upb.edu.lp.CocinitaStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CocinitaIdeSetup extends CocinitaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CocinitaRuntimeModule(), new CocinitaIdeModule()));
	}
	
}
