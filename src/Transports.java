import java.util.ArrayList;

public class Transports {
  public static void main(String[] args) {
    ArrayList<Vehicle> transports = new ArrayList();
    transports.add(new Plane());
    transports.add(new Car());
    transports.add(new Ship());

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
