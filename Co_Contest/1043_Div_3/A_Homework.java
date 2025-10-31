
import java.util.*;

public class A_Homework {
    

    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        

        //-->  append from b to a in any order 

        // V --> beggning of the word add.
        // D --> End of the word add.
        

        while(t--  > 0){

            
        int n = sc.nextInt();  //--> len of the a str.
        String a = sc.next();

        int m =  sc.nextInt();  //--> len of the b str.
        String b = sc.next();

        String c = sc.next();  //---> V D 


        StringBuilder sb = new StringBuilder(a);

        int idx = 0 ;

        for(int i = 0 ; i < c.length()  && idx < m ; i++){

            if(c.charAt(i) == 'V'){

                sb.insert(0, b.charAt(idx++)); 

            }else if(c.charAt(i) == 'D'){

                sb.append(b.charAt(idx++));

            }
        }

            System.out.println(sb.toString());


        }

    }
    
}
