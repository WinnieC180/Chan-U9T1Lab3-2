public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public double getFareCollected() {
    return fareCollected;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Total fare collected: " + fareCollected);
  }

  public boolean chargeAndDropOffRiders(double farePerRider) {
    fareCollected += farePerRider * (getPassengers() - 1); //passengers includes driver so u have to subtract 1
    return dropOffPassengers(getPassengers() - 1);
  }

  @Override
  public void route() {
    System.out.println("What's your destination?");
  }
}

