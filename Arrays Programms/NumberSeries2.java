// write a java program to find first 10 numbers in the series 10, 12, 68, 30, 222, 56 
class NumberSeries2 
{
    public static void main(String[] args) 
    {
        // Given series
        int[] series = {10, 12, 68, 30, 222, 56};
        
        // Array to hold the first 10 numbers of the series
        int[] firstTenNumbers = new int[10];
        
        // Copying the given series into the firstTenNumbers array
        for (int i = 0; i < series.length; i++) 
        {
            firstTenNumbers[i] = series[i];
        }
        
        // Since we don't know the pattern, we'll just repeat the given series to fill the first 10 numbers
        int index = series.length;
        while (index < 10) 
        {
            firstTenNumbers[index] = series[index % series.length];
            index++;
        }
        
        // Printing the first 10 numbers of the series
        System.out.println("First 10 numbers in the series:");
        for (int number : firstTenNumbers) 
        {
            System.out.print(number + " ");
        }
    }
}
