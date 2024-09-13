public class reversearr {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            if(i>0){
                System.out.print(" ");
            }
        }
    }
    
}
