import java.util.*;

public class A_Only_One_Digit_1037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  
        
        while (t-- > 0) {

            String s = sc.next(); // input taking in the Strig format.
            

            int minDigit = 9;
            
            for (int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';
                minDigit = Math.min(minDigit, digit);
            }


            System.out.println(minDigit);
        }
    }
}
