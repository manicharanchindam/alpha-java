public class pairs {
    public static void findpair(int arr[]){
        int len=arr.length;
        int tp=0;
        for(int i=0;i<len;i++){
            int cur=arr[i];
            for(int j=i+1;j<len;j++){
                System.out.print("[ "+cur+","+arr[j]+" ]");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        findpair(arr);
    }
    
}
