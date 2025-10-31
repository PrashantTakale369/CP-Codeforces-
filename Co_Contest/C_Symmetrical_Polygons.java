import java.util.*;

public class C_Symmetrical_Polygons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while(t-- > 0){

            int n = sc.nextInt();
            int arr[] = new int[n];


            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            int u = 0;

            boolean flage  = true;


            for(Map.Entry<Integer, Integer> e : map.entrySet()){

                if(e.getValue() ==  1){
                    u++;
                }else{
                    if(e.getValue() % 2 != 0){
                        flage = false;
                        break;
                       
                    }

                }

            }


                if( u > 2){
                    flage = false;
                }

            int sum = 0;

            for(int i = 0; i < n; i++){
                sum += arr[i];
            }


            if(flage == false){
                System.out.println(0);
            }else{

                System.out.println(sum);
            }


 
        }
     
    }
}