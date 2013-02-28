package pbox;

public class BoxApp {

    public static void main(String[] args) {
        // TODO code application logic here
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(10,20,15);
        Box box3 = new Box(12.2,10.9,8.5);
        
        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());
    }
}
