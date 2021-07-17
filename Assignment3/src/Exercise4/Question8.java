/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question8 {
	public static void main(String[] args) {
		String groupNames[] = {"hello java", "xin chao ja va", "i like jav a"};
		timKiemChuoi(groupNames);
	}
	
	
	public static void timKiemChuoi(String groups[])
	{
		for(int i =0 ; i < groups.length; i++)
		{
			if (groups[i].contains("java")) {
				System.out.println(groups[i]);
			}
		}
	}
}
