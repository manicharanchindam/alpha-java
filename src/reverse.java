public class reverse {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,4,6};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int i=0;i<n;i++){

            System.out.print(arr[i]);
            if(i<n){
                System.out.print(" ");
            }

        }

    }
    
}
