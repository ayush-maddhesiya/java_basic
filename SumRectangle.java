import java.util.Scanner;
//this by bruteforce
public class SumRectangle {
    //l2>l1 and r2>r1;
    static  int sum(int[][] arr, int l1, int l2, int r1, int r2){
        int sum  = 0;
        for (int i = r1; i < r2; i++) {
            for (int j = r1; j < l2; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static void printArray(int[][] arr ,int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        System.out.println("Enter the sub-rectangle demition that of which you want sum ");
        System.out.println("enter number of row: r1");
        int r1 = sc.nextInt();
        System.out.println("enter number of col : c1");
        int c1 = sc.nextInt();

        System.out.println("enter number of row : r2");
        int r2 = sc.nextInt();
        System.out.println("enter number of col : c2" );
        int c2 = sc.nextInt();

        int summ = sum(arr,r1,r2,c1,c2);

        System.out.println("Sum is : " + summ);
    }
}
