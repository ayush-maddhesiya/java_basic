import java.util.Scanner;

public class SumofPrefix {
    //3 method more optimize

    static  void sum(int[][] array, int l1, int l2, int c1,int c2){
        int sum = array[l2][c2];
        
    }
    static void printArray(int[][] arr ,int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void colprefix(int[][] arr){
        int r = arr.length;
        int c  = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[j][i] += arr[j-1][i];
            }
        }
    }
    static void rowprefix(int[][] arr){
        int r = arr.length;
        int c  = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
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
            printArray(arr,r,c);

            colprefix(arr);
            rowprefix(arr);

            System.out.println("Enter the coodinator of whichyou want sum : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            printArray(arr,r,c);
    }
}
