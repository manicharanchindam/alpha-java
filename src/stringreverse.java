public class stringreverse {
    public static void main(String[] args) {
        String str="Wipro is the best company";
        String arr[]=str.split(" ");
        StringBuilder sentance=new StringBuilder();
        for( String word:arr){
            StringBuilder reversword=new StringBuilder(word);
            String result=reversword.reverse().toString();
            sentance.append(result).append(" ");

        }
        System.out.println(sentance.toString().trim());
    }
    
}
