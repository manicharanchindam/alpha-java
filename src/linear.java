public class linear {
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=4;
        int result=search(arr, key);
        if(result==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The index of given key is "+result);
        }

    }
    
}
