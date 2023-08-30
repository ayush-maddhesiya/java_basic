public class pyrimed {
    public static void main(String[] args) {
        int line = 10;
        for (int i = 1; i <= line - 1; i++) {
            // Print spaces before asterisks
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
