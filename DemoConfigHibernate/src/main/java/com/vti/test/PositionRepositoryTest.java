/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Position;
import com.vti.repository.PositionRepository;

/**
 * @author luant
 *
 */
public class PositionRepositoryTest {
	public static void main(String[] args) {
		PositionRepository positionRepository = new PositionRepository();
		
		List<Position> positions = positionRepository.getAllPosition();
		
		for (Position position : positions) {
			System.out.println(position);
		}
	}
}
