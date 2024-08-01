import java.util.*;
class Developer 
{
    String name;
    String programmingLanguage;
    int experienceYears;
    double salary;

    Developer(String name, String programmingLanguage, int experienceYears,double salary) 
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
        this.salary=salary;
    }

    public void displayDeveloperInfo() 
    {
        System.out.println();
        System.out.println("**** Developer Information ****");
        System.out.println("Name: " + this.name);
        System.out.println("Programming Language: " + this.programmingLanguage);
        System.out.println("Experience (years): " + this.experienceYears);
        System.out.println("Salary : "+ this.salary);
    }
}

class FrontendDeveloper extends Developer 
{
    String[] frontendTechnologies;

    FrontendDeveloper( String[] frontendTechnologies,String name, String programmingLanguage, int experienceYears,double salary) 
    {
        super(name, programmingLanguage, experienceYears,salary);
        this.frontendTechnologies = frontendTechnologies;
    }

    public void displayFrontendDeveloperInfo() 
    {
        System.out.println();
        System.out.println("*** Frontend Developer ****");
        System.out.println("Frontend Technologies: "+ Arrays.toString(this.frontendTechnologies));
    }
}

class SingleLevelDriver2
{
    public static void main(String[] args) 
    {
        String[] frontendTech = {"HTML", "CSS", "JavaScript"};
        FrontendDeveloper frontendDev = new FrontendDeveloper(frontendTech,"Aditya", "JavaScript",5,50000);
        frontendDev.displayDeveloperInfo();
        frontendDev.displayFrontendDeveloperInfo();
    }
}
