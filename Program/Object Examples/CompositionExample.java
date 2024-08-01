class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand, String model,String type,double price, int seatingCapacity,Engine engine)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine =engine;
	}
	public void displayCar()
	{
		System.out.println("***Car Details***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+ this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("Seating Cap : "+this.seatingCapacity);
	}
}
class Engine
{
	double horsePower;
	double capacity;
	String engineType;
	double milage;
	int noOfPistons;

	Engine(double horsePower,double capacity, String engineType,double milage,int noOfPistons)
	{
		this.horsePower=horsePower;
		this.capacity=capacity;
		this.engineType=engineType;
		this.milage=milage;
		this.noOfPistons=noOfPistons;
	}
	public void displayEngine()
	{
		System.out.println("***Engine Details***");
		System.out.println("Horse Power : "+this.horsePower);
		System.out.println("Capacity : "+this.capacity);
		System.out.println("Engine Type : "+this.engineType);
		System.out.println("Milage : "+this.milage);
		System.out.println("No Of Pistons : "+this.noOfPistons);
	}
}
class CompositionExample
{
	public static void main(String[] args) 
	{
		Car obj1=new Car("TATA","NEXoN","SUV",900000,5,(new Engine(120,1.2,"Petrol",16,4)));
		obj1.displayCar();
		System.out.println();
		obj1.engine.displayEngine();
	}
}