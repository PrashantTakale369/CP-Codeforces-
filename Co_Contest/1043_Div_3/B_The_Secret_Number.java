import java.util.*;

public class B_The_Secret_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();

         // ex : - n = 1 1 1 1 

            // --> appended a positive number of zeros to the right of it 

            // no of Zeros Should Br >= 1

            // y = 1 1  + 1 1 0 0   == 1 1 1 1

            // Decide the Spred the no  n=x+y

            // n = x + y  ==>  Find all the X 
            
            // if their is no sutiable x then o/p = > 0


        while(t--> 0){

            long n = sc.nextLong();  // Vadim cha no 

            long pow = 10;

            ArrayList<Long> ans = new ArrayList<>();

            while( (pow + 1) <= n ){

                long denom = pow + 1;

                if(n % denom == 0){

                    ans.add(n / denom);
                }

                pow *= 10;
            }

            Collections.sort(ans);


            if(ans.size() == 0){
                System.out.println(0);
            }else{
                System.out.println(ans.size());

                for(int i = 0 ; i < ans.size() ; i++){

                    if(i > 0) System.out.print(" ");

                    System.out.print(ans.get(i));
                }

                System.out.println();
            }
            
        } 
    }  
}
