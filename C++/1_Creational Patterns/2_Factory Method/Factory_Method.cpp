class Car {
public:
    virtual void accelerate() = 0;
    virtual void brake() = 0;
    virtual void steer() = 0;
};

class SportsCar : public Car {
public:
    void accelerate() override {
        // Implementation for sports car acceleration
    }

    void brake() override {
        // Implementation for sports car braking
    }

    void steer() override {
        // Implementation for sports car steering
    }
};

class Sedan : public Car {
public:
    void accelerate() override {
        // Implementation for sedan acceleration
    }

    void brake() override {
        // Implementation for sedan braking
    }

    void steer() override {
        // Implementation for sedan steering
    }
};

class SUV : public Car {
public:
    void accelerate() override {
        // Implementation for SUV acceleration
    }

    void brake() override {
        // Implementation for SUV braking
    }

    void steer() override {
        // Implementation for SUV steering
    }
};

class CarFactory {
public:
    virtual Car* createCar() = 0;
};

class SportsCarFactory : public CarFactory {
public:
    Car* createCar() override {
        return new SportsCar();
    }
};

class SedanFactory : public CarFactory {
public:
    Car* createCar() override {
        return new Sedan();
    }
};

class SUVFactory : public CarFactory {
public:
    Car* createCar() override {
        return new SUV();
    }
};

int main() {
    CarFactory* factory = new SedanFactory();
    Car* car = factory->createCar();
    car->accelerate();
    car->brake();
    car->steer();
    delete car;
    delete factory;
    return 0;
}
