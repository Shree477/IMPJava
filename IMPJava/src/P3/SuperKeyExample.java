package P3;

	class A
{	
		int id;
		String name;
		
		A(int id,String name)			// Constructor Called
	{	
		this.id=id;
		this.name=name;			
	}	
}
	class B extends A
	{
		
		int rollno;
		String city;

	B(int rollno,String city,int id,String name)
	{
		super(id,name);
		this.rollno=rollno;
		this.city=city;
		
	}
	}

public class SuperKeyExample {

	public static void main(String[] args) {

		B b1=new B(11,"Pune",1001,"ABC"); 
		
	
	}	
}
