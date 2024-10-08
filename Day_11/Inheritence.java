class Vehicle{
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public double calculateRental(int day) {
        return rentalPricePerDay * day;
    }

    public Vehicle(String make, String model, int year, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

}

class Car extends Vehicle{
    private int numSeats, numDoors;

    public int getNumSeats(){
        return numSeats;
    }
    public int getNumDoors() {
        return numDoors;
    }

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors) {
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }
}

class Motorcycle extends Vehicle{
    private int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize) {
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Car car = new Car("Proton", "Neo", 2009, 100.0, 2, 5);
        Motorcycle motor = new Motorcycle("Yamaha", "Y15", 2016, 10.0, 150);

        int day = 5;

        System.out.println("Car details");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Total rental: " + car.calculateRental(day));

        System.out.println("Motorcycle details");
        System.out.println("Make: " + motor.getMake());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Year: " + motor.getYear());
        System.out.println("Total rental: " + motor.calculateRental(day));

    }
}