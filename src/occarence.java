public class occarence {
    public static int occ(String str,char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Mani charan";
        char ch='a';
      int res=  occ(str, ch);
      System.out.println("The character "+ch+" is occered "+res+" times");
    }
    
}
