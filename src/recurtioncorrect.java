public class recurtioncorrect {
    public static int increc(int n,int a){
        if(a==n){
            return n;
        }
        System.out.print(a+" ");
        return increc(n, a+1);
    } 
    public static void main(String[] args) {
        System.out.println(increc(10, 1));
    }
    
}
