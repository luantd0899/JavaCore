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

@Entity
@Table(name = "`Group`")
public class Group implements Serializable {

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
	
	//@Column(name = "author_ID", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_ID", referencedColumnName = "id")
	private User author;
	
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

//	public short getAuthorId() {
//		return authorId;
//	}
//
//	public void setAuthorId(short authorId) {
//		this.authorId = authorId;
//	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name +  "]";
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	

}
