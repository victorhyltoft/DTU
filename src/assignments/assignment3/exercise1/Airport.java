package assignments.assignment3.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    // The id given to the planes in the airport
    private int planeID = 1;

    List<Plane> planes = new ArrayList<>();

    // Constructor
    public Airport() {
    }

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
            increaseID();
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
        // remove last newline (\n) (use .strip())
        return output.toString();

    }

    public void increaseID() {
        this.planeID++;
    }

}
