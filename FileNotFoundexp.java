package task11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundexp {

	public static void main(String[] args) {
		String filePath;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the File Path:");
		filePath=sc.nextLine();
		try {
			FileReader fr=new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr); 
			String data =null; 
		    while ((data = br.readLine()) != null)  
		    { 
		        System.out.println(data); 
		    }  
		    sc.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}