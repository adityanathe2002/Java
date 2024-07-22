class NumberPattern1
{
	static int num=2;
	public static void main(String[] args) 
	{
		int count =0;
		for(int i=1;count!=10;i++)
		{
			if(prime())
			{
				System.out.print(num+ " ");
				count++;
			}
			num++;
		}

	}
	public static boolean prime()
	{
		boolean flag =true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}


// import java.util.*;
// public class NumberPattern1
// {
// public static boolean isPrimeNumber(int num) {
//    int c=0;
//    for (int i = 1; i <= num; i++) {
//       if (num % i == 0)
//          c++;
//    }
//    if (c==2)
//       return true;
//    else
//       return false;
// }
// public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\nEnter no. of rows : ");
//         int rows = sc.nextInt();
//         int counter = 2;    
//          for (int i = 1; i <= rows; i++) {
//          for (int j = 1; j <= i; j++) {
//        /* Try to find next prime number by incrementing counter and testing it for primality */
//         while(!isPrimeNumber(counter)){
//             counter++;
//             }
//         System.out.print(counter+" ");
//         counter++;
//       }
//       System.out.println();
//    }

// }
// }


// 2
// 3  5
// 7  11  13
// 17 19  23  29