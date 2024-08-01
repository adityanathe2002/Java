class SmartTv
{
	String brand;
	String modelNumber;
	String colour;
	int displaySize;
	String screenType;
	int noSpeakers;
	String hdTechnology;
	String operatingSystem;
	double price;

	public void displayTv()
	{
		System.out.println("**** Smart TV Details ****");
		System.out.println("Brand : "+brand);
		System.out.println("Model Number : "+modelNumber);
		System.out.println("Colour : "+colour);
		System.out.println("Display Size : "+displaySize+" inch");
		System.out.println("Screen Type : "+screenType);
		System.out.println("No of Speakers : "+noSpeakers);
		System.out.println("HD Technology : "+hdTechnology);
		System.out.println("Operating System : "+operatingSystem);
		System.out.println("Price : "+price+" rs");
	}
}
class ObjectExample2
{
	public static void main(String[] args)
	{
		SmartTv obj =new SmartTv();
		obj.brand="Sony";
		obj.modelNumber="KD-55X75L";
		obj.colour="Black";
		obj.displaySize=55;
		obj.screenType="LED";
		obj.noSpeakers=2;
		obj.hdTechnology="Ultra HD (4k)";
		obj.operatingSystem="Google Tv";
		obj.price=50000;
		obj.displayTv();
	}
}