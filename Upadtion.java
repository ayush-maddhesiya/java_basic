class HelloWorld {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        System.out.print("Loading: 0%");
for (int i = 1; i <= 100; i++) {
    System.out.print("\rLoading: " + i + "%");
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
System.out.println("\nDone!");

    }
}
