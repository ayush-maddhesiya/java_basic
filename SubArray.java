public class SubArray {
    static  boolean subSum(int[] arr){
        int i  = 0;
        int k = arr.length-1;
        int sumi = arr[i++];
        int sumk = arr[k--];
        while (i <= k){
            if(sumi > sumk){
                sumk += arr[k--];
                System.out.println(" k " + sumk);
            }
            else {
                sumi += arr[i++];
                System.out.println("i" + sumi);
            }
        }

        if(sumi == sumk){
            return true;

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {15 , 4 , 6, 4 , 8, 2};
        System.out.println(subSum(arr));

    }
}
