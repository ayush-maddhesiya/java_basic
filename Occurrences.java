import java.util.Scanner;

public class Occurrences {
    static  int countOcc(int[] arr,int x){
        int count = 0;
        int n = arr.length;
        while(n != 0){
            n--;
            if(arr[n] == x){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x ");
        int x = sc.nextInt();

        System.out.println("Count of x " + countOcc(arr,x));
    }
}
