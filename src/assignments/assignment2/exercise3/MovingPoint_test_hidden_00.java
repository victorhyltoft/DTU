package assignments.assignment2.exercise3;

public class MovingPoint_test_hidden_00{

    public static void main(String[] a){

        MovingPoint mp1 = new MovingPoint(1.0, 10.0, 45, 1);

        System.out.println(mp1);
        mp1.move(1);
        System.out.println(mp1);

        mp1.accelerateBy(20.0);
        mp1.move(1);
        System.out.println(mp1);

        mp1.accelerateBy(-30.0);
        mp1.move(1);
        System.out.println(mp1);

    }
}
