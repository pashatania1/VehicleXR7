public class Vehicle {
    //property/atribut/variabel
    private String make;
    private int milesPerGallon;

    //Default Constructor
    public Vehicle() {
        make = "BMW";
        milesPerGallon = 50;
    }

    //Constructor Parameter
    public Vehicle(String m, int mpg) {
        make = m;
        milesPerGallon = mpg;
    }

    //Getter
    public String getMake() {
        return make;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    //Setter
    public void setMake(String m) {
        make = m;
    }

    public void setMilesPerGallon(int mpg) {
        milesPerGallon = mpg;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Miles per Gallon: " + milesPerGallon);
    }

}
