package assignments.assignment2.exercise3;

public class MovingPoint_test_hidden_04{

    public static void main(String[] a){
        MovingPoint mp1 = new MovingPoint();

        System.out.println(mp1);
        mp1.move(1);
        System.out.println(mp1);


        for (int i = 0; i < 5; i++) {
            System.out.println("-------");
            mp1.turnBy(-60);
            mp1.accelerateBy(2.12);

            System.out.println(mp1);
            mp1.move(400);
            System.out.println(mp1);
        }

    }
}
