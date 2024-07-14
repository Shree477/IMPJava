import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		System.out.println("Enter your Marks:");

		Scanner sc = new Scanner(System.in);
		int Marks=sc.nextInt();

		
		if (Marks>=80)
		{
			System.out.println("Distinction");
		}
		else if(Marks>=60)
		{	
			System.out.println("First Class");
		}
		else if(Marks>=40)
		{	System.out.println("Pass");
		}
		else if(Marks<40)
		{
			System.out.println("Fail");
		}
	
	}
}
