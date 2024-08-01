import java.io.*;

class Result 
{  
    public static String createPalindrome(String s) 
    {
        if (isPalindrome(s)) 
        {
            return s;
        }

        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < n; i++) 
        {
            if (s.substring(0, n - i).equals(rev.substring(i))) 
            {
                return rev.substring(0, i) + s;
            }
        }

        return "";
    }
    private static boolean isPalindrome(String s) 
    {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = Result.createPalindrome(s);
        System.out.println(result);
        bufferedReader.close();
    }
}