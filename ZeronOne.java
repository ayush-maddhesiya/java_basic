import java.util.Scanner;

//more eff.
public class ZeronOne {
    static void printArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print( array[i] + " ");
        }
    }

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static  void sort(int[] arr,int i , int k){
        int n = arr.length;
        while(i < k){
            if(arr[i] == 0){
                i++;
            } else if (arr[k] == 1) {
                k--;
            }
            else{
                swap(arr,i,k);
                i++;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + "element of array  : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal array : ");
        printArray(arr);
        System.out.println();
        System.out.println();

        sort(arr,0,arr.length-1);
        printArray(arr);
    }
}
