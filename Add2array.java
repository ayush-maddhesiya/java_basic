import java.util.Scanner;

public class Add2array {
    static void add(int[][] arr1,int[][] arr2,int[][] newarray,int r1,int r2, int c1, int c2){
        if(r1 != r2 || c2 != c1){
            System.out.println("Size is not Same : ");
        }
        else{
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    newarray[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array r1 and c1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] array1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the size of array r2 and c2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] array2 = new int[r1][c1];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] newarray = new int[r1][c1];
        add(array2,array1,newarray,r1,r2,c1,c2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r2; j++) {
                System.out.print(newarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
