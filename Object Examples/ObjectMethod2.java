class Student
{
	String name;
	String place;
	String branch;
	int yop;

	Student(String name, String place, String branch,int yop)
	{
		this.name=name;
		this.place=place;
		this.branch=branch;
		this.yop=yop;
	}
	public boolean equals(Object obj)
	{
		Student obj2=(Student)obj;
		if((this.name==obj2.name)&&(this.place==obj2.place)&&(this.branch==obj2.branch)&&(this.yop==obj2.yop))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ObjectMethod2
{
	public static void main(String[] args) 
	{
		Student obj1=new Student ("Ramesh", "Pune","Mechanical",2023);
		Student obj2=new Student ("Ramesh", "Pune","Mechanical",2023);
		System.out.println(obj1.equals(obj2));
	}
}