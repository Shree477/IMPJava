class A
{
	void display()
	{
		System.out.println("This is Display Method of Parent Class");
	}
}

class B extends A
{ 	
	void show()
	{
		System.out.println("This is Display Show of Child Class");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {

		B b1=new B();
		b1.display();
		b1.show();
		
		
	}

}
