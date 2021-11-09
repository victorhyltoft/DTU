package assignments.testing;

public class TestExam {
    public static void main(String[] args) {
//        opg5(7,3);
        System.out.println(opg1(new int[]{1,4,2,3}));
        System.out.println(opg1alternative(new int[]{1,4,2,3}));

    }
    public static void opg5(int a, int b) {
        for(int i = a; i <10; i++) {
            for (int j = 1; j <= b; j++) {
                System.out. print ("1");
            }
            for (int j = 3; j < i-b ; j++) {
                System.out. print ("0");
            }
        }
    }

    private static int opg1 (int[] a) {
        int c1 = 0;
        int c2 = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                c1 = c1 + j / 2;
            } else {
                c1 = c1 + j / 2;
                c2 = c2 + 1;
            }
        }
        return 2* c1+c2;
    }

    private static int opg1alternative(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }

}
