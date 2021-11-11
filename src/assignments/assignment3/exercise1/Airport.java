package assignments.assignment3.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    // The id given to the planes in the airport
    private int planeID;
    private final String airportName;

    public Airport(String airportName) {
        this.airportName = airportName;
        this.planeID = 1;
    }

    List<Plane> planes = new ArrayList<>();

    public void land(Plane plane) {
        boolean idTaken = false;
        for (Plane airportPlane : planes) {
            if (plane.equals(airportPlane)) {
                idTaken = true;
                break;
            }
        }
        if (!idTaken) {
            plane.setId(planeID);
            setPlaneID();
            planes.add(plane);
        }
    }


    public void start(int id) {
        for (Plane airportPlane : planes) {
            if (id == airportPlane.id) {
                planes.remove(airportPlane);
                break;
            }
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Plane plane : planes) {
            output.append(plane.toString()).append("\n");
        }
        // remove last newline (\n)
        // TODO : fix when no planes?
        int tmp = output.length();
        if (tmp != 0) {
            output.delete(tmp -1, tmp);
        }
        return output.toString();

    }

    public void setPlaneID() {
        this.planeID++;
    }

    public String getAirportName() {
        return airportName;
    }
}
