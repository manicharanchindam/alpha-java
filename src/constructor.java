public class constructor {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="mani";
        s1.rollno=74;
        System.out.println(s1.name);
        System.out.println(s1.rollno);        
    }
    
}
class student{
    String name;
    int rollno;
    student(){
        
    }
    student(String name,int rollno){
       this.name=name;
       this.rollno=rollno; 
    }
}
