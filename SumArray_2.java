import java.util.Scanner;

public class SumArray_2 {
    static  int totalSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static boolean sum(int[] arr){
        int prefix  = 0, suffix = 0;
        int total  = totalSum(arr);
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            suffix = total - prefix;
            if(prefix == suffix){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partion is applicable of not : " + sum(arr));
    }

}
