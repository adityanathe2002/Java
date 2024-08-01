import java.util.*;

public class IntegerArrayProcessor 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the input
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) 
        {
            inputArray[i] = sc.nextInt();
        }
        
        // Process the array
        String result = processArray(inputArray);
        
        // Output the result
        System.out.println(result);
    }

    public static String processArray(int[] array) 
    {
        Set<Integer> uniqueDigits = new LinkedHashSet<>();
        
        for (int number : array) 
        {
            // Step 1: Split each number into digits and reverse it
            int reversedNumber = reverseNumber(number);
            
            // Step 2: Generate the largest possible number from reversed digits
            int largestNumber = largestPossibleNumber(reversedNumber);
            
            // Step 3: Add digits to the set to ensure uniqueness
            addDigitsToSet(largestNumber, uniqueDigits);
        }
        
        // Step 4: Generate encoded string from the unique digits
        String encodedString = encodeDigits(uniqueDigits);
        
        return encodedString;
    }
    
    private static int reverseNumber(int number) 
    {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return reversed;
    }
    
    private static int largestPossibleNumber(int number) 
    {
        char[] digits = String.valueOf(number).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        return Integer.parseInt(sb.reverse().toString());
    }
    
    private static void addDigitsToSet(int number, Set<Integer> set) 
    {
        while (number > 0) 
        {
            set.add(number % 10);
            number /= 10;
        }
    }
    
    private static String encodeDigits(Set<Integer> digits) 
    {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) 
        {
            if (digit == 0) 
            {
                sb.append('$');
            } else if (digit % 2 == 0) 
            {
                sb.append('*');
            } else 
            {
                sb.append('#');
            }
        }
        return sb.toString();
    }
}
