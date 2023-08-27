public class revesre_theDigit {
    public static void main(String[] args) {
        int n = 123414;
       // int
        int digit = 0;
        while (n != 0){
            int num = n%10;

            digit = digit*10 + num;

            n /= 10;
        }
        System.out.println(digit);
    }
}
