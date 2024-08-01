import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ABCDE 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> 
        {
            try 
            {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) 
            {
                throw new RuntimeException(ex);
            }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        
        String result = Result.processArray(numbers);
        System.out.println(result);
        
        bufferedReader.close();
    }
}

class Result 
{
    public static String processArray(List<Integer> array) 
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