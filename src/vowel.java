public class vowel {
    public static void vow(String str,int n){
        int vowel=0;
        int constants=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel++;
            }
            else{
                constants++;
            }

        }
        System.out.println("the vowels in the given string are "+vowel);
        System.out.println("The constants in the given string are "+constants);
    }
    public static void main(String[] args) {
        String Str="manicharan";
        int n=Str.length();
        vow(Str, n);
        
    }
    
}
