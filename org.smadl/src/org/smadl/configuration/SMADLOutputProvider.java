package org.smadl.configuration;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class SMADLOutputProvider implements IOutputConfigurationProvider {

	public static final String DEFAULT = "DEFAULT_OUTPUT";
	public static final String XTEND_OUTPUT = "XTEND_OUTPUT";
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(DEFAULT);
	    defaultOutput.setDescription("Default Folder");
	    defaultOutput.setOutputDirectory("./src-gen");
	    defaultOutput.setOverrideExistingResources(true);
	    defaultOutput.setCreateOutputDirectory(true);
	    defaultOutput.setCleanUpDerivedResources(true);
	    defaultOutput.setSetDerivedProperty(true);

	    OutputConfiguration xtendOutput = new OutputConfiguration(XTEND_OUTPUT);
	    xtendOutput.setDescription("Xtend Output Subfolder");
	    xtendOutput.setOutputDirectory("./src-gen/xtend-output");
	    xtendOutput.setOverrideExistingResources(true);
	    xtendOutput.setCreateOutputDirectory(true);
	    xtendOutput.setCleanUpDerivedResources(true);
	    xtendOutput.setSetDerivedProperty(true);

	    Set<OutputConfiguration> result = new HashSet<OutputConfiguration>();
	    result.add(defaultOutput);
	    result.add(xtendOutput);
	    
		return result;
	}

}
