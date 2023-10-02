package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    // проверка, что экземпляр объекта Car является экземпляром Vehicle
    @Test
    public void testCarInstance() {
        Car car = new Car("VW","Passat", 2020);
        assertTrue(car instanceof Vehicle);
    }

    // проверка, что объект Car создается с 4-мя колесами
    @Test
    public void testCarWheels() {
        Car car = new Car("VW","Passat", 2020);
        assertEquals(4, car.getNumWheels());
    }

    // проверка, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleWheels() {
        Motorcycle motorcycle = new Motorcycle("BMW","GS100", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

    // проверка, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarSpeed() {
        Car car = new Car("VW","Passat", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    // проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("BMW","GS100", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    // проверка, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarParking() {
        Car car = new Car("VW","Passat", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    // проверка, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotorcycleParking() {
        Motorcycle motorcycle = new Motorcycle("BMW","GS100", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}