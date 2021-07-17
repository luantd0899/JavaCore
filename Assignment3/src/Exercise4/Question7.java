/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question7 {
	public static void main(String[] args) {
		String name = "hello          every bodD";
		chuanHoaXau(name);
	}
	
	public static void chuanHoaXau(String name)
	{
		name = name.trim().toLowerCase();
		name = name.replaceAll("\\s+", " "); // thay thế nhiều khoảng trăng bằng một khoảng trắng 
		
		String string[] = name.split(" ");
		String result = "";
		for (int i = 0; i < string.length ; i++) {
			result += String.valueOf(string[i].charAt(0)).toUpperCase() + string[i].substring(1);
			if(i < string.length - 1)
			{
				result += " ";
			}
			
		}
		System.out.println(result);
		
	}
}
