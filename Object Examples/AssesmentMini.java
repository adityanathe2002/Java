import java.util.*;
public class AssesmentMini
 {
    public static int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static String goodSequenceProbability(int N, int M, int[] sequence) 
    {
        int count = 0;
                for (int num : sequence) 
        {
            if (num % M == 0) 
            {
                count++;
            }
        }
        int P = (count > 0) ? (1 << count) - 1 : 0; // 2^count - 1
        int Q = (1 << N) - 1; // 2^N - 1
        
        if (P == 0) 
        {
            return "0/" + Q;
        }
        
        // Reduce P and Q by their GCD
        int commonDivisor = gcd(P, Q);
        P /= commonDivisor;
        Q /= commonDivisor;
        
        return P + "/" + Q;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int T = Integer.parseInt(scanner.nextLine().trim());
        
        StringBuilder result = new StringBuilder();
        
        for (int t = 0; t < T; t++) 
        {
            String[] firstLine = scanner.nextLine().trim().split(",");
            int N = Integer.parseInt(firstLine[0]);
            int M = Integer.parseInt(firstLine[1]);
            
            String[] secondLine = scanner.nextLine().trim().split(",");
            int[] sequence = new int[N];
            for (int i = 0; i < N; i++) 
            {
                sequence[i] = Integer.parseInt(secondLine[i]);
            }
            result.append(goodSequenceProbability(N, M, sequence)).append("\n");
        }
        System.out.print(result.toString());
        scanner.close();
    }
}