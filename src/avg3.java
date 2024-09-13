import java.util.Scanner;

public class avg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A value");
        int a=sc.nextInt();
        System.out.println("Enter B value");
        int b=sc.nextInt();
        System.out.println("Enter C value");
        int c=sc.nextInt();
        int avg=a+b+c/3;
        System.out.println("Avg ="+avg);
        System.out.println((float)(avg*0.18));
    }
    
}
