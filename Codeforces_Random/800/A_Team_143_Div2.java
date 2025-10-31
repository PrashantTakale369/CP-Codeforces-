
import java.util.Scanner;

public class A_Team_143_Div2 {
    

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   
        int cnt = 0 ;

        while(t-- > 0) {

            int  x = sc.nextInt();
            int  y = sc.nextInt();
            int  z = sc.nextInt();


            if(x + y + z >= 2){
                cnt++;
            }   
        }

        System.out.println(cnt);


    }
    
}
