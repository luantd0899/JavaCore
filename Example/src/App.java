import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		themSoVaomang(numbers);
		showList(numbers);
		
	}
	
	public static void themSoVaomang(List<Integer> numbers)
	{
			int a = 6;
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) >= a) {
					numbers.add(i, a);
					break;
				}
			}
		
	}
	
	public static void showList(List<Integer> numbers)
	{
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
}
