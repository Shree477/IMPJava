
public class SwitchDemo2 {

	public static void main(String[] args) {

			char ch='A';
			
			switch(ch)
			{
			case 'a':
				System.out.println("Small a");
				break;
			case 'A':
				System.out.println("Big A");
				break;
			case 'b':
				System.out.println("Small b");
				break;
			case 'B':
				System.out.println("Big B");
				break;
			default:
				System.out.println("its a Default Case");
			}
				
	}

}
