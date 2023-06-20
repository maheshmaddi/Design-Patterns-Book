// Abstract Product
public interface IVehicle {
    void Assemble();
}

// Concrete Products
public class ElectricCar : IVehicle {
    public void Assemble() {
        Console.WriteLine("Assembling electric car...");
    }
}

public class GasolineCar : IVehicle {
    public void Assemble() {
        Console.WriteLine("Assembling gasoline car...");
    }
}

public class ElectricMotorcycle : IVehicle {
    public void Assemble() {
        Console.WriteLine("Assembling electric motorcycle...");
    }
}

public class GasolineMotorcycle : IVehicle {
    public void Assemble() {
        Console.WriteLine("Assembling gasoline motorcycle...");
    }
}

// Abstract Factory
public interface IVehicleFactory {
    IVehicle CreateVehicle();
}

// Concrete Factories
public class ElectricCarFactory : IVehicleFactory {
    public IVehicle CreateVehicle() {
        return new ElectricCar();
    }
}

public class GasolineCarFactory : IVehicleFactory {
    public IVehicle CreateVehicle() {
        return new GasolineCar();
    }
}

public class ElectricMotorcycleFactory : IVehicleFactory {
    public IVehicle CreateVehicle() {
        return new ElectricMotorcycle();
    }
}

public class GasolineMotorcycleFactory : IVehicleFactory {
    public IVehicle CreateVehicle() {
        return new GasolineMotorcycle();
    }
}

// Client
public class VehicleManufacturingSystem {
    static void Main(string[] args) {
        IVehicleFactory electricCarFactory = new ElectricCarFactory();
        IVehicleFactory gasolineCarFactory = new GasolineCarFactory();
        IVehicleFactory electricMotorcycleFactory = new ElectricMotorcycleFactory();
        IVehicleFactory gasolineMotorcycleFactory = new GasolineMotorcycleFactory();

        IVehicle electricCar = electricCarFactory.CreateVehicle();
        IVehicle gasolineCar = gasolineCarFactory.CreateVehicle();
        IVehicle electricMotorcycle = electricMotorcycleFactory.CreateVehicle();
        IVehicle gasolineMotorcycle = gasolineMotorcycleFactory.CreateVehicle();

        electricCar.Assemble();
        gasolineCar.Assemble();
        electricMotorcycle.Assemble();
        gasolineMotorcycle.Assemble();
    }
}
