import java.util.*;
public class B_Your_Name {
    public static void main(String[] args) {

        /*
         
         */


        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();

            String s = sc.next(); 
            String t = sc.next();

            HashMap<Character,Integer> map = new HashMap<>();

            for(int i = 0 ; i <n; i++){
                char ch = s.charAt(i);
                map.put(ch , map.getOrDefault(ch , 0)+1);
            }

            boolean flag = true;

            for(int i = 0 ; i < n; i++){
                char ch = t.charAt(i);
                if(!map.containsKey(ch)){
                    flag=false;
                    System.out.println("NO");
                    break;
                }
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) map.remove(ch);
            }

            if(flag){
                System.out.println("YES");
            }
        }
    }
}