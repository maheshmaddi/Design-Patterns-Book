#include <iostream>

// Abstract Product
class Vehicle {
public:
    virtual void assemble() = 0; // pure virtual function makes this class Abstract class
};

// Concrete Products
class ElectricCar : public Vehicle {
public:
    void assemble() override {
        std::cout << "Assembling electric car..." << std::endl;
    }
};

class GasolineCar : public Vehicle {
public:
    void assemble() override {
        std::cout << "Assembling gasoline car..." << std::endl;
    }
};

class ElectricMotorcycle : public Vehicle {
public:
    void assemble() override {
        std::cout << "Assembling electric motorcycle..." << std::endl;
    }
};

class GasolineMotorcycle : public Vehicle {
public:
    void assemble() override {
        std::cout << "Assembling gasoline motorcycle..." << std::endl;
    }
};

// Abstract Factory
class VehicleFactory {
public:
    virtual Vehicle* createVehicle() = 0; // pure virtual function
};

// Concrete Factories
class ElectricCarFactory : public VehicleFactory {
public:
    Vehicle* createVehicle() override {
        return new ElectricCar();
    }
};

class GasolineCarFactory : public VehicleFactory {
public:
    Vehicle* createVehicle() override {
        return new GasolineCar();
    }
};

class ElectricMotorcycleFactory : public VehicleFactory {
public:
    Vehicle* createVehicle() override {
        return new ElectricMotorcycle();
    }
};

class GasolineMotorcycleFactory : public VehicleFactory {
public:
    Vehicle* createVehicle() override {
        return new GasolineMotorcycle();
    }
};

// Client
int main() {
    VehicleFactory* electricCarFactory = new ElectricCarFactory();
    VehicleFactory* gasolineCarFactory = new GasolineCarFactory();
    VehicleFactory* electricMotorcycleFactory = new ElectricMotorcycleFactory();
    VehicleFactory* gasolineMotorcycleFactory = new GasolineMotorcycleFactory();

    Vehicle* electricCar = electricCarFactory->createVehicle();
    Vehicle* gasolineCar = gasolineCarFactory->createVehicle();
    Vehicle* electricMotorcycle = electricMotorcycleFactory->createVehicle();
    Vehicle* gasolineMotorcycle = gasolineMotorcycleFactory->createVehicle();

    electricCar->assemble();
    gasolineCar->assemble();
    electricMotorcycle->assemble();
    gasolineMotorcycle->assemble();

    delete electricCarFactory;
    delete gasolineCarFactory;
    delete electricMotorcycleFactory;
    delete gasolineMotorcycleFactory;
    delete electricCar;
    delete gasolineCar;
    delete electricMotorcycle;
    delete gasolineMotorcycle;

    return 0;
}
