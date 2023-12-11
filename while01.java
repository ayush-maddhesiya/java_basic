import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = 1;
    while(num >= n){
        System.out.println(num--);   
    }
    }
}
