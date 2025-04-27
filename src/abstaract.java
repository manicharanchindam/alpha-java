public class abstaract {
    public static void main(String[] args) {
        mamel m1=new human();
        m1.walk();
    }
    
}
 abstract class mamel{
    
    public void walk(){
        System.out.println("walking");
    }
    abstract public void  NoOflegs();
 } 
  class human extends mamel{
    @Override
    public void NoOflegs(){
        System.out.println("No of legs for human are two");
    }
  }
