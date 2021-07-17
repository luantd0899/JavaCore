/**
 * 
 */
package com.vti.entity.convertor;

import javax.persistence.AttributeConverter;

import com.vti.entity.enumerate.EPositionName;

/**
 * @author luant
 *
 */
public class PositionNameConvertor implements AttributeConverter<EPositionName, String> {

	public String convertToDatabaseColumn(EPositionName positionName) {
		if (positionName == null) {
			return null;
		}
		return positionName.getValue();
	}

	public EPositionName convertToEntityAttribute(String value) {
		
		return EPositionName.of(value);
	}

}
