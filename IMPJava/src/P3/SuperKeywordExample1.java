package P3;

	class School
	{
		int schoolid;
		String schoolname;
	School(int schoolid,String schoolname)
	{
		this.schoolid=schoolid;
		this.schoolname=schoolname;
	}	
	}
	class Student extends School
	{
		int rollno;
		String name;
		String city;
	
		Student(int schoolid,String schoolname,int rollno, String name, String city)
	{
		super(schoolid,schoolname);
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}	
		public void init(){
			int schoolid= 12;
			String schoolname="Rosary";
		}
		
		
		void display()
	{ 	System.out.println(schoolid);
		System.out.println(schoolname);
		System.out.println(rollno+"1001"+name+"Rajesh"+city);
			
		}
	}