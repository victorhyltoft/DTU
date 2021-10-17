package assignments.assignment2.exercise2;

import java.util.Arrays;

public class TrianglePattern_test_hidden_04{
    public static void main(String[] a){
        int[] init = { 100, 200, 300, 400, 600,700,800, 900};
        int n = 1001, h = 200;
        TrianglePattern tp = new TrianglePattern(n, h, init);
        System.out.println(n);
        System.out.println(h);
        System.out.println(Arrays.toString(init));

        System.out.println(tp.getN());
        System.out.println(tp.getH());
        System.out.println(Arrays.toString(tp.getInitial()));

        System.out.println(""+tp.getValueAt(21, 51)+tp.getValueAt(24, 79)+tp.getValueAt(43, 93)+tp.getValueAt(104,771)
                +tp.getValueAt(143, 232));

        for (int c = 0; c < tp.getN(); c++) {
            System.out.print(tp.getValueAt(35, c));
        }
        System.out.println();
        for (int c = 0; c < tp.getN(); c++) {
            System.out.print(tp.getValueAt(h - 107, c));
        }
        System.out.println();
        for (int c = 0; c < tp.getN(); c++) {
            System.out.print(tp.getValueAt(h - 103, c));
        }
        System.out.println();
    }
}

