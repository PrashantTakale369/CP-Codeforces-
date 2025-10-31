import java.util.Scanner;

public class A_Painting_With_Two_Colors{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        while(t-- > 0){

            long n = sc.nextInt();  // ----- >  number of cells 
            // all are white init

            // x =   1 <=  x  < n - (a+1)        ======>   x + ....+  x  + (a -1)   ----> Red cell
            // y =   1 <=  y  < n - (b+1)        ======>   y + ....+  y  + (b -1)   ----> blue cell


            // if x == y  ----->    then  blue cell 

            long a = sc.nextInt();  // the no of cells to be painted in each step
            long b = sc.nextInt();  // the no of cells to be painted in each step

            if( n == a && n == b){
                System.out.println("YES");
                continue;
            }

            if (a == n || b == n) {   // only one fills -> check carefully
                System.out.println("NO");
                continue;
            }

            if(n % 2 ==0 && a % 2 == 0 && b % 2 ==0){          // all even
                System.out.println("YES");
                break;
            }else if(n % 2 !=0 && a % 2 != 0 && b % 2 != 0){   // all odd
                System.out.println("YES");
            }else if(n % 2 == 0 && a % 2 == 0 && b % 2 != 0){  // all a odd but b even  
                System.out.println("YES");
            }else if(n % 2 ==0 && a % 2 != 0 && b % 2 == 0){   // all a even but b odd
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}