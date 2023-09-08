import java.util.Scanner;

public class SprialMatrix {
    static void printmatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void sprintSpriralOrder(int[][] arr, int r,int c){
        int topRow = 0;int leftcol = 0;int bottomRow = r-1; int rightCol = c-1;
        int total = 0;
        while(total <= c*r){
            //left -> right
            // right to left
            for (int i = rightCol; i >= leftcol && total < r * c; i--) {
                System.out.print(arr[bottomRow][i] + " ");
                total++;
            }
            bottomRow--;

// bottom to top
            for (int i = bottomRow; i >= topRow && total < r * c; i--) {
                System.out.print(arr[i][leftcol] + " ");
                total++;
            }
            leftcol++;

            for (int i = rightCol; i > leftcol && total <= c*r; i--) {
                System.out.print(arr[bottomRow][i] + " ");
                total++;
            }bottomRow--;


            for (int i = bottomRow; i > topRow && total <= c*r; i--) {
                total++;
                System.out.print(arr[i][leftcol] + " ");
            }leftcol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("Enter coloum ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Origanal array ");
        printmatrix(arr);

        System.out.println(" Spiral list ");
        sprintSpriralOrder(arr,r,c);

    }
}
