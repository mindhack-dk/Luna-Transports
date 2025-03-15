import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Transports {
  public static void main(String[] args) {
    ArrayList<Vehicle> transports = new ArrayList();
    transports.add(new Plane());
    transports.add(new Car());
    transports.add(new Ship());

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
