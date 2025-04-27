public class inheritance {
    public static void main(String[] args) {
        Dog pitbull=new Dog();
        pitbull.eat();

        
    }
    
}

class Animals{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}
class Dog extends Animals{
    int legs;
    void run(){
        System.out.println("Runing");
    }

}
