 import java.util.*;
// class ArrayProgaram2
// {
//     public static void main(String[] args) 
//     {
//         int[] a={2,-3,4,-5,6,-7,8};
//         int count=0;
//         for (int i:a )
//         {
//             if(i<0)
//             {
//                 count++;
//                   System.out.println(i);
//             }
//         }
//         int []negativeNumber=new int [count];
//         int indx=0;
//         for (int i: a) 
//         {
//             if(i<0)
//                 negativeNumber[indx++]=i;
//         }
//         System.out.println(Arrays.toString(negativeNumber));
//     } 
// }

class ArrayProgaram2
{
    public static void main(String[] args) 
    {
        int[] a={2,-3,4,-5,6,-7,8,10};
        int count=0;
        for (int i:a )
        {
            if(i%2==0)
            {
                count++;
                  System.out.println(i);
            }
        }
        int []evenNumber=new int [count];
        int indx=0;
        for (int i: a) 
        {
            if(i%2==0)
                evenNumber[indx++]=i;
        }
        System.out.println(Arrays.toString(evenNumber));
    } 
}

