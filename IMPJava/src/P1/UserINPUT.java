package P1;

import java.util.Scanner;

public class UserINPUT {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter City");
		String city=sc.next();
		
		
		Student s1=new Student(id,name,city);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());

		
		
		
		
		
		
		
		
		
		
	}

}
