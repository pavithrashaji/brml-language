/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.brml.BRML.ui.internal.BRMLActivator;

public class BRMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BRMLActivator.getInstance().getInjector("org.xtext.example.brml.BRML");
	}

}
