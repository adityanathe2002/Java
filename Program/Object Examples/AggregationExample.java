class University
{
	String name;
	String uniCode;
	int noOfColleage;
	String type;
	int establishedYear;
	int course;
	College college1;

	University(String name,String uniCode,int noOfColleage,String type,int establishedYear,int course)
	{
		this.name=name;
		this.uniCode=uniCode;
		this.noOfColleage=noOfColleage;
		this.type=type;
		this.establishedYear=establishedYear;
		this.course=course;
	}
	public void displayUniversity()
	{
		System.out.println();
		System.out.println("****Univerist Details****");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Uni Code : "+this.uniCode);
		System.out.println("No Of Colleges : "+this.noOfColleage);
		System.out.println("Type : "+this.type);
		System.out.println("Estabblished Year : "+this.establishedYear);
		System.out.println("Courses : "+this.course);
	}
	public void createInstanceOfCollege(String name,int collegeCode,String address,int noOfDepartments,char grade,int staffCount)
	{
		college1=new College(name,collegeCode,address,noOfDepartments,grade,staffCount);
	}
}
class College
{
	String name;
	int collegeCode;
	String address;
	int noOfDepartments;
	char grade;
	int staffCount;
	Department department;

	College(String name,int collegeCode,String address,int noOfDepartments,char grade,int staffCount)
	{
		this.name=name;
		this.collegeCode=collegeCode;
		this.address=address;
		this.noOfDepartments=noOfDepartments;
		this.grade=grade;
		this.staffCount=staffCount;
	}
	public void displayCollege()
	{
		System.out.println();
		System.out.println("***College Details***");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("College Code : "+this.collegeCode);
		System.out.println("Address : "+this.address);
		System.out.println("No of Departments : "+ this.noOfDepartments);
		System.out.println("Grade : "+this.grade +"++");
		System.out.println("Staff Count : "+this.staffCount);
	}
	public void createInstanceOfDepartment(String name,String hodName,int classroom,int staff, int subject)
	{
		department=new Department(name,hodName,classroom,staff,subject);
	}
}
class Department
{
	String name;
	String hodName;
	int classroom;
	int staff;
	int subject;
	Teacher teacher;

	Department(String name,String hodName,int classroom,int staff, int subject)
	{
		this.name=name;
		this.hodName=hodName;
		this.classroom=classroom;
		this.staff=staff;
		this.subject=subject;
	}
	public void displayDepartment()
	{
		System.out.println();
		System.out.println("***Department Details***");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("HOD Name : "+this.hodName);
		System.out.println("Classroom : "+this.classroom);
		System.out.println("Staff : "+this.staff);
		System.out.println("Subject : "+this.subject);
	}
	public void createInstanceOfTeacher(String name, String subject,long phoneNumber,String qualification,int experiance)
	{
		teacher =new Teacher(name,subject,phoneNumber,qualification,experiance);
	}
}
class Teacher
{
	String name;
	String subject;
	long phoneNumber;
	String qualification;
	int experiance;

	Teacher(String name, String subject,long phoneNumber,String qualification,int experiance)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNumber=phoneNumber;
		this.qualification=qualification;
		this.experiance=experiance;
	}
	public void displayTeachers()
	{
		System.out.println();
		System.out.println("***Teacher Information***");
		System.out.println();
		System.out.println("Name : "+this.name);
		System.out.println("Subject : "+this.subject);
		System.out.println("Phone Number : "+this.phoneNumber);
		System.out.println("Qualification : "+this.qualification);
		System.out.println("Experiancer : "+this.experiance+"Year");
	}
}
class AggregationExample
{
	public static void main(String[] args) 
	{
		University obj=new University("SPPU","UNI123",1100,"Government",1950,300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("KTHM",0062,"Nashik",50,'A',500);
		obj.college1.displayCollege();
		obj.college1.createInstanceOfDepartment("Electronis","S.S.Dhemse",7,10,50);
		obj.college1.department.displayDepartment();
		obj.college1.department.createInstanceOfTeacher("A.N.Ahirao","Analog",6578363873l,"Ph.D",7);
		obj.college1.department.teacher.displayTeachers();
	}
}