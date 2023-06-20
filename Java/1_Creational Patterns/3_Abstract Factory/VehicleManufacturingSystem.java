// Abstract Product
interface Vehicle {
    void assemble();
}

// Concrete Products
class ElectricCar implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling electric car...");
    }
}

class GasolineCar implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling gasoline car...");
    }
}

class ElectricMotorcycle implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling electric motorcycle...");
    }
}

class GasolineMotorcycle implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling gasoline motorcycle...");
    }
}

// Abstract Factory
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete Factories
class ElectricCarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricCar();
    }
}

class GasolineCarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasolineCar();
    }
}

class ElectricMotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricMotorcycle();
    }
}

class GasolineMotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasolineMotorcycle();
    }
}

// Client
public class VehicleManufacturingSystem {
    public static void main(String[] args) {
        VehicleFactory electricCarFactory = new ElectricCarFactory();
        VehicleFactory gasolineCarFactory = new GasolineCarFactory();
        VehicleFactory electricMotorcycleFactory = new ElectricMotorcycleFactory();
        VehicleFactory gasolineMotorcycleFactory = new GasolineMotorcycleFactory();

        Vehicle electricCar = electricCarFactory.createVehicle();
        Vehicle gasolineCar = gasolineCarFactory.createVehicle();
        Vehicle electricMotorcycle = electricMotorcycleFactory.createVehicle();
        Vehicle gasolineMotorcycle = gasolineMotorcycleFactory.createVehicle();

        electricCar.assemble();
        gasolineCar.assemble();
        electricMotorcycle.assemble();
        gasolineMotorcycle.assemble();
    }
}
