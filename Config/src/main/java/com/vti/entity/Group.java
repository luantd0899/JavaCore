/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author luant
 *
 */

@Entity
@Table(name = "Group")
public class Group implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "name", length = 50, nullable = false, unique = true)
	private String name;
	
//	@Column(name = "author_ID", nullable = false)
//	private short author_ID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_ID", referencedColumnName = "id")
	private User authorUser;
	
	public User getAuthorUser() {
		return authorUser;
	}

	public void setAuthorUser(User authorUser) {
		this.authorUser = authorUser;
	}

	public Group() {
		
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

//	public short getAuthor_ID() {
//		return author_ID;
//	}
//
//	public void setAuthor_ID(short author_ID) {
//		this.author_ID = author_ID;
//	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", authorId=" + "]";
	}
	
	
	
	
	
}
