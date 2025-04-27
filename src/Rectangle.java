import java.util.* ;
public class Rectangle { 
    public static int getarea(int l,int b){
        return l*b;
    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(getarea(l,b));
    }
}