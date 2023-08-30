public class arraySum {
     static void funtion(int[] numbers){

        int sum = 0;
        for (int element :
        numbers) {
            sum+=element;
        }
        System.out.println("Sum of given array is : " + sum);
    }
    static void max(int[] arr){
         int max =  arr[0];
        for (int i :
                arr) {
            if (i > max) {
                max = i;
            }
            }
        System.out.println("Maximum ele : " + max);
    }
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
           funtion(numbers);
        //to find maximun of element,
        max(numbers);

    }
}
