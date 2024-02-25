package task11;
import java.util.Scanner;

public class ArrayAndStringIndexOutBound {

	public static void main(String[] args) {
		
		int n,k,p;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the no:");
		n=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the String:");
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextLine();
		try {
			System.out.println("Enter the index in which you need to access the array:");
			k=scan.nextInt();//if the input exceed the array limit or less then 0 it will pass to ArrayIndexOutOfBoundsException
			System.out.println(arr[k]);
			System.out.println("Enter the index of String which you need access of the selected String:");
			p=scan.nextInt();//if the input exceed the string limit or less then 0 it will pass to StringIndexOutOfBoundsException
			System.out.println(arr[k].charAt(p));
			System.out.println("Selected string is: "+arr[k]+ " Selected char is : "+arr[k].charAt(p));
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}catch(StringIndexOutOfBoundsException ex1) {
			System.out.println(ex1);
		}catch(Exception ex2) {
			System.out.println(ex2);
		}
	}


}