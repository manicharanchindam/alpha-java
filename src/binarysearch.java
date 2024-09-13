
import java.util.Arrays;

public class binarysearch {
    public static int binary(int arr[],int key){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3,6,9,10,13,14};
        int key=4;
        int result=binary(arr, key);
        if(result==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Index of the key is "+result);
        }


    }
    
}
