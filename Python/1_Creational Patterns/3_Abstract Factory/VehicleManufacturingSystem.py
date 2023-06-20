from abc import ABC, abstractmethod

# Abstract Product
class Vehicle(ABC):
    @abstractmethod
    def assemble(self):
        pass

# Concrete Products
class ElectricCar(Vehicle):
    def assemble(self):
        print("Assembling electric car...")

class GasolineCar(Vehicle):
    def assemble(self):
        print("Assembling gasoline car...")

class ElectricMotorcycle(Vehicle):
    def assemble(self):
        print("Assembling electric motorcycle...")

class GasolineMotorcycle(Vehicle):
    def assemble(self):
        print("Assembling gasoline motorcycle...")

# Abstract Factory
class VehicleFactory(ABC):
    @abstractmethod
    def create_vehicle(self):
        pass

# Concrete Factories
class ElectricCarFactory(VehicleFactory):
    def create_vehicle(self):
        return ElectricCar()

class GasolineCarFactory(VehicleFactory):
    def create_vehicle(self):
        return GasolineCar()

class ElectricMotorcycleFactory(VehicleFactory):
    def create_vehicle(self):
        return ElectricMotorcycle()

class GasolineMotorcycleFactory(VehicleFactory):
    def create_vehicle(self):
        return GasolineMotorcycle()

# Client
def main():
    electric_car_factory = ElectricCarFactory()
    gasoline_car_factory = GasolineCarFactory()
    electric_motorcycle_factory = ElectricMotorcycleFactory()
    gasoline_motorcycle_factory = GasolineMotorcycleFactory()

    electric_car = electric_car_factory.create_vehicle()
    gasoline_car = gasoline_car_factory.create_vehicle()
    electric_motorcycle = electric_motorcycle_factory.create_vehicle()
    gasoline_motorcycle = gasoline_motorcycle_factory.create_vehicle()

    electric_car.assemble()
    gasoline_car.assemble()
    electric_motorcycle.assemble()
    gasoline_motorcycle.assemble()

if __name__ == "__main__":
    main()
