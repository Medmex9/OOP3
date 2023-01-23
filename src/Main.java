import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Заз", "Шанс", 4, DriverB);
        Car car2 = new Car("Москвич","AZLK",3, DriverB);
        Car car3 = new Car("Toyota", "Spinter", 3, DriverB);
        Car car4 = new Car ("Nissan", "Skyline", 4, DriverB);
        Bus bus1 = new Bus("Volvo", "STPVG", 7, DriverD);
        Bus bus2 = new Bus("Luaz", "DT", 8, DriverD);
        Bus bus3 = new Bus("Paz", "p324", 5, DriverD);
        Bus bus4 = new Bus( "Scania", "FD351", 8, DriverD);
        Truck truck1 = new Truck("Scania", "CVV", 8, DriverC);
        Truck truck2 = new Truck("Volvo", "Tr379", 8, DriverC);
        Truck truck3 = new Truck("Scania", "CVC", 8, DriverC);
        Truck truck4 = new Truck("Kamaz", "D3", 8, DriverC);
        car1 = new Car("Заз", "Шанс", 4, DriverB);
        DriverB driver1 = new DriverB ("Пупкин Иван Иванович", true, 8, "c");
        DriverC driver2 = new DriverC("Ложкин Пётр Михайлович", true, 8, "c");
        DriverD driver3 = new DriverD("Абрамов Антон Сергеевич", true, 8, "c");
        DriverB driver4 = new DriverB("Мельников Леонид Николаевич", true, 8, "c");

        System.out.println(car1);
        car1.stopMoving();
        bus1.PitStop();
    }
public Car car1;
}

