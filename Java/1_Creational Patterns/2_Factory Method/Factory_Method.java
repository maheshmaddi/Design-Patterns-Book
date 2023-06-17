public abstract class Car {
    public abstract void accelerate();
    public abstract void brake();
    public abstract void steer();
}

public class SportsCar extends Car {
    public void accelerate() {
        // Implementation for sports car acceleration
    }

    public void brake() {
        // Implementation for sports car braking
    }

    public void steer() {
        // Implementation for sports car steering
    }
}

public class Sedan extends Car {
    public void accelerate() {
        // Implementation for sedan acceleration
    }

    public void brake() {
        // Implementation for sedan braking
    }

    public void steer() {
        // Implementation for sedan steering
    }
}

public class SUV extends Car {
    public void accelerate() {
        // Implementation for SUV acceleration
    }

    public void brake() {
        // Implementation for SUV braking
    }

    public void steer() {
        // Implementation for SUV steering
    }
}

public interface CarFactory {
    Car createCar();
}

public class SportsCarFactory implements CarFactory {
    public Car createCar() {
        return new SportsCar();
    }
}

public class SedanFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}

public class SUVFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }
}

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new SedanFactory();
        Car car = factory.createCar();
        car.accelerate();
        car.brake();
        car.steer();
    }
}

