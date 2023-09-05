public class rotationWithoutextraSpace {
    static  void array(int[] arr,int start, int end)
    {
        if(start < 0 || end >= arr.length || start >= end){
            return ;
        }
        while(start < end){
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;

        array(arr,0,k-1);
        array(arr,k,n-1);
        array(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
