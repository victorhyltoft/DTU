package assignments.assignment2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TrianglePatternTest {

    @Test
    void test_visible_00(String[] a){
        int[] init = {0,1,2,3,4,5,6,7,8,9,10};
        int n = 11, h = 3;
        TrianglePattern tp = new TrianglePattern(n, h, init);
        System.out.println(n);
        System.out.println(h);
        System.out.println(Arrays.toString(init));

        Assertions.assertEquals(n, tp.getN());
        Assertions.assertEquals(h, tp.getH());
        Assertions.assertEquals(Arrays.toString(init), Arrays.toString(tp.getInitial()));

        for (int r = 0; r < tp.getH(); r++) {
            for (int c = 0; c < tp.getN(); c++) {
                System.out.print(tp.getValueAt(r, c));
            }
            System.out.println();
        }

    }
}