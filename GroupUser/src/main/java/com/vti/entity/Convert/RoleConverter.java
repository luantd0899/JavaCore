/**
 * 
 */
package com.vti.entity.Convert;

import javax.persistence.AttributeConverter;

import com.vti.entity.Enum.ERole;

/**
 * @author luant
 *
 */
public class RoleConverter implements AttributeConverter<ERole, String>{

	public String convertToDatabaseColumn(ERole role) {
		if (role == null) {
			return null;
		}
		
		return role.getValue();
	}

	public ERole convertToEntityAttribute(String value) {
		return ERole.of(value);
	}
}
