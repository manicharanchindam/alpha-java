import java.util.*;
public class binary{
    public static int binarysearch(int arr[],int k){
        int n=arr.length;
        int result =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                result =i;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={12,2,13,5,6,9,15,10};
        System.out.println("Enter the element you want to find:");
        int k=sc.nextInt();
        int fresult=binarysearch(arr, k);
        if(fresult==Integer.MIN_VALUE){
            System.out.println("The given element is not present in the array");
        }
        else{
            System.out.println("The given element lies in the "+fresult+" index");
        }

    }
}