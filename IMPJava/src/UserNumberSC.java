import java.util.Scanner;

public class UserNumberSC {

	public static void main(String[] args) {
		
		System.out.print("Enter One Number:");

		Scanner sc= new Scanner(System.in);
		
		int no=sc.nextInt();				
		
		System.out.println(no*no);
		
	}

}
