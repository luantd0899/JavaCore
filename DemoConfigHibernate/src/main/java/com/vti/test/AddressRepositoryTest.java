/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Address;
import com.vti.repository.AddressRepository;

/**
 * @author luant
 *
 */
public class AddressRepositoryTest {
	public static void main(String[] args) {
		AddressRepository addressRepository = new AddressRepository();
		
		List<Address> addresss = addressRepository.getAllAddress();
		for (Address add : addresss) {
			System.out.println(add);
			System.out.println(add.getDepartment().getDepartmentId());
		}
	}
}
