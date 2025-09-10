public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.display();
        
        Vehicle bus = new Vehicle("Toyota", 100);
        bus.display();

        Vehicle truck = new Vehicle();
        truck.setMake("Hino");
        truck.setMilesPerGallon(80);
        truck.display();
    }
}
