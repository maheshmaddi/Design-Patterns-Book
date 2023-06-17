public abstract class Car {
    public abstract void Accelerate();
    public abstract void Brake();
    public abstract void Steer();
}

public class SportsCar : Car {
    public override void Accelerate() {
        // Implementation for sports car acceleration
    }

    public override void Brake() {
        // Implementation for sports car braking
    }

    public override void Steer() {
        // Implementation for sports car steering
    }
}

public class Sedan : Car {
    public override void Accelerate() {
        // Implementation for sedan acceleration
    }

    public override void Brake() {
        // Implementation for sedan braking
    }

    public override void Steer() {
        // Implementation for sedan steering
    }
}

public class SUV : Car {
    public override void Accelerate() {
        // Implementation for SUV acceleration
    }

    public override void Brake() {
        // Implementation for SUV braking
    }

    public override void Steer() {
        // Implementation for SUV steering
    }
}

public interface ICarFactory {
    Car CreateCar();
}

public class SportsCarFactory : ICarFactory {
    public Car CreateCar() {
        return new SportsCar();
    }
}

public class SedanFactory : ICarFactory {
    public Car CreateCar() {
        return new Sedan();
    }
}

public class SUVFactory : ICarFactory {
    public Car CreateCar() {
        return new SUV();
    }
}

public static void Main(string[] args) {
    ICarFactory factory = new SedanFactory();
    Car car = factory.CreateCar();
    car.Accelerate();
    car.Brake();
    car.Steer();
}
