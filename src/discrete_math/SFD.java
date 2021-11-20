package discrete_math;

import java.util.ArrayList;

public class SFD {

    public static void main(String[] args) {
	//Set s and t and run. (Remember s0 >= t0 >= 0)
        int s0 = 357;
        int t0 = 221;

            //////////////////////////
           /// No No, Don't touch ///
          /// me there, this is, ///
         /// my no no square    ///
        //////////////////////////
        ArrayList<Integer> r = new ArrayList<>(); r.add(s0); r.add(t0);
        ArrayList<Integer> q = new ArrayList<>(); q.add(-1); q.add(-1);
        ArrayList<Integer> s = new ArrayList<>(); s.add(1); s.add(0);
        ArrayList<Integer> t = new ArrayList<>(); t.add(0); t.add(1);

        System.out.println("row \t r \t q \t s \t t");
        System.out.println("-----------------------------------");
        System.out.println("0" + "\t" + r.get(0) + "\t" + q.get(0) + "\t"+ s.get(0) + "\t" + + t.get(0) + "\t");
        System.out.println("1" + "\t" + r.get(1) + "\t" + q.get(1) + "\t"+ s.get(1) + "\t" + + t.get(1) + "\t");

        int it = 2;
        while(!r.get(r.size()-1).equals(0) && it < 50) {

            r.add(r.get(it - 2) % r.get(it - 1));
            q.add((int)Math.floor(r.get(it - 2)/r.get(it - 1)));
            s.add(s.get(it-2)-(q.get(it)*s.get(it-1)));
            t.add(t.get(it-2)-(q.get(it)*t.get(it-1)));

            System.out.println(it + "\t" + r.get(it) + "\t" + q.get(it) + "\t"+ s.get(it) + "\t" + + t.get(it) + "\t");
            it++;
        }
        System.out.println();
        int sfd = r.get(it - 2);
        int mfm = s0*t0/sfd;
        System.out.println("sfd(" + r.get(0) + "," + r.get(1) + ") = " + sfd);
        System.out.println("mfm(" + r.get(0) + "," + r.get(1) + ") = " + mfm);
    }
}
