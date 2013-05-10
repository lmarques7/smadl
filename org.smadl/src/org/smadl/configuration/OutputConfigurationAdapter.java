package org.smadl.configuration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

public class OutputConfigurationAdapter implements Adapter {
	
	private String outputConfigurationName;
	
	public OutputConfigurationAdapter(String outputConfigurationName) {
		this.outputConfigurationName = outputConfigurationName;
	}

	public String getOutputConfigurationName() {
		return outputConfigurationName;
	}

	@Override
	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub
	}

	@Override
	public Notifier getTarget() {
		// No need to have a notifier
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// No need to have a notifier
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

}
