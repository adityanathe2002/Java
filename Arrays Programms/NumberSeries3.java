// write a java program to find first 10 numbers in the series 781, 783, 793, 791, 805, 799 

class NumberSeries3 
{
    public static void main(String[] args) 
    {
        int[] series = new int[10];
        series[0] = 781;
        
        // Define the initial increments and decrements
        int[] changes = {2, 10, -2, 14, -6};
        
        // Generate the series
        for (int i = 1; i < 10; i++) 
        {
            int changeIndex = (i - 1) % changes.length; // Cycle through changes array
            series[i] = series[i - 1] + changes[changeIndex];
        }
        
        // Print the series
        for (int num : series) 
        {
            System.out.print(num + " ");
        }
    }
}
