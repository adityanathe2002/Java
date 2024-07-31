import java.util.*;
class FruitStore
{
	String fruits[];
	static Scanner sc=new Scanner(System.in);

	public void storeFruits(String fruits[])
	{
		this.fruits=fruits;

		for(int i=0;i<fruits.length;i++ ) 
		{
			fruits[i]=sc.next();
		}
	}
	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}
	public void changefruits()
	{
		System.out.print("Enter the Fruit: ");
		String inputFruit=sc.next();

		for(int i=0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
				System.out.println("*** Macthes ***");
				System.out.print("Enter New Fruit To Update: ");
				String newFruit=sc.next();
				fruits[i]=newFruit;
				break;
			}
		}	
	}
	public static void main(String[] args) 
	{
		// System.out.print("Enter the Size: ");
		// int size=sc.nextInt();

		// System.out.println("Enter The Fruits: ");
		// String fruits[]=new String[size];

		// FruitStore f=new FruitStore();
		// f.storeFruits(fruits);
		// f.displayFruits();
		// f.changefruits();

		FruitStore f=new FruitStore();

		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter An Option");
			System.out.println("1. Store Fruit");
			System.out.println("2. display Fruits");
			System.out.println("3. Change Fruit");
			System.out.println("4. Exits");
			int options=sc.nextInt();
			switch(options)
			{
			case 1:
				{
					System.out.println("Enter The Size: ");
					int size=sc.nextInt();

					System.out.println("Enter The Fruits: ");
					String fruits[]=new String[size];
					f.storeFruits(fruits);
					break;
				}
			case 2:
				{
					if(f.fruits==null)
					{
						System.out.println("Add Fruit First To Display");
					}
					else
					{
						f.displayFruits();
					}
				}
				break;
			case 3:
				{
				    if(f.fruits==null)
					{
						System.out.println("Please Add The Fruits First To Make An Update");
					}
					else
					{
						f.changefruits();
					}
				}
				break;
			case 4:
				{
					exit=false;
				}
		default:System.out.println("Invalid Options");
		}
    }
	}
}