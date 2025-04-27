public class largest {
    public static String large(String str){
        String l="";
        String arr[]=str.split(" ");
        for (String arr1 : arr) {
            if (arr1.length() > l.length()) {
                l = arr1;
          
            }
        }
        System.out.println("The length is:"+l.length());
        return l;
    }
    public static void main(String[] args) {
        String str="hi! this is manicharan";
        System.out.println(large(str));

    }
    
}
