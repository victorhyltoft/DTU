package uge7.exercises;

public class Person {

    public static void main(String[] args) {
        Person p1 = new Person("Jens","Jensen");
        Person p2 = new Person("Niels","Nielsen");
        Person p3 = new Person("Hans","Hansen");
        Person p4 = new Person("Carl","Carlsen");
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        System.out.println(p4.toString());
        System.out.println(p3.toString());

    }

    // Put the field declarations here
    private String firstName;
    private String lastName;
    private int id;
    private static int nextID = 1;


    //Contructor
    public Person(String firstName, String lastName) {
        // Add body
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = getNextID(nextID);
    }

    public int getNextID(int id) {
        return nextID++;
    }

    // Method
    public String toString() {
        return this.id + ": " + this.firstName + " " + this.lastName;
    }

}

