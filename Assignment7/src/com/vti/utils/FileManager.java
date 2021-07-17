/**

 * 
 */
package com.vti.utils;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author luant
 *
 */
public class FileManager {
	public static final String FILE_EXISTS = "File is exits!";
	public static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
	public static final String FOLDER_EXISTS = "Folder is exits!";
	public static final String FOLDER_NOT_EXISTS = "Folder is not exits!";
	public static final String PATH_NOT_FOLDER = "Error! Path is not folder.";

	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";

	public static final String NEW_FILE_EXISTS = "Error! New File Exist.";
	public static final String CREATE_FILE_SUCCESS = "Create file success!";
	public static final String CREATE_FILE_FAIL = "Create file fail!";
	public static final String DELETE_FILE_SUCCESS = "Delete file success!";
	public static final String DELETE_FILE_FAIL = "Delete file fail!";
	
	
	//Check file isExists
	public static boolean isFileExists(String pathFile)
	{
		File file = new File(pathFile);
		if (file.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Check folder isExsists
	public static boolean isFolderExists(String pathFolder)
	{
		File file = new File(pathFolder);
		if (file.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Create File
	public static void createNewFile(String pathFile) throws Exception
	{
		boolean result = isFileExists(pathFile);
		if (result) {
			throw new Exception(FILE_EXISTS);
		}
		else {
			File file = new File(pathFile);
			file.createNewFile();
			System.out.println(CREATE_FILE_SUCCESS);
		}
	}
	
	// Delete File
	public static void deleteFile(String pathFile) throws Exception
	{
		boolean result = isFileExists(pathFile);
		if (result) {
			File file = new File(pathFile);
			file.delete();
		}
		else {
			throw new Exception("File Not Found!!!");
		}
	}
	
	
	// Check path is File or Folder
	public static boolean isFileOrFolder(String path)
	{
		File file = new File(path);
		if (file.isDirectory()) {
			return true;      // Path is Folder
		}
		else {
			return false;		// path is File
		}
	}
	
	// Get all file name of Folder
	public static List<String> getAllFileName(String pathFolder) throws Exception
	{
		File file = new File(pathFolder);
		if(!isFileOrFolder(pathFolder))
		{
			throw new Exception(PATH_NOT_FOLDER);
		}
		else {
			return Arrays.asList(file.list());
			
		}
	}
	
	// Copy File
	public static void copyFile()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
