public class slargest {
    public static int sl(int arr[],int n){
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l){
               sl=arr[i]; 
            }
        }
        return sl;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,4};
        int n=arr.length;
        System.out.println(sl(arr, n));


    }
    
}
