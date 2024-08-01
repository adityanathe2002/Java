class Cpu
{
	int ram;
	int rom;
	String processor;

	Cpu(int ram,int rom,String processor)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
	}
	public void displayCpu()
	{
		System.out.println();
		System.out.println("****Details CPU****");
		System.out.println("RAM : "+this.ram +" GB");
		System.out.println("ROM : "+this.rom +" GB");
		System.out.println("Processor : "+ this.processor +" GHz");
	}
}
class Monitor
{
	int displaySize;
	String resolution;
	String color;

	Monitor(int displaySize,String resolution,String color)
	{
		this.displaySize=displaySize;
		this.resolution=resolution;
		this.color=color;
	}
	public void displayMonitor()
	{
		System.out.println();
		System.out.println("***Monitor Details***");
		System.out.println("Display Size : "+this.displaySize+" inch");
		System.out.println("Resoluton : "+this.resolution);
		System.out.println("Color : "+this.color);
	}
}
class Keyboard
{
	String brand;
	int noOfKeys;
	String backlight;
	String type;

	Keyboard(String brand,int noOfKeys,String backlight,String type)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.backlight=backlight;
		this.type=type;
	}
	public void displayKeyboard()
	{
		System.out.println();
		System.out.println("***Keyboard Details***");
		System.out.println("Brand : "+this.brand);
		System.out.println("No Of Keys : "+ this.noOfKeys);
		System.out.println("Backlight(yes/No) : "+this.backlight);
		System.out.println("Type : "+this.type);
	}
}
class Mouse
{
	String brand;
	String type;
	int buttons;
	String scroll;

	Mouse(String brand,String type ,int buttons,String scroll)
	{
		this.brand=brand;
		this.type=type;
		this.buttons=buttons;
		this.scroll=scroll;
	}
	public void displayMouse()
	{
		System.out.println();
		System.out.println("***Mouse Details***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Buttons : "+this.buttons);
		System.out.println("Scroll(yes/No : "+this.scroll);
	}
}
class Speakers
{
	String brand;
	String type;
	int noOfSpeakers;
	int watt;

	Speakers(String brand,String type,int noOfSpeakers,int watt)
	{
		this.brand=brand;
		this.type=type;
		this.noOfSpeakers=noOfSpeakers;
		this.watt=watt;
	}
	public void displaySpeakers()
	{
		System.out.println();
		System.out.println("***Speakers Details***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("No Of Speakers : "+this.noOfSpeakers);
		System.out.println("Watt : "+this.watt);
	}
}
class AggregationExample1
{
	public static void main(String[] args) 
	{
		Cpu obj=new Cpu(8,256,"Intel 3.5");
		obj.displayCpu();
		Monitor monitor =new Monitor(25,"Full HD","Black");
		monitor.displayMonitor();
		Keyboard keyboard=new Keyboard("HP",87,"Yes","Mechanical");
		keyboard.displayKeyboard();
		Mouse mouse=new Mouse("HP","Wireless",2,"Yss");
		mouse.displayMouse();
		Speakers speaker=new Speakers("JBL","Bluetooth",2,21);
		speaker.displaySpeakers();
	}
}