public class reversearrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int n=arr.length;
        int temp=0;
        for(int i=0;i<=n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
