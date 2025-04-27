public class smallest {
    public static int small(int arr[],int n){
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<s){
                ss=s;
                s=arr[i];
            }
            else if(arr[i]<ss&&arr[i]!=s){
                ss=arr[i];
            }
        }
        return ss;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,5,1,-10,11};
        int n=arr.length;
        System.out.println(small(arr, n));
    }
    
}
