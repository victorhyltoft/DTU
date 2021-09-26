package aflevering1;

/**
 * @author Victor Hyltoft - s214964
 *
 *
 */

public class IntervalSearch {

    public static void main(String[] args) {
        //@ TestGroup
        //@ Feedback: full
        //@ Test
        System.out.println(intervalContains(5, 11, 3));
        //@ Test
        System.out.println(intervalContains(5, 11, 4));
        //@ Test
        System.out.println(intervalContains(17, 17, 17));
        //@ Test
        System.out.println(intervalContains(17, 17, 5));
        //@ Test
        System.out.println(intervalContains(12, 18, 12));
        //@ Test
        System.out.println(intervalContains(18, 12, 12));
        //@ Test
        System.out.println(intervalContains(18, 24, 12));
        //@ Test
        System.out.println(intervalContains(18, 144, 12));
        //@ Test
        System.out.println(intervalContains(18, 14403434, 12));
        //@ Test
        System.out.println(intervalContains(5, 11, 1));
        //@ Test
        System.out.println(intervalContains(1, 5, 1));
        //@ End
    }

    public static boolean intervalContains(int g1, int g2, int b) {

        // The scenario that b <= 1 and not in the interval would result in an infinite loop,
        // thus we check for this scenario first
        if (b <= 1) {
            if (((g1 <= b) && (g2 >= b)) || ((g1 >= b) && (g2 <= b))) {
                return true;
            }
            else {
                return false;
            }
        }

        // Brute forcing...

        int pow_result = 1;
        // Why while-loop instead of for-loop? Because we don't know how many iterations we need to through
        while (true) {

            // Consider in what order we should compare to make the code more performant.


            // Compare the power and the interval
            // We check
            if (((g1 <= pow_result) && (g2 >= pow_result)) || ((g1 >= pow_result) && (g2 <= pow_result))) {
                return true;
            }
            // Check the upper-bounds for "a" such that b^a <= (g1 or g2)
            // If this is the case, a can not be valid.
            else if ((pow_result >= g1) && (pow_result >= g2)) {
                return false;

            }
            // Check the lower-bounds
            else if ((pow_result <= g1) && (pow_result <= g2)) {
                pow_result *= b;

            }
            else {
                return false;
            }

        }




    }


}
