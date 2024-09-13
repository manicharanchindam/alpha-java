public class Shotestpath {
    public static void shortest( String word,int x,int y){
        int n=word.length();
        for(int i=0;i<n;i++){
            switch (word.charAt(i)) {
                case 'W' -> x--;
                case 'N' -> y++ ;
                case 'E' -> x++;
                case 'S' -> y--;
                default -> {
                }
            }
        }
        int x2=x*x;
            int y2=y*y;
            System.out.println((int)Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String word="WNEENESENNN";
        int x=0;
        int y=0;
        shortest(word, x, y);
    }
    
}
