public class VechicleTests
{
  public static void main(String[] args)
  {

    Vehicle veh1 = new Vehicle("AAAAAA", 3.44, 5);
    Car car1 = new Car("MK4567", 6.75, 4, true);
    Truck truck1 = new Truck("TB12MX", 15.50, 2, 4, true);
    Taxi tax1 = new Taxi("TX1412", 13.75, 4, true, 2.0);

    veh1.route();
    car1.route();
    truck1.route();
    tax1.route();
  }
}
