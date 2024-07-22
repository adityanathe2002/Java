import java.util.*;
class PowerNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		int power=1;
		while(num!=10)
		{
			length++;
			num/=10;
		}
		for(int i=1; i<length; i++)
			power*=dup;
		System.out.println(power);
	}
}