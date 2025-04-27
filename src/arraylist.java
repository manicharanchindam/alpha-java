import java.util.ArrayList;
public class arraylist{
    public static void swap(ArrayList<Integer> list){
        int idx1=3;
        int idx2=5;
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);


        // System.out.println(list);
        // // list.remove(2);
        // list.set(0, 0);
        // System.out.println(list);
        // System.out.println(list.get(0));
        swap(list);



    }
}