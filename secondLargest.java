public class secondLargest {
    static int array(int[] arr,int n){
        int min = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[min]){
                min = i;
            }
        }
        arr[min] = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[min]){
                min = i;
            }
        }

        return arr[min];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,46,99,69,2};
        int  n = arr.length;
        System.out.println(array(arr,n));
    }
}
