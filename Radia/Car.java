
public class Car {
    private String carName;
    private double fuel; 

    public Car(String carName, double fuel) {
        this.carName = carName;
        this.fuel = fuel;
    }

   
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

   
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void displayFuelUsage() {
        System.out.println(carName + " uses " + fuel + " liters of fuel per 100 km.");
    }

    public static void main(String[] args) {

        // Array to hold car objects
        Car[] cars = new Car[4];

      
        cars[0] = new Car("Honda", 7.5);    
        cars[1] = new Car("Proton", 10.0);        
        cars[2] = new Car("Produa", 6.0);   
        cars[3] = new Car("Mazda", 12.0); 

        
        for (int i = 0; i < cars.length; i++) {
            switch (cars[i].getCarName()) {
                case "Honda":
                    cars[i].displayFuelUsage();
                    break;
                case "Proton":
                    cars[i].displayFuelUsage();
                    break;
                case "Produa":
                    cars[i].displayFuelUsage();
                    break;
                case "Mazda":
                    cars[i].displayFuelUsage();
                    break;
                default:
                    System.out.println("Unknown car type.");
                    break;
            }
        }
    }
}
