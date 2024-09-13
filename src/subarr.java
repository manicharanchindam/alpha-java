public class subarr{

    public static void subarray(int arr[]){
        int start=0;
        int tp=0;
        int end=arr.length;
        for(int i=0;i<end;i++){
            for(int j=i;j<end;j++){
                start=0;
                for(int k=i;k<=j;k++){
                    start=start+arr[k];
                }
                System.out.print(start);
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5};
        subarray(arr);
    }
}