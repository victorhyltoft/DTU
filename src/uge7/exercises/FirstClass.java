package uge7.exercises;

/* Skeleton for the exercise */

public class FirstClass<name, id> {

    // Put the field declarations here
    private String name;
    private int id;


    //Contructor
    public FirstClass(String name, int id) {
        // Add body
        this.name = name;
        this.id = id;
    }

    // Method

    public String toString() {
        return this.id + " - " + this.name;
    }

}

