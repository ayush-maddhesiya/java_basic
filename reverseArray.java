public class reverseArray {
    static void reverse(int[] arr){
        int n = arr.length;
        int j = 0;
        int[] newarr = new int[n];
        for(int i = n-1;i >= 0;i--){
            newarr[j++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
    }
    static void reveersee(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i <= j){
            swap(arr,i,j);
            j--;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16,90};
      //  reverse(arr);
        reveersee(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
