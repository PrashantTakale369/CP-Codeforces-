
import java.util.Scanner;

public class A_Watermelon_Div2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int w = sc.nextInt();  // wt of the Watermelon

            if(w % 2 == 0 && w > 2) {
                System.out.println("YES ");
            }else{
                System.out.println("No");
            }
    }
}
    
