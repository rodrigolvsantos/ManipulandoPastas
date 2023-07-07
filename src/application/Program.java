package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);/*Create a vector of files */
		System.out.println("FOLDERS: ");           /*Sintaxe ReferenceOfMethods -::isDirectory List  only who is directory or folder */
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		sc.close();

	}

}
