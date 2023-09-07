public class multiplcations {
    static void mux(int[][] array1 , int[][] array2 , int r1,int r2, int c1,int c2,int[][] newarray){
        if(c1 != r2){
            System.out.println("not possbile");
        }
        else{
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        newarray[i][j] += array1[i][k]*array2[k][j];
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr1  = {{1,2,3},{5,6,7}};
        int[][] arr2 = {{12,13},{14,15},{16,17}};
        int r1 = 2;
        int c1 = 3;
        int r2 = 3 ;
        int c2 = 2;
        int[][] newarray = new int[r1][c2];
        mux(arr1,arr2,r1,r2,c1,c2,newarray);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(newarray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
