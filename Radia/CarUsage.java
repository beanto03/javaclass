public class CarUsage {
    private String carName;
    private double fuel;

    
    public CarUsage(String carName, double fuel) {
        this.carName = carName;
        this.fuel = fuel;
    }

   
    public String getCarName() {
        return carName;
    }

 
    public double getFuel() {
        return fuel;
    }

    
    public void displayFuelUsage() {
        System.out.println(carName + " uses " + fuel + " liters of fuel per 100 km.");
    }

    public static void main(String[] args) {
        
        
        Object[][] carData = {
            {"Honda", 7.5},
            {"Proton", 10.0},
            {"Produa", 6.0},
            {"Mazda", 12.0}
        };

        
        Car[] cars = new Car[carData.length];

        
        for (int i = 0; i < carData.length; i++) {
            String carName = (String) carData[i][0];   
            double fuel = (double) carData[i][1];     
            cars[i] = new Car(carName, fuel);          
        }

   
        for (Car car : cars) {
            switch (car.getCarName()) {
                case "Honda":
                case "Proton":
                case "Produa":
                case "Mazda":
                    car.displayFuelUsage();
                    break;
                default:
                    System.out.println("Unknown car type.");
                    break;
            }
        }
    }
}
