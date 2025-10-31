

import java.util.Scanner;

public class A_Shift_Sort {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int  t = sc.nextInt();

        while(t-- > 0) {

            int len = sc.nextInt();
            String str = sc.next();

            int arr[] = new int[len];

            int count = 0;
            int itr = 0;

            for(int i = 0 ; i < len ;i++){

                arr[i] = str.charAt(i) -'0';

                if(arr[i] == 0){
                    count++;
                }
            }

            itr = count;

            for(int i = 0 ; i < count ; i++){
                if(arr[i] == 0){
                    itr--;
                }
            }

            System.out.println(itr);

        }
    }
}
