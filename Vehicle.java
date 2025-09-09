public class Vehicle {
    //property/atribut/variabel
    private String make;
    private int milesPerGallon;

    //Constructor
    public Vehicle() {
        make = "BMW";
        milesPerGallon = 50;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Miles per Gallon: " + milesPerGallon);
    }

}
