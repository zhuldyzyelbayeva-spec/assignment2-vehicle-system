public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Alex", "A123");
        Driver driver2 = new Driver("Maria", "B456");

        Car car = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Yamaha", 2019, false);
        Truck truck = new Truck("Volvo", 2018, 12.5, 6);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }

            v.stopEngine();
            System.out.println("----------");
        }
    }
}

