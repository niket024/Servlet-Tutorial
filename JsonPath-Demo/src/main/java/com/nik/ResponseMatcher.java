package com.nik;

import java.util.Map;

public class ResponseMatcher {
	private Map<String, String> legacyValue;
	private Map<String, String> newApiValue;
	private boolean isResponseMatched;

	public ResponseMatcher() {

	}

	@Override
	public String toString() {
		return "ResponseMatcher [legacyValue=" + legacyValue + ", newApiValue=" + newApiValue + ", isResponseMatched="
				+ isResponseMatched + "]";
	}

	public Map<String, String> getLegacyValue() {
		return legacyValue;
	}

	public ResponseMatcher(Map<String, String> legacyValue, Map<String, String> newApiValue,
			boolean isResponseMatched) {
		super();
		this.legacyValue = legacyValue;
		this.newApiValue = newApiValue;
		this.isResponseMatched = isResponseMatched;
	}

	public void setLegacyValue(Map<String, String> legacyValue) {
		this.legacyValue = legacyValue;
	}

	public Map<String, String> getNewApiValue() {
		return newApiValue;
	}

	public void setNewApiValue(Map<String, String> newApiValue) {
		this.newApiValue = newApiValue;
	}

	public boolean isResponseMatched() {
		return isResponseMatched;
	}

	public void setResponseMatched(boolean isResponseMatched) {
		this.isResponseMatched = isResponseMatched;
	}

}
