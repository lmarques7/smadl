package org.smadl.lib;

public abstract class Relationship {

	protected SocialMachine consumer;
	protected SocialMachine provider;
	protected RelationshipConstraint constraint;

	public Relationship(SocialMachine consumer, SocialMachine provider) {
		this.consumer = consumer;
		this.provider = provider;
	}

	public SocialMachine getConsumer() {
		return consumer;
	}

	public void setConsumer(SocialMachine consumer) {
		this.consumer = consumer;
	}

	public SocialMachine getProvider() {
		return provider;
	}

	public void setProvider(SocialMachine provider) {
		this.provider = provider;
	}

}
