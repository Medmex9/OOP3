import Driver.Driver;
import Transport.*;

import static Transport.Capacity.*;
import static Transport.TypeOfBody.*;
import static Driver.DriverLicenseCategory.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Заз", "Шанс", 4, SEDAN);
        Car car2 = new Car("Москвич", "AZLK", 4, SEDAN);
        Car car3 = new Car("Toyota", "Spinter", 4, STATINOWAGON);
        Car car4 = new Car("Nissan", "Skyline", 4, COUPE);
        Bus bus1 = new Bus("Volvo", "STPVG", 7, LARGE);
        Bus bus2 = new Bus("Luaz", "DT", 8, EXTRA_LARGE);
        Bus bus3 = new Bus("Paz", "p324", 5, MEDIUM);
        Bus bus4 = new Bus("Scania", "FD351", 8, EXTRA_LARGE);
        Truck truck1 = new Truck("Scania", "CVV", 8, Tonnage.N2);
        Truck truck2 = new Truck("Volvo", "Tr379", 8, Tonnage.N2);
        Truck truck3 = new Truck("Scania", "CVC", 8,Tonnage.N2);
        Truck truck4 = new Truck("Kamaz", "D3", 8,Tonnage.N2);
        Driver<Truck> driver1 = new Driver<Truck>("Пупкин Иван Иванович", true,
                8, truck1, C);
        Driver<Bus> driver2 = new Driver<Bus>("Ложкин Пётр Михайлович", true, 8,
                bus2, D);
        Driver<Truck> driver3 = new Driver<Truck>("Абрамов Антон Сергеевич", true, 8,
                truck3, C);
        Driver<Car> driver4 = new Driver<Car>("Мельников Леонид Николаевич", true, 8,
                car1, B);
        car2.PrintType();
        car1.passDiagnostics();
    }



}

