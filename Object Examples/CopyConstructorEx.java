class Marker
{
	String brand;
	String type;
	boolean refillable;
	double price;
	String color;

	Marker(String brand, String type,  boolean refillable,String color,double price )
	{
		this.brand = brand;
		this.type = type;
		this.refillable = refillable;
		this.price = price;
		this.color = color;
		System.out.println("Marker Created");
	}
	// copy constructor
	Marker(Marker obj)
	{
		this.brand =obj.brand;
		this.type =obj.type;
		this.refillable =obj.refillable;
		this.color = obj.color;
		this.price = obj.price;
		System.out.println("Copy Of Marker Created");
	}
	void displayMarker()
	{
		//System.out.println();
		System.out.println("Marker Details :- ");
		System.out.println("Brand : "+ this.brand);
		System.out.println("Type : "+ this.type);
		System.out.println("Refillable : "+ this.refillable);
		System.out.println("Price : "+ this.price);
		System.out.println("Color : "+ this.color);
		System.out.println();
	}
}
class CopyConstructorEx
{
	public static void main(String[] args) {
		Marker obj =new Marker("Camlin","White Board Marker",true, "Black",  30);
		obj.displayMarker();

		Marker obj1=new Marker(obj);
		obj1.displayMarker();

		Marker obj2 =new Marker(obj);
		obj2.color="Red";
		obj2.displayMarker();
	}
}