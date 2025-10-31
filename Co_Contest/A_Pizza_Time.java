import java.util.*;
public class A_Pizza_Time {
    public static void main(String[] args) {

        /*


        if < 2   < ---- alex eat all of them 


        m >= 3 
        ---:

        m = m1 + m2 + m3


        but ---- >  m1 < m2 < m3


        m1 < -- hao
        m2 < -- alex



        m3  < -- add next day


        maximum total number of slices 
        
        ---->>>>>>  Hao can eat if he always chooses 
        
         ---->>> the partition optimally





         */

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            if(n<=2) System.out.println(0);
            else{
               System.out.println((n-1)/2);
            }

        }
    }
}