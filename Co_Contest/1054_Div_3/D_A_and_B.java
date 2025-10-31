import java.util.Scanner;
public class D_A_and_B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();


            if( n == 1 || n == 2) System.out.println(0);


            int i = 0; 
            int j = n-1;

            int min= Integer.MAX_VALUE;
            
            
            while(i < j){

                if(s.charAt(i) != s.charAt(j)){

                    min = Math.min( (s.charAt(i) - 'a'), (s.charAt(j) - 'a') );
                    s += min;


                }

                
            }


            System.out.println(min);

        
        }
    }
    
}
