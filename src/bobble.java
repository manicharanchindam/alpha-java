public class bobble{
    public static void bob(int arr[]){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
            if(i<l){
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,6,3,7,1,3,5};

        bob(arr);
    }
    
}