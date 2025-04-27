public class missing {
    public static int miss(int arr[],int n){
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        int n=6;
        System.out.println(miss(arr, n));
    }
    
}
