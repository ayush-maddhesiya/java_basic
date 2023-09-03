public class uniqueElement {
    static int elel(int[] arr,int ans,int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            if(arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,2,4};
        int ans = 0;
        int n = arr.length;
        System.out.println(elel(arr,ans,n));
    }
}
