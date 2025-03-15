import javax.swing.*;

public abstract class Vehicle implements Comparable<Vehicle> {
  private int vehicleId;
  private boolean engineIsStarted;

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }

  public void startEngine() {
    engineIsStarted = true;
  }

  @Override
  public int compareTo(Vehicle o) {
    if (this.vehicleId > o.vehicleId)
      return 1;
    else if (this.vehicleId < o.vehicleId)
      return -1;
    else
      return 0;

    // Kort og lækker måde at opnå præcis det samme:
    // return this.vehicleId - o.vehicleId;

    /*
    Tal mindre end 0: Dette objekt skal før det andet.
    Tal større end 0: Dette objekt skal efter det andet.
    Tallet 0: De to objekter er "lige" med hinanden.
     */
  }

  @Override
  public String toString() {
    return "" + vehicleId;
  }
}
