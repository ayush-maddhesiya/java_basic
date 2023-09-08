import java.util.Scanner;

public class SumOfRecUsingPrifixsum {
    //l2>l1 and r2>r1;
    static void prefix(int[][] array){
        int r = array.length;
        int c = array[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                array[i][j] += array[i][j-1];

            }
        }
    }
    static  int sum(int[][] array,int l1, int l2, int c1, int c2){
        int r = array.length;
        int c = array[0].length;
        int summ = 0;
        for (int i = l1; i <= l2 ; i++) {
            summ += array[l2][c2] - array[l1][c1];
            System.out.println(summ);
        }
        return  summ;
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

        printArray(arr,r,c);
        prefix(arr);
        System.out.println(sum(arr,r1,r2,c1,c2));

    }
}
