import java.util.Scanner;

public class A_In_the_Dream {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            // For first half
            if (Math.max(a, b) > 2 * Math.min(a, b) + 2){
                System.out.println("NO");
                continue;
            }
            if (Math.max(c-a, d-b) > 2*Math.min(c-a, d-b) + 2){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");


        }

    }
    
}

