import java.util.Scanner;

public class frequecy {
    static void indexing(int[] arr,int[] array){
        for (int i = 0; i < arr.length; i++) {
            array[arr[i]] = arr[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30,900,404,12,555,1001,44,99,98,01};
        int n = arr.length;
        int[] indi = new int[1500]; //creating array for just greater than values of all so it 1500
        indexing(arr,indi);
        System.out.println("Enter the number of test cases : ");
        int t = sc.nextInt();
        while(t != 0){
            int num = sc.nextInt();
            if(num == indi[num]){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
            t--;
        }



    }
}
