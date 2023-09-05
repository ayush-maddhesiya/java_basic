public class rotateKtime {
    static public int[] rotate(int[] arr,int k){
        int n = arr.length;
        k =  k%n;
        int[] newarr = new int[n];

        int j = 0;
        for (int i = n-k; i < n; i++) {
          newarr[j++] = arr[i];
        }
        for (int l = 0; l < n-k; l++) {
            newarr[j++]  = arr[l];
        }
        return  newarr;
    }

    public static void main(String[] args) {
        int[] arr = {12,56,23,90,96};
        int k = 3;
        int[] array = rotate(arr,k);
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
    }
}
