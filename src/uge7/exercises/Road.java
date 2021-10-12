package uge7.exercises;

import java.text.DecimalFormat;
import java.util.Locale;

public class Road {

    private double lenght;
    private double width;
    private String name;
    private String surface;

    public static void main(String[] a){
        test1();

    }
    private static void test1() {

        Road[] roads = new Road[9];
        roads[0] = new Road(1203, 8.3, "Ravehøjvej", "concrete");
        roads[1] = new Road(785, 12.5, "Anker Engelunds Vey", "asphalt");
        roads[2] = new Road(2307, 15.3, "Lundtoftegårdsvej", "asphalt");
        roads[3] = new Road(831, 2.65, "Vesthussti", "dirt");
        roads[4] = new Road(2731, 4.0512, "Ulvedalsvej", "gravel");
        roads[5] = new Road(3400, 21.30, "Lyngby omfartsvej", "concrete");
        roads[6] = new Road(31, 0.50, "Småsti", "dirt");
        roads[7] = new Road(102.5, 3.0, "Storsti", "mud");
        roads[8] = new Road(102.5, 3.0, "ILLEGAL", "dirt");

        for (int i = 0; i < roads.length; i++) {
            System.out.println(roads[i]);
        }

        roads[2].setName("Ny Lundtoftegårdsvej");
        System.out.println(roads[2]);
        roads[0].setSurface("asphalt");
        System.out.println(roads[0]);
        roads[1].setWidth(13.2);
        System.out.println(roads[1]);
        roads[1].setWidth(0.2);
        System.out.println(roads[1]);
        roads[1].setSurface("something");
        System.out.println(roads[1]);
        roads[1].setLength(12345);
        System.out.println(roads[1]);

        System.out.println(roads[3].getName());
        System.out.println(roads[4].getLength());
        System.out.println(roads[5].getWidth());
        System.out.println(roads[1].getSurface());
    }

    // Accessors
    public String getSurface() {
        return this.surface;
    }

    public String getWidth() {
        return String.format(Locale.ROOT, "%.2f", this.width);
    }

    public String getLength() {
        // Round to two decimals
        return String.format(Locale.ROOT, "%.2f", this.lenght);

    }

    public String getName() {
        return this.name;
    }


    //
    public void setLength(double i) {
        System.out.println("No, this is not allowed");
    }

    public void setWidth(double width) {
        if (width < 1) {
            System.out.println("No, this is not allowed");
        } else this.width = width;
    }

    public void setSurface(String surface) {
        String s = this.surface;
        if (s != "asphalt" || s != "gravel" || s != "concrete" || s != "dirt") {
            System.out.println("No, this is not allowed");
        }
        else this.surface = surface;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method
    public String toString() {
        return "Road " + getName() + " l="+getLength() + " w="+getWidth() + " surface="+getSurface();
    }

    //Contructor
    public Road(double length, double width, String name, String surface) {
        if (width < 1
                || surface != "asphalt" && surface != "gravel" && surface != "concrete" && surface != "dirt"
                || name == "ILLEGAL") {
            this.lenght = 0;
            this.name = "ILLEGAL";
            this.width = 0;
            this.surface = "";
        }

        else {
            this.lenght = length;
            this.width = width;
            this.name = name;
            this.surface = surface;
        }


    }
    
    
}


    

