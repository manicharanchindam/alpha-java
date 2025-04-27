public class statickey {
    public static void main(String[] args) {
        Pen.cost = 10; // Accessing static fields of Pen class
        Pen.type = "ball"; // Accessing static fields of Pen class
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.name = "cello"; // Accessing instance variable of p1
        p2.name = "bitco"; // Accessing instance variable of p2
        System.out.println(p1.name + " is a " + Pen.type + " and cost is " + Pen.cost);
    }
}

class Pen {
    public String name; // Accessible outside the class
    public static int cost;  // Static field made public
    public static String type; // Static field made public
}
