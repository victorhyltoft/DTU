package uge5.exercises;

public class Triag {
    public static void main(String[] a){
        System.out.println(computeIndex(1));
        System.out.println(computeIndex(2));
        System.out.println(computeIndex(3));
        System.out.println(computeIndex(4));
        System.out.println(computeIndex(0));
        System.out.println(computeIndex(344));
        System.out.println(computeIndex(9841361));

    }

    public static int computeIndex(int n) {
        int newT = 0;
        int i = 0;
        while (i < n) {
            newT = newT + i;
            i++;

        }
        return i;
    }
}
