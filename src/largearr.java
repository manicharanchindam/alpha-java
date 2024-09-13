public class largearr {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("The smallest element is "+min);
        return max;
        


    }
    public static void main(String[] args) {
        int arr[]={3,4,2,6,7,2,4};
        System.out.println("The largest element is "+largest(arr));
    }
    
}
