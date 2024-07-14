package P2;

public class Student {
	
	int id;
	String name;
	String city;
									// Constructor OverLoading
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(String name,int id, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	

}
