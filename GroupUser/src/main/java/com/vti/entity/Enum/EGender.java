/**
 * 
 */
package com.vti.entity.Enum;

/**
 * @author luant
 *
 */
public enum EGender {
	MALE("M"), FEMALE("F"), UNKNOWN("U");
	
	private String value;
	
	private EGender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static EGender of(String value) {
		for (EGender gender : EGender.values()) {
			if (gender.getValue().equals(value)) {
				return gender;
			}
		}
		return null;
	}
	
	
}
