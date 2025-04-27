public class recursiontiling {
    public static int tailing(int n ){
        if(n==0||n==1){
            return 1;
        }
        int fn1=tailing(n-1);
        int fn2=tailing(n-2);
        int sum=fn1+fn2;
    
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(tailing(3));
    }
    
}
