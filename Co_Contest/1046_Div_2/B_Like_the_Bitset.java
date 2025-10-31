import java.util.*;
// https://www.youtube.com/watch?v=8TOhFtMMbUA&ab_channel=KaranMashru

public class B_Like_the_Bitset {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();   // < -- len of s
            int k = sc.nextInt();// < -- ?????  integer in the statement

            String str = sc.next(); // < -- binary string

            int arr[] = new int[n];


            int cnt = 0 ; 
            int j = 1 ;
            int i ;

            for(i = 0 ; i < n ; i++){

                if(str.charAt(i) == '1'){
                    cnt++;
                    arr[i] = j;
                    j++;

                    if(cnt == k){
                        break;
                    }

                }else{
                    cnt = 0 ;
                }
            }

            if( i < n){
                System.out.println("NO");
                continue;
            }

            for(i = 0 ; i < n ; i++){
                if(str.charAt(i )== '0'){
                    arr[i] = j;
                    j++;
                }
            }

            System.out.println("YES");

            for(i = 0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();

        }


    }
    
}
