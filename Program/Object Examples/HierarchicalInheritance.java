class Electronics
{
	String color;
	String brand;

	Electronics(String color,String brand)
	{
		this.color=color;
		this.brand=brand;
	}
	void displayElectronics()
	{
		System.out.println();
		System.out.println("*** Electronics ***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
	}
}
class Mobile extends Electronics
{
	String model;
	int ram;
	int rom;
	double price;

	Mobile(String model,int ram,int rom,double price,String color,String brand)
	{
		super(color,brand);
		this.model=model;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}
	void displayMobile()
	{
		System.out.println();
		System.out.println("*** Mobile Dertails ***");
		System.out.println("Model : "+this.model);
		System.out.println("RAM : "+this.ram);
		System.out.println("ROM : "+this.rom);
		System.out.println("Price : "+this.price+"rs.");
		System.out.println("___________________________________________________________________");
	}
}
class Laptop extends Electronics
{
	String processer;
	int ram;
	int rom;
	double price;
	String operatingSystem;

	Laptop(String processer,int ram,int rom,double price,String operatingSystem,String color,String brand)
	{
		super(color,brand);
		this.processer=processer;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
		this.operatingSystem=operatingSystem;
	}
	void displayLaptop()
	{
		System.out.println();
		System.out.println("*** Laptop Dertails ***");
		System.out.println("Processer : "+this.processer);
		System.out.println("RAM : "+this.ram+"GB");
		System.out.println("ROM : "+this.rom+"GB SSD");
		System.out.println("Price : "+this.price);
		System.out.println("Operating System : "+this.operatingSystem);
		System.out.println("____________________________________________________________________");
	}
}
class SmartTv extends Electronics
{
	int displaySize;
	String screenType;
	double price;
	int hdmiPorts; 

	SmartTv(int displaySize,String screenType, double price,int hdmiPorts,String color,String brand)
	{
		super(color,brand);
	    this.displaySize=displaySize;
	    this.screenType=screenType;
		this.price=price;
		this.hdmiPorts=hdmiPorts;
	}
	void displaySmartTv()
	{
		System.out.println();
		System.out.println("*** SmartTv Details ***");
		System.out.println("Display Size : "+this.displaySize+" inch");
		System.out.println("Screen Type : "+this.screenType);
		System.out.println("Price : "+this.price);
		System.out.println("HDMI Ports : "+this.hdmiPorts);
	}
}

class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
		Mobile obj=new Mobile("Y20i",8,64,10000,"Black","Vivo");
		obj.displayElectronics();
		obj.displayMobile();

		Laptop obj1=new Laptop("i5",8,256,50000,"Win10","Silver","HP");
		obj1.displayElectronics();
		obj1.displayLaptop();

		SmartTv obj2=new SmartTv(32,"LED",20000,2,"Black","LG");
		obj2.displayElectronics();
		obj2.displaySmartTv();
	}
}