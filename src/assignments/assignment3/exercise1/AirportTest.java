package assignments.assignment3.exercise1;

public class AirportTest {
    public static void main(String[] args) {
        PassengerPlane p2 = new PassengerPlane("Boing","737", 241);p2.setId(2);
        FreightPlane p3 = new FreightPlane("Antonov","124",110); p3.setId(3);
        FreightPlane p1 = new FreightPlane("Boing","747F",112); p1.setId(1);
        PassengerPlane p4 = new PassengerPlane("Airbus","321",192);p4.setId(4);
        PassengerPlane p5 = new PassengerPlane("Airbus","380",853);p5.setId(5);

        Airport AP = new Airport("Kastrup Lufthavn");
        AP.land(p1);
        AP.land(p2);
        AP.land(p2);
        AP.start(1);
        AP.start(2);
        System.out.println(AP);
    }
}
