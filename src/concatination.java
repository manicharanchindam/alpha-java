public class concatination {
    public static String reverse( String fname){
        int n=fname.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev += fname.charAt(i);
        }
        return rev;

    }
    public static void main(String[] args) {
        String fname="ManaM";
        String lname="Charan";
        String reve=reverse(fname);
        if( fname.equals(reve)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        
       
    }
    
}
