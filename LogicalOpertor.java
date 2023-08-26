public class LogicalOpertor {
    public static void main(String[] args) {
        int p = 15,q = 10,r = 5;
        //And opertor
        System.out.println(p > r && q > 
        r);
        System.out.println( p>q && r>q);
        //Or opertors
        System.out.println(r<q || p<q);
        //Not opterors
        System.out.println(!(p == q));
        System.out.println(!(p>q));
    }
}
