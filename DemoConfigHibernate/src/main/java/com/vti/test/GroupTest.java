/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Group;
import com.vti.repository.GroupRepository;

/**
 * @author luant
 *
 */
public class GroupTest {
	public static void main(String[] args) {
		GroupRepository groupRepository = new GroupRepository();
		
		List<Group> groups = groupRepository.getAllGroups();
		
		for (Group group : groups) {
			System.out.println(group);
		}
	}
}
