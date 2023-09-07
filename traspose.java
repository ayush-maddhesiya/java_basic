import java.util.Scanner;

public class traspose {
    static void transpose(int[][] array, int[][] newarray, int r, int c) {
        for (int i = 0; i < c; i++) {  // Swap r and c in the loop bounds
            for (int j = 0; j < r; j++) {  // Swap r and c here as well
                newarray[i][j] = array[j][i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter " + r * c + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[][] newarr = new int[c][r];
        transpose(array, newarr, r, c);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
