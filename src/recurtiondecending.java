public class recurtiondecending{

    public static void decreces(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        decreces(n-1);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        // decreces(10);
        System.out.println(factorial(5));
    }
    
}