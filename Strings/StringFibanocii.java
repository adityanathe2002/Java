import java.util.Scanner;
class StringFibanocii
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num to want upto the fibaonacii: ");
		int num=sc.nextInt();
		fibo(num);
	}
	static void fibo(int num)
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for (int i=0;i<num-2;i++) 
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
}