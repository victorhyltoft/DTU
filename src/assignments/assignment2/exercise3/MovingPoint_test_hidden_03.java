package assignments.assignment2.exercise3;

public class MovingPoint_test_hidden_03{

    public static void main(String[] a){
        MovingPoint mp1 = new MovingPoint(7.0, 3.0, -10, 1.0);
        MovingPoint mp2 = new MovingPoint(7.0, 3.0, 475, 1.0);

        System.out.println(mp1);
        mp1.move(1);
        System.out.println(mp1);

        System.out.println(mp2);
        mp2.move(1);
        System.out.println(mp2);

    }
}

