import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class rotate90 {
    static void tranpose(int[][] arr , int r , int c,int[][] newarray){

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newarray[i][j] = arr[j][i];

            }
        }
    }
    static void reverse(int[] array){
        int i = 0;
        int k = array.length-1;
        while( i < k){
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            i++;k--;
        }
    }
    static void rotate(int[][] arr, int r ,int c,int[][] narray){
        //transpose

            tranpose(arr,r,c,narray);
        //reverse
        for (int i = 0; i < r; i++) {
            reverse(narray[i]);
        }
    }
    static void printArray(int[][] array,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int  c = sc.nextInt();
        System.out.println("Enter total " + c*r);
        int[][] arr = new int[r][c];
        int[][] narray = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr,r,c,narray);
        System.out.println("Original array " );
        printArray(arr,r,c);
        System.out.println("After operation ss : ");
        printArray(narray,c,r);
    }
}

/*  from chatGpt also incorrect
import java.util.Scanner;

public class MatrixRotation {

    static void transpose(int[][] input, int[][] output) {
        int rows = input.length;
        int cols = input[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[j][i] = input[i][j];
            }
        }
    }

    static void reverseRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int start = 0;
            int end = cols - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    static void rotate90DegreesClockwise(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] tempMatrix = new int[cols][rows];

        transpose(matrix, tempMatrix);
        reverseRows(tempMatrix);

        // Copy the rotated matrix back to the original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate90DegreesClockwise(matrix);

        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }
}

 */
