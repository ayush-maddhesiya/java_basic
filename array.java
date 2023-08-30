public class array {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0]  = 2;
        ages[1]  = 4;
        ages[2]  = 87;
        //ages[-4] = 23;  //out of bound
        System.out.println(ages[0]);
        //System.out.println(ages[-4]) ;

        //if we using for-each loop then whole array will be printed.
        for (int i :
                ages) {
            System.out.print(i + " ");
        }

    }
}
