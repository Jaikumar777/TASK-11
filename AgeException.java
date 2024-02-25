package task11;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class AgeException {

	public static void main(String[] args) {
		int age;
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enter the Age to check if its ok to enter the venue:");
		age=scan.nextInt();
		if(age>17)
			System.out.println("you can enter the venue...!");
		else
			throw new InvalidAgeException("Age should be greater then 18 and you have not permitted to enter the venue");	
			
		}catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}