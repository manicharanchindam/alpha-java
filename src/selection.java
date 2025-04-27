public class selection {
    public static void sel(int arr[]){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
            if(i<l){
                System.out.print(" ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]={2,5,3,8,9,1,};
        sel(arr);
    }
}
