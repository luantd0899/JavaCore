/**
 * 
 */
package com.vti.entity.Ex6_Question1;

import java.util.List;

import org.omg.IOP.ComponentIdHelper;

/**
 * @author luant
 *
 */
public abstract class Phone {
	List<Contacts> contacts;
	
	public abstract void insertContact(String name, String phone);
	public abstract void removeContact(String name);
	public abstract void updateContact(String name, String newPhone);
	public abstract void searchContact(String name);
}
