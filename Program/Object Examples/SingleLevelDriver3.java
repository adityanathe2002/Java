class Jdk
{
	String version;
	String vendor;
	String releasedYear;

	Jdk(String version,String vendor,String releasedYear)
	{
		this.version=version;
		this.vendor=vendor;
		this.releasedYear=releasedYear;
	}
	public void displayJdk()
	{
		System.out.println();
		System.out.println("*** JDK Information ***");
		System.out.println("Version : "+this.version);
		System.out.println("Vendor : "+this.vendor);
		System.out.println("Released Year : "+this.releasedYear);
	}
}
class Jvm extends Jdk
{
	String type;
    int maxMemory;
    int heapSize;
    boolean isServer;

    Jvm(String version,String vendor,String releasedYear,String type,int maxMemory,int heapSize,boolean isServer)
    {
    	super(version,vendor,releasedYear);
    	this.type=type;
    	this.maxMemory=maxMemory;
    	this.heapSize=heapSize;
    	this.isServer=isServer;
    }
    public void displayJvm()
    {
    	System.out.println();
    	System.out.println("*** JVM Information ***");
    	System.out.println("Type : "+ this.type);
    	System.out.println("Max Memory : "+ this.maxMemory+" MB");
    	System.out.println("Heap Size : "+ this.heapSize +" MB");
    	System.out.println("Is Server : "+ this.isServer);
    }
}
class SingleLevelDriver3
{
	public static void main(String[] args) 
	{
		Jvm obj = new Jvm("1.11","Oracle","2018","HotSpot", 4096, 2048, true);
		obj.displayJvm();
		obj.displayJdk();
	}
}