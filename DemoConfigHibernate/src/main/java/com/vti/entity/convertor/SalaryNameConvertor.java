/**
 * 
 */
package com.vti.entity.convertor;

import javax.persistence.AttributeConverter;

import com.vti.entity.enumerate.ESalaryName;

/**
 * @author luant
 *
 */
public class SalaryNameConvertor implements AttributeConverter<ESalaryName, String> {

	public String convertToDatabaseColumn(ESalaryName salaryName) {
		if (salaryName != null) {
			return salaryName.getValue();
		}
		return null;
	}

	public ESalaryName convertToEntityAttribute(String value) {
		return of(value);
	}
	
	public static ESalaryName of(String value) {
		for (ESalaryName salary : ESalaryName.values()) {
			if (salary.getValue().equals(value)) {
				return salary;
			}
		}
		
		return null;
	}
	
}
