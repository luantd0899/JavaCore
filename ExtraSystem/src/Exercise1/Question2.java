/**
 * 
 */
package Exercise1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap son giay: " );
		BigDecimal time =scanner.nextBigDecimal();
		
	 System.out.println(splitToComponentTimes(time));
	}
	
	public static int[] splitToComponentTimes(BigDecimal biggy)
	{
	    long longVal = biggy.longValue();
	    int hours = (int) longVal / 3600;
	    int remainder = (int) longVal - hours * 3600;
	    int mins = remainder / 60;
	    remainder = remainder - mins * 60;
	    int secs = remainder;

	    int[] ints = {hours , mins , secs};
	    return ints;
	}
}
