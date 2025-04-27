import java.util.Scanner;
public class numstowords {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder words=new StringBuilder();
        String w[]={"Zero","One","Two","Three","four","Five","Six","Seven","Eight","Nine"};
        int a=sc.nextInt();
        if(a==0){
            words.append(w[0]);
        }
        else{
        while(a!=0){
            int rem=a%10;
            words.insert(0, w[rem]+" ");
            a=a/10;
        }
        }
        System.out.println(words.toString().trim());
        sc.close();
    }
    
}
