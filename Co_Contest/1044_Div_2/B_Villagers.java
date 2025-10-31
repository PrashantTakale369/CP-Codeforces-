import java.util.*;

public class B_Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            long total = 0;
            
            // Pair from the back

            for(int i = n - 1; i > 0; i -= 2) {
                total += arr[i]; 
            }

            if (n % 2 == 1) {      // if arr len is even then add the first element
                total += arr[0];
            }

            System.out.println(total);
        }
    }
}
    