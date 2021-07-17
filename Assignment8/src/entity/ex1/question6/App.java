/**
 * 
 */
package entity.ex1.question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author luant
 *
 */
public class App {
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "Luan");
		Student student2 = new Student(2, "Nam");
		Student student3 = new Student(3, "Ha");
		Student student4 = new Student(4, "Viet");
		
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(student1.id, student1.name);
		studentMap.put(student2.id, student2.name);
		studentMap.put(student3.id, student3.name);
		showKeyStudent(studentMap);
		
		showValueStudent(studentMap);
		
		sortStudentByName(studentMap);
		
		
	}
	
	public static void showKeyStudent(Map<Integer, String> studentMap)
	{
		System.out.println(studentMap.keySet());
	}
	
	public static void showValueStudent(Map<Integer, String> studentMap)
	{
		System.out.println(studentMap.values());
	}
	
	public static void sortStudentByName(Map<Integer, String> studentMap)
	{
		List<Map.Entry<Integer, String>> studentsEntries = new ArrayList<Map.Entry<Integer,String>>();
		studentsEntries.addAll(studentMap.entrySet());
		Collections.sort(studentsEntries, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(studentsEntries);
	}
}
