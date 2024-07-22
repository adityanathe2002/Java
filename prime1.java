import java.util.Scanner;
class prime1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int j=num;
		for(int k=1;k<=num;k++)
		{
			int count=0;
			for(int i=2;i<j;i++)
			{
				if(num%i==0)
				{
						count++;
						break;
				}
				// System.out.println(i+" ");
				if(count==0)
				{
						System.out.println("Prime");
				}
				else
				{
						System.out.println("NOt Prime");
			 	}
			 	System.out.println(i +" ");
			}
		}
		
	}
}