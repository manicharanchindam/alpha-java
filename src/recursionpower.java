public class recursionpower {
    public static int power(int x,int n){
        if(n==0){
            return x;
        }
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(power(x, n));
    }
    
}
