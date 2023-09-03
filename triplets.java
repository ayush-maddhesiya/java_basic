import java.util.Vector;

public class triplets {
    static  int tripletsArray(int[] arr,int x,Vector<Integer> v){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                   if(arr[i]+arr[j]+arr[k] == x) {
                       count++;
                       v.add(arr[i]);
                       v.add(arr[j]);
                       v.add(arr[k]);
                   }
                }
            }
        }return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,2,5,4,1};
        int x = 5;
        Vector<Integer> v =new Vector<Integer>();
        System.out.println(tripletsArray(arr,x,v));

        System.out.println();

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}
