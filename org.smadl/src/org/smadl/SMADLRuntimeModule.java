/*
 * generated by Xtext
 */
package org.smadl;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.smadl.configuration.SMADLOutputProvider;
import org.smadl.generator.MultipleOutputGenerator;

import com.google.inject.Binder;
import com.google.inject.Singleton;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SMADLRuntimeModule extends org.smadl.AbstractSMADLRuntimeModule {
	
//	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
//	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
//		return SMADLGenerator.class;
//	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IOutputConfigurationProvider.class)
        .to(SMADLOutputProvider.class)
        .in(Singleton.class);
	}

	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return MultipleOutputGenerator.class;
	}

}
