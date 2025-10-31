public class acciojob {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7};
        int n = arr.length;

        int max = 1;

        for (int i = 0; i <= n - 3; i++) {
            int ans = 1;

            for (int j = i; j < i + 3; j++) {
                ans *= arr[j];
            }

            max = Math.max(max, ans);
        }

        System.out.println(max);
    }
}
