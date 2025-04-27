
import java.util.Arrays;

public class insertion {
    public static void inser(int arr[]){
        int l=arr.length;
        for(int i=0;i<l;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;

        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
            if(i<l-1){
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={ 6,5,3,4,2};
        // inser(arr);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }
    
}
