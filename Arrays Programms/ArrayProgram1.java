import java.util.*;
class ArrayProgram1
{
	int arr[];
	static Scanner sc=new Scanner(System.in);

	public void storeElement(int arr[])
	{
		this.arr=arr;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public void evenNumber()
	{
		for (int i :arr )
		{
			if(i%2==0)
			{
				System.out.println(i+" even number");
			}
		}
	}

	public void oddNumber()
	{
		for (int i :arr )
		{
			if(i%2!=0)
			{
				System.out.println(i+" odd number");
			}
		}
	}

	public void negativeNumber()
	{
		for (int i:arr ) 
		{
			if(i<0)
			{
				System.out.println(i+" Negative");
			}
		}
	}

	public void displayElement()
	{
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		ArrayProgram1 a=new ArrayProgram1();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Choose Your option");
			System.out.println("1. Store Element");
			System.out.println("2. Display Element");
			System.out.println("3. Find Even Number");
			System.out.println("4. Find Odd Number");
			System.out.println("5. Find Negative Number");
			System.out.println("6. Exit");
			System.out.print("Enter an option: ");
			int options =sc.nextInt();
			switch(options)
			{
			case 1:
			{
				System.out.print("Enter The Size: ");
				int size=sc.nextInt();

				System.out.println("Enter The Elemnet: ");
				int element[]=new int[size];
				a.storeElement(element);
				break;
			}
			case 2:
			{
			        a.displayElement();
			        System.out.println("_______________________________");
			        break;
			}
			case 3:
			{
				a.evenNumber();
			        System.out.println("_______________________________");
				break;
			}
			case 4:
			{
				a.oddNumber();
			        System.out.println("_______________________________");
				break;
			}
			case 5:
			{
				a.negativeNumber();
			        System.out.println("_______________________________");
				break;
			}
			case 6:
			{
				exit=false;
				break;
			}
		        default:System.out.println("Invalid");
			}
		}
	}
}

        // System.out.println("Size :");
		// int size=sc.nextInt();

		// System.out.println("Enter The Elements: ");
		// int arr[]=new int[size];

		// ArrayProgram1 a=new ArrayProgram1();
		// a.storeElement(arr);
		// a.evenNumber();
		// a.oddNumber();
		// a.negativeNumber();