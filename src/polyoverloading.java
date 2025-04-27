public class polyoverloading {
    public static void main(String[] args) {
        calculator cal1=new calculator();
       float res= cal1.sum(1.8f, 2.9f);
        System.out.println(res);
        Animals a1=new Animals();
        Cow c1=new Cow();
        a1.eat();
        c1.eat();
        
    }
    
}
//overloading ==> compile time polymorphisam
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//overriding ===> run time polymorphisam
class Animals{
    void eat(){
        System.out.println("Eats anything");
    }

}
class Cow extends Animals{
    @Override
    void eat(){
        System.out.println("Eats grass");
    }
}
