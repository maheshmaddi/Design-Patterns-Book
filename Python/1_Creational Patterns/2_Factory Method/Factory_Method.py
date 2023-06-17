from abc import ABC, abstractmethod

class Car(ABC):
    @abstractmethod
    def accelerate(self):
        pass

    @abstractmethod
    def brake(self):
        pass

    @abstractmethod
    def steer(self):
        pass

class SportsCar(Car):
    def accelerate(self):
        # Implementation for sports car acceleration
        pass

    def brake(self):
        # Implementation for sports car braking
        pass

    def steer(self):
        # Implementation for sports car steering
        pass

class Sedan(Car):
    def accelerate(self):
        # Implementation for sedan acceleration
        pass

    def brake(self):
        # Implementation for sedan braking
        pass

    def steer(self):
        # Implementation for sedan steering
        pass

class SUV(Car):
    def accelerate(self):
        # Implementation for SUV acceleration
        pass

    def brake(self):
        # Implementation for SUV braking
        pass

    def steer(self):
        # Implementation for SUV steering
        pass

class CarFactory(ABC):
    @abstractmethod
    def create_car(self):
        pass

class SportsCarFactory(CarFactory):
    def create_car(self):
        return SportsCar()

class SedanFactory(CarFactory):
    def create_car(self):
        return Sedan()

class SUVFactory(CarFactory):
    def create_car(self):
        return SUV()

factory = SedanFactory()
car = factory.create_car()
car.accelerate()
car.brake()
car.steer()
