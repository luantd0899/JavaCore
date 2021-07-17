/**
 * 
 */
package com.vti.entity.Convert;

import javax.persistence.AttributeConverter;

import com.vti.entity.Enum.EGender;

/**
 * @author luant
 *
 */
public class GenderConverter implements AttributeConverter<EGender, String>{

	public String convertToDatabaseColumn(EGender gender) {
		if (gender == null) {
			return null;
		}
		return gender.getValue();
	}

	public EGender convertToEntityAttribute(String value) {
		return EGender.of(value);
	}
	
}
