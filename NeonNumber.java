// class NeonNumber
// {
// 	public static void main(String[] args) {
// 		for(int j=0; j<=100;j++){
// 		int num =j;
// 		int sqr = num*num;
// 		int sum = 0;
// 		while(sqr>0)
// 		{
// 			int rem=sqr%10;
// 			sum+= rem;
// 			sqr/=10;
// 		}
// 		if(sum==num)
// 		{
// 			System.out.println(num + " Neon Number");
// 		}
// 		else
// 		{
// 			System.out.println(num + " Not a Neon Number ");
// 		}
// 	}
// 	}
// }
class NeonNumber
{
	public static void main(String[] args) {
		for(int i=1;i<=100)
		{
			int num=j;i
			int sqr=num*num;
			int sum=0;
			while(sqr>0)
			{
				int rem=sqr%10;
				sum+=rem;
				sqr/=10;
			}
			if(sum==num)
			{
				System.out.println(num + " neon num");
			}
			else{
				System.out.println(num + " not a Neon Number");
			}
		}
	}
}