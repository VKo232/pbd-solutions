
public class VariableAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInACar, carpoolCapacity, averagePassengersPerCar;
        // num of cars
        cars = 100;
        // num space in car
        spaceInACar = 4; // floating point is a decimal number
        // num drivers 
        drivers = 30;
        // num passengers
        passengers = 90;
        // empty cars without drivers
        carsNotDriven = cars - drivers;
        // cars being drived is num of drivers
        carsDriven = drivers;
        // num of spots available
        carpoolCapacity = carsDriven * spaceInACar;
        // passengers in each car
        averagePassengersPerCar = passengers / carsDriven;


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
