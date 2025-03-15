import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Transports {
  public static void main(String[] args) {
    ArrayList<Vehicle> transports = new ArrayList();
    Plane plane = new Plane();
    plane.setVehicleId(117);
    transports.add(plane);
    Car car = new Car();
    car.setVehicleId(11);
    transports.add(car);
    Ship ship = new Ship();
    ship.setVehicleId(7);
    transports.add(ship);

    System.out.println(transports);

    Collections.sort(transports);

    System.out.println(transports);

    /*
    Sorterer listen jf. compareTo() , som er implementeret i Vehicle vha. Comparable-interfacet.
    Collections.sort(transports);
     */

    for (Vehicle v : transports) {
      if (v instanceof Plane)
        ((Plane) v).fly();
      else if (v instanceof Car)
        ((Car) v).drive();
      else if (v instanceof Ship)
        ((Ship) v).sail();
    }
  }
}
