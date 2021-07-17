/**
 * 
 */
package com.vti.entity.enumerate;

/**
 * @author luant
 *
 */
public enum EPositionName {
	DEV("Dev"), TEST("Test"), SCRUMMASTER("ScrumMaster"), PM("PM");
	
	private String value;
	
	private EPositionName(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public static EPositionName of(String value) {
		for (EPositionName positionName : EPositionName.values()) {
			if (positionName.getValue().equals(value)) {
				return positionName;
			}
		}
		return null;
	}
}
