// wajp to factor of number in stringbuffer object and then display it 

import java.util.Scanner;
class FactorsInStringBuffer
{
	static int num;
	static int count=0;
	public static StringBuffer factors(int num)
	{
		StringBuffer sb1=new StringBuffer();
		for (int i=1;i<=num;i++) 
		{
			if(num%i==0)
			{
			    sb1.append(i+" ");				
			}
		}
		return sb1;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=sc.nextInt();
		// FactorsInStringBuffer.factors();
		StringBuffer sb=factors(num);
		System.out.println(sb);
	}
}