class Laptop
{
	String brand;
	String modelNumber;
	double price;
	int ram;
	int rom;
	String processor;
	String type;

	public void displayLaptop()
	{
		System.out.println();
		System.out.println("**** Laptop Details ****");
		System.out.println("Brand : "+ brand);
		System.out.println("Model Number : "+ modelNumber);
		System.out.println("Price : "+price+"rs");
		System.out.println("RAM : "+ram+"gb");
		System.out.println("ROM : "+rom+"gb");
		System.out.println("Processor : "+ processor);
		System.out.println("Type : "+type);
	}
}

class ObjectExample1
{
	public static void main(String[] args)
	{	
		Laptop obj =new Laptop();
		obj.brand="HP";
		obj.modelNumber="HP1234i";
		obj.price=50000;
		obj.ram=8;
		obj.rom=512;
		obj.processor="i7";
		obj.type="Gaming";
		obj.displayLaptop();
		System.out.println();

		Laptop obj2 =new Laptop();
		obj.brand="HP";
		obj.modelNumber="HP1234i";
		obj.price=80000;
		obj.ram=16;
		obj.rom=1024;
		obj.processor="i9";
		obj.type="Gaming";
		obj.displayLaptop();
	}
}