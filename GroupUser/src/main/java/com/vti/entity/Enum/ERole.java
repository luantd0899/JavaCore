/**
 * 
 */
package com.vti.entity.Enum;

/**
 * @author luant
 *
 */
public enum ERole {
	ADMIN("Admin"), EMPLOYEE("Employee"), MANAGER("Manager");
	
	private String value;
	
	private ERole(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static ERole of(String value) {
		for (ERole role : ERole.values()) {
			if (role.getValue().equals(value)) {
				return role;
			}
		}
		return null;
	}
}
