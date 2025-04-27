public class firstoccrecursion {
    public static int occure(int arr[],int key,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return occure(arr, key, idx+1);
    }
    public static int lastocc(int arr[],int key,int idx){
        if(idx<0){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return lastocc(arr, key, idx-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,1,7,8};
        int key=1;
        int len=arr.length-1;
        // int result=occure(arr, key, 0);
        int result=lastocc(arr, key,len);
        if(result==-1){
            System.out.println("The key element is not present in the array");
        }
        else{
            System.out.println("The key element is present in the index :"+result);
        }
    }
    
}
