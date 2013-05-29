
package fr.inria.atlanmod.decision;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StrategyStandaloneSetup extends StrategyStandaloneSetupGenerated{

	public static void doSetup() {
		new StrategyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

