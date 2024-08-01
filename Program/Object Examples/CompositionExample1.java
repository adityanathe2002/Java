class Camera
{
	String model;
	String brand;
	String series;
	String type;
	double effectivePixel;
	double price;
	Lens obj1=new Lens("Sony","SEL55210/BQ","TelePhoto",18500,"WildLife","NO",80);


	Camera(String model,String brand,String series,String type,double effectivePixel,double price)
	{
		this.model=model;
		this.brand=brand;
		this.series=series;
		this.type=type;
		this.effectivePixel=effectivePixel;
		this.price=price;
	}
	public void displayCamera()
	{
		System.out.println();
		System.out.println("***Camera Details***");
		System.out.println();
		System.out.println("Model : "+this.model);
		System.out.println("Brand : "+this.brand);
		System.out.println("Series : "+this.series);
		System.out.println("Type : "+this.type);
		System.out.println("Effective Pixels : "+this.effectivePixel);
		System.out.println("Price : "+this.price+"rs.");
	}
}
class Lens
{
	String brand;
	String model;
	String type;
	double price;
	String suitableFor;
	String waterResistance;
	double weigth;

	Lens(String brand,String model,String type,double price,String suitableFor,String waterResistance,double weigth)
	{
		this.model=model;
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.suitableFor=suitableFor;
		this.waterResistance=waterResistance;
		this.weigth=weigth;
	}
	public void displayLens()
	{
		System.out.println();
		System.out.println("***Lens Details***");
		System.out.println();
		System.out.println("Model : "+this.model);
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.price+"rs.");
		System.out.println("Suitable For : "+this.suitableFor);
		System.out.println("Water Resistance : "+ this.waterResistance);
		System.out.println("Weigth : "+ this.weigth+ "gm");
	}
}
class CompositionExample1
{
	public static void main(String[] args) 
	{
		Camera obj=new Camera("1500D","Canon","EOS","DSLR",24.1,40690);
		obj.displayCamera();
		obj.obj1.displayLens();

	}
}