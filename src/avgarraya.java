public class avgarraya {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,12,101};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/n);
    }
    
}
