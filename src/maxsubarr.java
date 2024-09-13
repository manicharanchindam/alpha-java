public class maxsubarr {
    public static void maxsub(int arr[]){
        int n=arr.length;
        int tp=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println(sum);
                max=Math.max(max, sum);
                tp++;
            }
        }
        System.out.println(max);
        System.out.println(tp);
    }
    public static void kadanes(int arr[]){
        int n=arr.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }

        }
        System.out.println(ms);

    }
    public static void main(String[] args) {
        int arr[]={-1,-4,5,8,9,3};
        maxsub(arr);
        kadanes(arr);
    }
    
}
