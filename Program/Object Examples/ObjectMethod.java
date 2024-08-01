import java.util.*;
class Student
{
	String name;
	String place;
	String branch;

	Student(String name,String place,String branch)
	{
		this.name=name;
		this.place=place;
		this.branch=branch;
	}
	@Override
	public String toString()
	{
		return "Hi my name is "+this.name+" and I belongs to "+this.place+" and I have completed "+this.branch;
	}
}

class ObjectMethod
{
	public static void main(String[] args) 
	{
		Student obj1=new Student("Ramesh","Pune","Mechanical");
		System.out.println(obj1.getClass());
		Student obj2=new Student("Suresh","Mumbai","Mechanical");
		System.out.println(obj2);
		Student obj3=new Student("Ganesh","Pune","Mechanical");
		System.out.println(obj3);
		Student obj4=new Student("Mahesh","Mumbai","Mechanical");
		System.out.println(obj4);
	}
}