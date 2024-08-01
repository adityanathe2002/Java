import java.util.Arrays;
class JDK
{
	String vendor;
	int releasedYear;
	String founder;

	JDK(String vendor,int releasedYear,String founder)
	{
		this.vendor=vendor;
		this.releasedYear=releasedYear;
		this.founder=founder;
	}
	void displayJdk()
	{
		System.out.println();
		System.out.println("*** JDK Details ***");
		System.out.println("Vendor : "+this.vendor);
		System.out.println("Released Year : "+this.releasedYear);
		System.out.println("Founder Name : "+this.founder);
	}
}
class JRE extends JDK
{
	String[] builtInLiabraries;
	JRE(String[] builtInLiabraries,String vendor,int releasedYear,String founder)
	{
		super(vendor,releasedYear,founder);
		this.builtInLiabraries=builtInLiabraries;
	}
	void displayJRE()
	{
		System.out.println();
		System.out.println("*** JRE Details ***");
		System.out.println("Built In Libraries : "+Arrays.toString(this.builtInLiabraries));
	}
}

class JVM extends JRE
{
	String [] classLoaderSubsystem;
	String [] jvmMemoryArea;
	String [] executionArea;

	JVM(String []classLoaderSubsystem,String [] jvmMemoryArea,String []executionArea,String[] builtInLiabraries,String vendor,int releasedYear,String founder)
	{
		super(builtInLiabraries,vendor,releasedYear,founder);
		this.classLoaderSubsystem=classLoaderSubsystem;
		this.jvmMemoryArea=jvmMemoryArea;
		this.executionArea=executionArea;
	}
	void displayJVM()
	{
		System.out.println();
		System.out.println("*** JVM Details ***");
		System.out.println("Class Loader Subsystem : "+Arrays.toString(this.classLoaderSubsystem));
		System.out.println("JVM Memory Area : "+Arrays.toString(this.jvmMemoryArea));
		System.out.println("Execution Area : "+Arrays.toString(this.executionArea));
	}
}

class MultiLevelInheritance1
{
	public static void main(String[] args) 
	{
		String[] classLoaderSubsystem={"1.class Loader","2. Linkage/Linking","3. Initialization"};
		String[] jvmMemoryArea={"Method Area","Heap Area","Stack Area","PC Register","Native Method"};
		String[] executionArea={"Interpreter","JIT Compiler","Profiler","GC"};
		String[] builtInLiabraries={"1. .Lang","2. .util","3. .GUI","4. .Math"};
		JVM obj=new JVM(classLoaderSubsystem,jvmMemoryArea,executionArea,builtInLiabraries, "Oracle",1996,"James Gosling");
		obj.displayJdk();
		obj.displayJRE();
		obj.displayJVM();
	}
}