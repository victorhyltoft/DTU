package assignments.assignment2.exercise2;

import java.util.Arrays;

public class TrianglePattern_test_hidden_00{
    public static void main(String[] a){
        int[] init = {0,1,2,3,4,5,6,7,8,9,10};
        int n = 11, h = 3;
        TrianglePattern tp = new TrianglePattern(n, h, init);
        System.out.println(n);
        System.out.println(h);
        System.out.println(Arrays.toString(init));

        System.out.println(tp.getN());
        System.out.println(tp.getH());
        System.out.println(Arrays.toString(tp.getInitial()));

        for (int r = 0; r < tp.getH(); r++) {
            for (int c = 0; c < tp.getN(); c++) {
                System.out.print(tp.getValueAt(r, c));
            }
            System.out.println();
        }

    }
}
