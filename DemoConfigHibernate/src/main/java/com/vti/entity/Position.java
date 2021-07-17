/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vti.entity.convertor.PositionNameConvertor;
import com.vti.entity.enumerate.EPositionName;

@Entity
@Table(name = "`Position`")
public class Position implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short positionId;
	
	@Column(name = "PositionName", nullable = false, unique = true)
	@Convert(converter = PositionNameConvertor.class)
	private EPositionName positionName;
	
	@OneToMany(mappedBy = "positionId")
	private List<Account> accounts;
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Position() {
		
	}

	public short getPositionId() {
		return positionId;
	}

	public void setPositionId(short positionId) {
		this.positionId = positionId;
	}

	

	public EPositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(EPositionName positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + ", accounts=" + accounts + "]";
	}

	
	
	
}
