public class proarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int result[]=new int[n];
        for(int i=1;i<n;i++){
            result[0]=1;
            result[i]=result[i-1]*arr[i-1];
            System.out.println(4326%7);


        }
    }
    
}
