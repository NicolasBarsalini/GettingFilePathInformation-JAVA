package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		//se eu quiser o nome do arquivo e n o caminho completo:
		System.out.println("getName: " + path.getName()); //pega o nome do arquivo
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		
		sc.close();
		
	}
	
}
