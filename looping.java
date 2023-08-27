import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        //tmeplete for loop
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;
        for(int m = 1; m <= n;m++){
            sum += m;
        }
        System.out.println("THE SUM OF N NUTRUAL NUMBER IS : " + sum);

    }
}
