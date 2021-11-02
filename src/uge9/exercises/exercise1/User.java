package uge9.exercises.exercise1;

import java.util.Arrays;

public class User {
    // Fields
    private final int userID;
    private static int nextUserID = 0;
    private static int idx = 0;

    private static final int MAX_BOOKS = 5;
    private static long[] bookLoans = new long[MAX_BOOKS];


    // Constructor
    public User() {
        this.userID = getNextUserID();
    }

    // Setters/Getters
    private static int getNextUserID() {
        setNextUserID();
        return nextUserID;
    }

    private static void setNextUserID() {
        User.nextUserID++;
    }

    // Instance methods
    public void loanBook(long libNum) {
        if (bookLoans.length <= MAX_BOOKS) {
            bookLoans[idx] = libNum;
            idx++;
        }
        else {
            System.out.println("Can't borrow any more books");
        }
    }

    public void removeBooks(long libNum) {
        // TODO
    }

    // Getters
    public int getUserID() {
        return userID;
    }

    public long[] getBookLoans() {
        return bookLoans;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", bookLoans=" + Arrays.toString(bookLoans) +
                '}';
    }

}
