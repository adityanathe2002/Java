import java.util.*;

public class IntegerArrayProcessor1 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        
        System.out.println(processArray(inputArray));
    }
    public static String processArray(int[] array) 
    {
        Set<Integer> uniqueDigits = new LinkedHashSet<>();
        
        for (int number : array) 
        {
            int largestNumber = Integer.parseInt(
                new StringBuilder(String.valueOf(reverseNumber(number)))
                    .reverse()
                    .toString()
            );
            
            while (largestNumber > 0) 
            {
                uniqueDigits.add(largestNumber % 10);
                largestNumber /= 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit : uniqueDigits) 
        {
            sb.append(digit == 0 ? '$' : (digit % 2 == 0 ? '*' : '#'));
        }
        return sb.toString();
    }
    
    private static int reverseNumber(int number) 
    {
        int reversed = 0;
        while (number > 0) 
        {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return reversed;
    }
}
