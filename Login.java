package task11;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class Login {

	public static void main(String[] args) {
//		String Uname[]= {"Admin","User1","User2"};
//		for (int i=0;i<3;i++)
//			System.out.println(Uname[i].equals("Admin")+Uname[i]);
		String name,password;
		String Uname[]= {"Admin","User1","User2"};
		String Pass[]= {"Admin123","pass","word"};
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the user name:");
		name=scan.nextLine();
		System.out.println("Enter the password: ");
		password=scan.nextLine();
		System.out.println("Entered Username:"+name+" Password :"+password);
		try {
			int poc;
			for(int i=0;i<3;i++) {
				if(Uname[i].equals(name))
					poc=i;
				else
					throw new NameNotFoundException("User Name not found please try again");
				if(password.equals(Pass[poc])) {
					System.out.println("Welcome to the webpage");
					break;
				}
				else
					throw new MissingFormatArgumentException("Password is not matching please try again");
			}
		}catch(NameNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(MissingFormatArgumentException ex1) {
			System.out.println(ex1.getMessage());
		}
	}

}
