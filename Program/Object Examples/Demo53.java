import java.util.*;
public class Demo53
{
    public static int findValue(String column) 
    {
        int result = 0;  // initially result is 0
        for (int i = 0; i < column.length(); i++) 
        {
            char ch = column.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Char: ");
        String input=sc.next().toUpperCase(); 
        int output = findValue(input);
        System.out.println(output);  
    }
}

