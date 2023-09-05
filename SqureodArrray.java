import java.util.Scanner;

public class SqureodArrray {
    //for exaple = -10,-3,-2,1,4,5 is 1,4,9,16,25,100
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
    static void sort(int[] arr, int i , int k,int[] array){
        int n  = arr.length;
        int j = n-1;
        while ( i <= k){
            if(arr[i] > arr[k]){
                int m  = arr[i++];
                array[j--] = m*m;
            }else{
                int m = arr[k--];
                array[j--] = m*m;
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
            int input = sc.nextInt();
            if(input < 0){
                input  = Math.abs(input);

            }
            arr[i] = input;

        }
        System.out.println("Orignal array : ");
        printArray(arr);
        int[] array = new int[n];
        System.out.println();
        System.out.println();
        sort(arr,0,arr.length-1,array);
        printArray(array);
    }
}
