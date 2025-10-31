import java.util.*;

public class D_Yet_Another_Array_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long[] arr = new long[n]
            ;
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

            
            boolean hasOne = false;

            for (long val : arr) {
                if (val == 1) {
                    System.out.println(2);
                    hasOne = true;
                    break;
                }
            }

            if (hasOne) continue;


            long answer = -1;

 
            for (long x = 2; x <= 100; x++) {

                boolean ok = false;

                for (long val : arr) {
                    long a = val;
                    long b = x;


                    while (b != 0) {  // x != 0

                        long temp = a % b;
                        a = b;
                        b = temp;

                        
                    }

                    if (a == 1) { 
                        ok = true;
                        break;
                    }
                }

                if (ok) {
                    answer = x;
                    break;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
