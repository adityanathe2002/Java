class Human implements Cloneable
{
	String name;
	String gender;
	String place;
	String proffession;

	Human(String name, String gender,String place, String proffession)
	{
		this.name=name;
		this.gender=gender;
		this.place=place;
		this.proffession=proffession;
	}
	public String toString() 
	{
		return this.name+" , "+this.gender +" , "+this.place+" , "+this.proffession;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


class ObjectMethod3
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Human obj1=new Human("Ramesh","Male","Pune","Enigineer");
		System.out.println(obj1);

		Human obj2=(Human)obj1.clone();
		System.out.println(obj2);

		obj2.name="Suresh";
		System.out.println(obj1);
		System.out.println(obj2);
    }
}
