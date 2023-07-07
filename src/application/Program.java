package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);/*Create a vector of folders */
		System.out.println("FOLDERS: ");           /*Sintaxe ReferenceOfMethods -::isDirectory List  only who is directory or folder */
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File [] files = path.listFiles(File::isFile);/*Create a vector of files */
		System.out.println("FILES: ");                /*Sintaxe ReferenceOfMethods -::isDirectory List only who is files */
		for (File file : files) {
			System.out.println(file);
		}
		
		sc.close();

	}

}
