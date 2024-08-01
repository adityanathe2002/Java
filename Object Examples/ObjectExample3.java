class Car
{
	String brand;
	String model;
	String engine;
	String type;
	double mileage;
	byte seatingCapacity;
	double price;
	int noAirbags;

	public void displayCar()
	{
		System.out.println("**** Car Details ****");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Engine Type : "+engine);
		System.out.println("Type : "+type);
		System.out.println("Milage : "+ mileage +" km/l");
		System.out.println("Seating Capacity : "+seatingCapacity);
		System.out.println("Price : "+price +" rs.");
		System.out.println("No of Airbags : "+noAirbags);
	}
}
class ObjectExample3
{
	public static void main(String[] args)
	{
		Car obj= new Car();
		obj.brand="BMW";
		obj.model="X3";
		obj.engine="SI";
		obj.type="Manual";
		obj.mileage=15;
		obj.seatingCapacity=4;
		obj.price=15000000;
		obj.noAirbags=4;
		obj.displayCar();
	}
}