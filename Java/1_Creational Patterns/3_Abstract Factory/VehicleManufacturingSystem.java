// Additional Concrete Products
class ElectricTruck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling electric truck...");
    }
}

class GasolineTruck implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Assembling gasoline truck...");
    }
}

// Additional Concrete Factories
class ElectricTruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricTruck();
    }
}

class GasolineTruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasolineTruck();
    }
}

// Updated Client
public class VehicleManufacturingSystem {
    public static void main(String[] args) {
        VehicleFactory electricCarFactory = new ElectricCarFactory();
        VehicleFactory gasolineCarFactory = new GasolineCarFactory();
        VehicleFactory electricMotorcycleFactory = new ElectricMotorcycleFactory();
        VehicleFactory gasolineMotorcycleFactory = new GasolineMotorcycleFactory();
        VehicleFactory electricTruckFactory = new ElectricTruckFactory();
        VehicleFactory gasolineTruckFactory = new GasolineTruckFactory();

        Vehicle electricCar = electricCarFactory.createVehicle();
        Vehicle gasolineCar = gasolineCarFactory.createVehicle();
        Vehicle electricMotorcycle = electricMotorcycleFactory.createVehicle();
        Vehicle gasolineMotorcycle = gasolineMotorcycleFactory.createVehicle();
        Vehicle electricTruck = electricTruckFactory.createVehicle();
        Vehicle gasolineTruck = gasolineTruckFactory.createVehicle();

        electricCar.assemble();
        gasolineCar.assemble();
        electricMotorcycle.assemble();
        gasolineMotorcycle.assemble();
        electricTruck.assemble();
        gasolineTruck.assemble();
    }
}
