public class kadanes {
    public static void kad(int arr[],int n){
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            current=current+arr[i];
            if(current>max){
                max=current;
            }
            if(current<0){
                current=0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,12,2,-4,1,3,7};
        int n=arr.length;
        kad(arr, n);
    }

    
}
