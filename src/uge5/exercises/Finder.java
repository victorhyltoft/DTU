package uge5.exercises;

public class Finder {
    public static void main(String[] args) {

        System.out.println(Finder.find(1,2,10));
        System.out.println(Finder.find(2,1,13));
        System.out.println(Finder.find(11,1,13));
        System.out.println(Finder.find(2,2,13));
        System.out.println(Finder.find(1,-1,6));
        System.out.println(Finder.find(1,1,6));
        System.out.println(Finder.find(0,0,0));
        System.out.println(Finder.find(112,133,67));
        System.out.println(Finder.find(11200,133,67));
        System.out.println(Finder.find(11201,133,67));
        System.out.println(Finder.find(11231,173,67));
        System.out.println(Finder.find(11231,0,13));
        System.out.println(Finder.find(0,112324,13));

    }

    public static String find(int k, int n, int b) {
        // check for illegal input
        if (n < 0 || k < 0 || b <= 0) {
            return "Error";
        }

        int newZ = n;
        int i = 1;
        while (true) {

            // check for overflow
            if (newZ > Integer.MAX_VALUE - newZ)
                return "Overflow";

            // Check if conditions is met
            if (newZ % b == 0) {
                return Integer.toString(newZ);
            }
            // Calculate new value
            newZ = newZ + k + (i - 1);

            // Increment to update condition
            i++;
        }
    }
}
