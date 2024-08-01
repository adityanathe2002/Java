class Human
{
	String name;
	String gender;

	Human(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}
	void displayHuman()
	{
		System.out.println();
		System.out.println("**** Human Details ****");
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println();
	}
	void eat()
	{
		System.out.println("Human can Eat");
	}
	void walk()
	{
		System.out.println("Human can Walk");
	}
	void think()
	{
		System.out.println("Human can Think");
	}
	void speak()
	{
		System.out.println("Human can Speak");
	}
}
class Graduation extends Human
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course=course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}
	void displayGraduation()
	{
		System.out.println();
		System.out.println("*** Graduation ***");
		System.out.println("Course : "+this.course);
		System.out.println("Duration : "+this.duration);
		System.out.println("Branch : "+this.branch);
		System.out.println("University Name : "+this.university);
		System.out.println("YOP : "+this.yop);
	}
}	
class PostGraduation extends Graduation
{
	String specialization;
	int durationpg;
	int yoppg;
	String universitypg;

	PostGraduation(String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(course,duration,branch,university,yop,name,gender);
		this.specialization=specialization;
		this.durationpg=durationpg;
		this.yoppg=yoppg;
		this.universitypg=universitypg;
	}
	void displayPostGrauation()
	{
		System.out.println();
		System.out.println("Post Graduation");
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Duration PG : "+this.durationpg);
		System.out.println("YOP PG : "+this.yoppg+"yrs.");
		System.out.println("University PG : "+this.universitypg);
	}
}
class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company,double salary,String designation , String location,String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(specialization,durationpg,yoppg,universitypg,course,duration,branch,university,yop,name,gender);
		this.company=company;
		this.salary=salary;
		this.designation=designation;
		this.location=location;
	}
	void displayJob()
	{
		System.out.println();
		System.out.println("*** JOB ***");
		System.out.println("Company : "+this.company);
		System.out.println("Salary : "+this.salary+"lakhs");
		System.out.println("Designation : "+this.designation);
		System.out.println("Location : "+this.location);
	}
}
class MultiLevelInheritance
{
	public static void main(String[] args) 
	{
		Job obj =new Job("TCS",7,"Ass. Software Developer","Pune","Cyber Security",2,2026,"SPPU","Bachlors Of Enginering",4,"Mechanical","SPPU",2024,"Ramesh","Male");
		obj.displayHuman();
		obj.eat();
		obj.walk();
		obj.think();
		obj.speak();
		obj.displayGraduation();
		obj.displayPostGrauation();
		obj.displayJob();
	}
}	