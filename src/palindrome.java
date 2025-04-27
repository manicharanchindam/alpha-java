
import java.util.Scanner;

public class palindrome {
    public static String reverse(String name){
        int n=name.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        String reverse=reverse(Str);
        if(Str.equals(reverse)){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
        sc.close();
    }
    
}
