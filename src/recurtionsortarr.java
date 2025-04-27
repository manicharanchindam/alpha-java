public class recurtionsortarr {
    public static boolean issorted(int arr[],int i){
        if(arr[i]==arr[arr.length-1]){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={0,10,3,4,5,6};
        System.out.println(issorted(arr, 0));
    }
    
}
