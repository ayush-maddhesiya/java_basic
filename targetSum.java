import java.util.Vector;
public class targetSum {
    static int targetSumm(int[] arr,int target, Vector<Integer> V){
        int count  = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if( arr[i] + arr[j] == target){
                    count++;
                    V.add(i);
                    V.add(j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        Vector<Integer> V = new Vector<Integer>();
        System.out.print("Number of pair : " + targetSumm(arr,target,V));
        System.out.println();
        System.out.println("Index are : ");
        for (int i=0;i<V.size();i++){
            System.out.print( V.get(i) + " ");
        }
    }
}