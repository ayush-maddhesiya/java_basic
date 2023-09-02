public class SortedOrNot {
    static boolean check(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5}; // Correct array initialization
        System.out.println(check(arr));
    }
}
