package org.smadl.lib;

public class OAuthRelationship extends Relationship {
	
    private String uri;
    private String apiKey;
    private String secret;
    private String userToken;

	public OAuthRelationship(SocialMachine consumer, SocialMachine provider) {
		super(consumer, provider);
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
}
