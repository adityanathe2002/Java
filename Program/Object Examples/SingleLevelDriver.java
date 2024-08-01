import java.util.*;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVarsion;
	String extension;

	ProgrammingLanguage(String type,String level,int inventedYear,String founderName,double latestVarsion ,String extension)
	{
		super();
		this.type=type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.founderName=founderName;
		this.latestVarsion=latestVarsion;
		this.extension=extension;
	}
	public void displayProgrrammingLanguage()
	{
		System.out.println();
		System.out.println("**** Programming Language ****");
		System.out.println("Type : "+this.type);
		System.out.println("Level : "+this.level);
		System.out.println("Invented Year : "+this.inventedYear+" Year");
		System.out.println("Founder Name : "+this.founderName);
		System.out.println("Latest Version : "+this.latestVarsion);
		System.out.println("Extension : "+this.extension);
	}
}
class Java extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependant;

	Java(String[] features, boolean platformIndependant,String type,String level,int inventedYear,String founderName,double latestVarsion ,String extension)
	{
		super(type,level,inventedYear,founderName,latestVarsion,extension);
		this.features=features;
		this.platformIndependant=platformIndependant;
	}
	public void displayJava()
	{
		System.out.println();
		System.out.println("**** JAVA ****");
		System.out.println("It Is Plattform Independant : "+this.platformIndependant);
		System.out.println("Features of JAVA : "+ Arrays.toString(this.features));
	}
}
class SingleLevelDriver
{
	public static void main(String[] args) 
	{
		String [] features={"1.MultiThreaded","2.Secure and Robust","3.Portable","4.Dynamic"};
		Java obj =new Java(features,true,"Object Oriented","High Level",1991,"James Gosling",1.22,".java");
		obj.displayProgrrammingLanguage();
		obj.displayJava();
	}
}