package org.smadl.lib;

import java.util.Map;

public abstract class Operation {
	
	private String name;
	private String returnType;
	
	/* Map of parameters <Type, Name>*/
	private Map<String, String> parameters;

	public Operation(String name, String returnType,
			Map<String, String> parameters) {
		this.name = name;
		this.returnType = returnType;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	} 

}
