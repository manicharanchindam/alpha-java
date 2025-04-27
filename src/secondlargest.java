public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,2};
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l ){
                sl=arr[i];
            }
        }
        System.out.println(sl+l);
    }
    
}
