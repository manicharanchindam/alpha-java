public class recurtionfibanocii {
    public static int fibanoci(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibanoci(n-1);
        int f2=fibanoci(n-2);
        return f1+f2;
        

    }
    public static void main(String[] args) {
        System.out.println(fibanoci(20));
    }
    
}
