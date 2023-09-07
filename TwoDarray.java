public class TwoDarray {
    static void printArray(int[][] array){
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        printArray(arr);
    }
}
