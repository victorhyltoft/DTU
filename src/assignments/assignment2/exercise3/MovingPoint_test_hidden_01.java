package assignments.assignment2.exercise3;

public class MovingPoint_test_hidden_01{
    public static void main(String[] a){
        MovingPoint mp1 = new MovingPoint(7.0, 3.0, 260, 1);

        System.out.println(mp1);
        mp1.move(1);
        System.out.println(mp1);

        mp1.turnBy(-30.7);
        mp1.move(1);
        System.out.println(mp1);

        mp1.turnBy(200);
        mp1.move(1);
        System.out.println(mp1);

        mp1.turnBy(1234);
        mp1.move(1);
        System.out.println(mp1);

    }
}
