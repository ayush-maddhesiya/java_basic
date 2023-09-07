import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class rotate90 {
    static void transpose(int[][] arr; int r ,int c){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int  c = sc.nextInt();
        System.out.println("Enter total " + c*r);
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
