
import java.util.Arrays;

public class amstrongstring {
    public static boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean res=Arrays.equals(arr2, arr2);
        return res;

    }
    public static void main(String[] args) {
        String str1="mani";
        String str2="amnih";
        boolean fin= anagram(str1, str2);
        if(fin==false){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        
    }
    
}
