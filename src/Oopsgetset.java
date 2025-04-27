public class Oopsgetset{
public static void main(String[] args) {
    Pen cello=new Pen();
    cello.setName("cello");
    cello.setCost(10);
    cello.setType("ballpen");
    System.out.println(cello.getName());     
}
}
 class Pen{
    private String name;
    private String type;
    private int cost;
    Pen(){  
        // dbSystem.out.println("this is called");  
    }

    public Pen(int cost, String name, String type) {
        this.cost = cost;
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}