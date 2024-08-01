class Mobile
{
	String brand;
	String model;
	int ram;
	int rom;
	double price;

	Mobile(String brand, String model, int ram, int rom, double price)
	{
		this.brand=brand;
		this.model=model;
		this.ram=ram;
		this.rom=rom;
		this.price=price;
	}
	void displayMobile()
	{
		System.out.println("Mobile Detail");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Price : "+ price);
	}
}
class ObjectExample4
{
	public static void main(String[] args) 
	{
		Mobile obj1=new Mobile("Samsung", "S23",12, 512,130000);
		obj1.displayMobile();
		System.out.println();

		Mobile obj2 =new Mobile("Vivo","V56",8,256,50000);
		obj2.displayMobile(); 
	}
}