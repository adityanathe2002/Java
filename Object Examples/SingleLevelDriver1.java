class Vehicle 
{
    String brand;
    String founderName;
    int inventedYear;
    double price;

    Vehicle(String brand, String founderName, int inventedYear,double price) 
    {
        this.brand = brand;
        this.founderName = founderName;
        this.inventedYear = inventedYear;
        this.price=price;
    }

    public void displayVehicle() 
    {
        System.out.println();
        System.out.println("**** Vehicle Information ****");
        System.out.println("Brand : " + this.brand);
        System.out.println("Founder Name : " + this.founderName);
        System.out.println("Invented Year : " + this.inventedYear);
        System.out.println("Price : "+this.price);
    }
}

class Car extends Vehicle 
{
    String model;
    String type;
    String color;
    int seatingCapacity;

    Car(String brand, String founderName, int inventedYear, double price, String model, String type, String color, int seatingCapacity) 
    {
        super(brand, founderName, inventedYear,price);
        this.model = model;
        this.type = type;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
    }

    public void displayCar() 
    {
        System.out.println();
        System.out.println("*** CAR ****");
        System.out.println("Model : " + this.model);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Seating Capacity : " + this.seatingCapacity);
    }
}

class SingleLevelDriver1 
{
    public static void main(String[] args) 
    {
        Car obj = new Car("TATA", "J.R.D.TATA", 1868,900000, "NEXON", "SUV", "White", 4);
        obj.displayVehicle();
        obj.displayCar();
    }
}	
