import java.util.Scanner;

public class smofArray {
    static void prefixsum(int[][] array){
        int r = array.length;
        int  c = array[0].length;
        for (int i = 0; i < r ; i++) {
            for (int j = 1; j < c; j++) {
                array[i][j] += array[i][j - 1];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
                array[j][i] += array[j-1][i];
            }
        }
    }

    static void printArray(int[][] array){
        int r = array.length;
        int  c = array[0].length;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int partsum(int[][] array,int l1,int r1, int l2, int r2){
        int sum = 0 ;
        int ans = 0;
        int left = 0;
        int up = 0;
        int common  = 0;
        sum = array[l2][r2];
        common = array[l1-1][r1-1];
        left = array[l2][r1-1];
        up = array[l1-1][r2];
        ans = sum - up - left + common;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row");
        int r = sc.nextInt();
        System.out.println("enter number of col");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the " + r*c + " element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        prefixsum(arr);
        printArray(arr);
//        int l1 = 2;
//        int r1 = 2;
//        int l2 = 5;
//        int r2 = 5;
//
        int a =  partsum(arr,2,2,4 ,4);
        System.out.println(a);

    }
}
