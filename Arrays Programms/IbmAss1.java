// import java.util.*;

// class IbmAss1 
// {
//     public static String getSubstring(String input_str, int k) 
//     {
//         int n = input_str.length();
//         int left = 0;
//         int countOnes = 0;
//         int minLength = Integer.MAX_VALUE;
//         int startIndex = -1;
        
//         for (int right = 0; right < n; right++) 
//         {
//             if (input_str.charAt(right) == '1') 
//             {
//                 countOnes++;
//             }
            
//             while (countOnes == k) 
//             {
//                 int currentLength = right - left + 1;
//                 if (currentLength < minLength) 
//                 {
//                     minLength = currentLength;
//                     startIndex = left;
//                 } else if (currentLength == minLength) {
//                     // Compare lexicographically
//                     String currentSubstring = input_str.substring(left, right + 1);
//                     String smallestSubstring = input_str.substring(startIndex, startIndex + minLength);
//                     if (currentSubstring.compareTo(smallestSubstring) < 0) 
//                     {
//                         startIndex = left;
//                     }
//                 }
                
//                 // Move left pointer to shrink the window
//                 if (input_str.charAt(left) == '1') 
//                 {
//                     countOnes--;
//                 }
//                 left++;
//             }
//         }
        
//         return input_str.substring(startIndex, startIndex + minLength);
//     }

//     public static void main(String[] args) {
//         // Example usage:
//         String input_str = "10101";
//         int k = 2;
//         String result = getSubstring(input_str, k);
//         System.out.println(result);  // Output: "1011"
//     }
// }

import java.util.*;

class Result {
    public static String getSubstring(String input_str, int k) {
        int n = input_str.length();
        int left = 0;
        int countOnes = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        
        for (int right = 0; right < n; right++) {
            if (input_str.charAt(right) == '1') {
                countOnes++;
            }
            
            while (countOnes == k) 
            {
                int currentLength = right - left + 1;
                if (currentLength < minLength) 
                {
                    minLength = currentLength;
                    startIndex = left;
                } else if (currentLength == minLength) 
                {
                    // Compare lexicographically
                    String currentSubstring = input_str.substring(left, right + 1);
                    String smallestSubstring = input_str.substring(startIndex, startIndex + minLength);
                    if (currentSubstring.compareTo(smallestSubstring) < 0) 
                    {
                        startIndex = left;
                    }
                }
                
                // Move left pointer to shrink the window
                if (input_str.charAt(left) == '1') 
                {
                    countOnes--;
                }
                left++;
            }
        }
        
        return input_str.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        // Example usage:
        String input_str = "0101101";
        int k = 3;
        String result = getSubstring(input_str, k);
        System.out.println(result);  // Output: "1011"
    }
}


            
            import java.util.*;

class Result {
    public static String getSubstring(String input_str, int k) {
        int n = input_str.length();
        int left = 0;
        int countOnes = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        
        for (int right = 0; right < n; right++) {
            if (input_str.charAt(right) == '1') {
                countOnes++;
            }
            
            while (countOnes == k) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                } else if (currentLength == minLength) {
                    // Compare lexicographically
                    String currentSubstring = input_str.substring(left, right + 1);
                    String smallestSubstring = input_str.substring(startIndex, startIndex + minLength);
                    if (currentSubstring.compareTo(smallestSubstring) < 0) {
                        startIndex = left;
                    }
                }
                
                // Move left pointer to shrink the window
                if (input_str.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        
        return input_str.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        // Example usage:
        String input_str = "0101101";
        int k = 3;
        String result = getSubstring(input_str, k);
        System.out.println(result);  // Output: "1011"
    }
}   