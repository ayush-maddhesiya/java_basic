import java.util.Scanner;

public class swap {
    static void swapelement(int a , int b){
        System.out.println("Original values : ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
        int temp = a;
        a =  b;
        b = temp;
        System.out.println("Values  after swap: ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

    }

    static void swapwithTemp(int a, int b){
        System.out.println("Original values : ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values  after swap: ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapelement(a,b);
        System.out.println();
        System.out.println();

        swapwithTemp(a,b);
    }
}
