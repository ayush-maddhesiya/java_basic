import java.util.Scanner;

public class repeatEle {
    static int repeatElement(int[] arr,int ans){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    return ans;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + "element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Repeaded element is:" + repeatElement(arr,0));
    }


}
