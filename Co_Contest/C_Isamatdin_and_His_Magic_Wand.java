import java.util.*;
public class C_Isamatdin_and_His_Magic_Wand{

    /*
      
    The wand can only swap two toys if their integers have different parity 

    // one is even and Ohter is odd 

       aimod2   ≠  ajmod2

       2 3 1 4
       i     j
       i   j <-  swap 1 2 3 4 

       1 3
       2 4

       3 2 1 3 4 

       odd 3 1 3  sort 1 3 3 
       even 2 4 sort 2  4

       1 2 3 3 4

       1 3 5



       wait wiat what if all the odd then no one can chage 

       and 

       what if all the even the 


       no one can swapp

       loll 



       BCCBCC 


       ok so we just need to

       check if thier is mix 

       no then sort and 

       bcz we want lexic.. smallest and that is only desceding order sort 


       ok ok got it
       

       

       



     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();

            boolean even = false;
            boolean odd = false;

            for(int  i = 0 ; i < n ; i++){
                if(arr[i] % 2 == 0) even = true;
                else odd = true;

            }

            if (even && odd) {
                Arrays.sort(arr);
            }


            for(int i = 0; i < n ; i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}