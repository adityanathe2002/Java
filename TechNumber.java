import java.util.*;
class TechNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter A Number : ");
	   int num = sc.nextInt();
	   int dup = num;
	   int length = 0;
	   while(num!=0)
	   {
	   	length++;
	   	num/=10;
	   }	
	   if(length%2==0)
	   {
	   	int div = 1;
	   	for (int i =1; i<=length/2;i++)
	   	{
	   		div = div*10;
	   	}
	   	int firstHalf = dup/div;
	   	int lastHalf = dup%div;
	   	int sum = firstHalf + lastHalf;
	   	int sqr = sum* sum;
	   	System.out.println(dup == sqr? dup +  " tech num" : dup+ " not a tech a num");
	    }
	    else
	    {
	   	System.out.println("Not a tech a number");
	    }
	}
}