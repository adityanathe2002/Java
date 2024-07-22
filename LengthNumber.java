import java.util.*;
class LengthNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int length=0;
		while(num>0)
		{
			length++;
			num/=10;
		}
		System.out.print(length);
	}
}