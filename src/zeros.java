public class zeros{
    public static int remove(int arr[],int n){
        int first=0;
        int last=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                if(first==0){
                    first=i;
                }
                last=i;
            }
        }    
        if(first==0||last==0||first==last){
            return 0;
        }    
        for(int i=first;i<last;i++){
            if(arr[i]==0){
                count++;
            }

        }
        return count;
    }
    public static int con(int arr[],int n){
        int count=0;
        int first=0;
        int last=0;
        // int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                if(first==0){
                    first=i;
                }
                last=i;
            }
        }    
        for(int i=first;i<=last;i++){
            if(arr[i]==1){
                count++;
            }
            if(arr[i]==0){
                count=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,0,1,1,1,1,1,0};
        int n=arr.length;
    //    int res= remove(arr, n);
    //    System.out.println(res);
       System.out.println(con(arr, n));
    }
}