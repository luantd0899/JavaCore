/**
 * 
 */
package com.vti.entity.enumerate;

/**
 * @author luant
 *
 */
public enum ESalaryName {
	A("600"), B("700"), C("1500"), D("2000");

	private String value;

	private ESalaryName(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
