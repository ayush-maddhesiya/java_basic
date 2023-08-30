public class ArraySearchExample {
//    public static void main(String[] args) {
//        int[] numbers = { 10, 20, 30, 40, 50 };
//        int target = 30;
//
//        // Call the search function and store the result
//        int index = searchElement(numbers, target);
//
//        // Display the search result
//        if (index != -1) {
//            System.out.println("Element " + target + " found at index " + index);
//        } else {
//            System.out.println("Element " + target + " not found in the array");
//        }
//    }
//
//    // Function to search for an element in an array
//    public static int searchElement(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i; // Return the index if the element is found
//            }
//        }
//        return -1; // Return -1 if the element is not found
//    }
    public static int funtions(int[] array,int target,int n){
        for (int i = 0; i < n; i++) {
            if ( array[i]  == target){
                return i;
               // break;
            }

        }

        return -1;    }
public static void main(String[] args) {
    int[] arr = {10,20,30,11,90,78};
    int target  = 78;
    int len = arr.length;
    int index = funtions(arr,target,len);

    if (index == -1) {
        System.out.println("Not found !");
    }
    else{
        System.out.println("Elemnet found " +  target + " at " + ++index);
    }
}
}
