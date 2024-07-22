j  import java.util.*;
class BuzzNumber
{
   public static void main(String[] args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number : ");
	 int num=sc.nextInt();
	 if(num%7==0 || num%10==7)
	 {
		System.out.println("It is a Buzz Number ");
	 }
	 else
	 {
		System.out.println(" it is a not buzz Number ");
	 }
   }
}