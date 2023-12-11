// import java.util.Scanner;

//this to print series 1 to 50 ,expert multiply of 3.
public class question {
    public static void main(String[] args) {
        int num = 50;
        while(num >= 0){
            if( (num % 3) != 0){
                System.out.print(num  + " ");
            }
            num--;
        }
    }
}
