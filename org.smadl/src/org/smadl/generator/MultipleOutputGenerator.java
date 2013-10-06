package org.smadl.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.smadl.configuration.OutputConfigurationAdapter;
import org.smadl.configuration.SMADLOutputProvider;

import com.google.inject.Inject;

public class MultipleOutputGenerator extends JvmModelGenerator {

	@Inject	private SMADLGenerator generator;

	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		EList<EObject> contents = input.getContents();
		for (final EObject obj : contents) {
			Set<String> configs = new HashSet<String>();
			obj.eAdapters().add(new OutputConfigurationAdapter(SMADLOutputProvider.DEFAULT));
			/*
			If more than one OutputProvider is needed, than uncomment the line 
			below and set up the appropriate OutputConfiguration
			*/
//			obj.eAdapters().add(new OutputConfigurationAdapter(SMADLOutputProvider.XTEND_OUTPUT));
			for (Adapter adapter : obj.eAdapters()) {
				if (adapter instanceof OutputConfigurationAdapter) {
					configs.add(((OutputConfigurationAdapter) adapter).getOutputConfigurationName());
				}
			}
			for (String currentConfig : configs) {
				switch (currentConfig) {
					case SMADLOutputProvider.DEFAULT:
						this.internalDoGenerate(obj, fsa); // <= GOTO INFERRER					
						break;
					case SMADLOutputProvider.XTEND_OUTPUT:
						generator.doGenerate(input, fsa); // <= GOTO IGENERATOR					
						break;
				}
			}
		}
	}

}