import java.util.Scanner;

public class B_Bitwise_Reversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /*
        
         */

        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            if(a == b && b == c && c == a){
                System.out.println("YES");
            }else{
                if(a%2 == b%2 && b % 2 == c%2 && c%2==a%2){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }

            }
        }
    }
}