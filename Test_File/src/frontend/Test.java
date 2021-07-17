/**
 * 
 */
package frontend;

import java.io.File;
import java.io.IOException;

/**
 * @author luant
 *
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("E:\\Eclipse\\Code\\Test_File\\text.txt");
		if (file.exists()) { 		// Check file ton tai!!!
			
			System.out.println("File exist!!!");
			
		}
		else {
			System.out.println("File not exist!!!");
		}
		checkFileFolder(file);
		try {
			createFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=====");
		// get all file
		getAllFileInFolder();
	}
	
	public static void checkFileFolder(File file)
	{
		if (file.isDirectory()) {     // Check Path is File or Folder !!!
			System.out.println("Path is Folder!!!");
		}
		else {
			System.out.println("Path is File!!!");
		}
	}
	
	public static void createFile() throws IOException
	{
		File file = new File("E:\\Eclipse\\Code\\Test_File\\text1.txt");
		if (file.exists()) {
			System.out.println("File da ton tai!!!");
		}
		else {
			file.createNewFile();
		}
	}
	
	public static void getAllFileInFolder()
	{
		File file = new File("E:\\Eclipse\\Code\\Test_File");
		for (File fileName : file.listFiles()) {
			if (fileName.isFile()) {
				System.out.println(fileName.getName());
			}
		}
	}
}
