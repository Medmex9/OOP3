import Driver.Driver;
import Transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Mechanics mexanics1 = new Mechanics("Иван", "Петров", "Рога и копыта",
                car1, driver1);
        Mechanics mexanics2 = new Mechanics("Пётр", "Васильевич", "ИП Молоток",car2,
                driver2);
        Mechanics mexanics3 = new Mechanics("Ленар", "Хусаинов", "ооо Омега",truck1,
                driver3);
        Mechanics mexanics4 = new Mechanics("Андрей", "Турбин", "ИП Канкор", bus3,
                driver4);
        car2.PrintType();
        car1.passDiagnostics();

// Авто что будут участвовать в гонке
        List<Auto> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(truck1);
        list.add(truck2);
        list.add(truck3);
        list.add(truck4);
        list.add(bus1);
        list.add(bus2);
        list.add(bus3);
        list.add(bus4);
        System.out.print(list);

        // Список механиков
        //List<Mechanics> mechanicsList= new ArrayList<>();
        //mechanicsList.add(mexanics1);
        //mechanicsList.add(mexanics2);
        //mechanicsList.add(mexanics3);
       // mechanicsList.add(mexanics4);
        //System.out.println(mechanicsList);
        mexanics2.fixAuto();
// ТО
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.AllAuto(car1); // Добавили машину
        serviceStation.makeAService(); // Сделали ТО и далее
        serviceStation.AllAuto(car2);
        serviceStation.makeAService();
        mexanics2.printInfo();

        Map<Auto, Mechanics> hashMechanics = new HashMap<Auto, Mechanics>();
        hashMechanics.put(car1, mexanics1);
        hashMechanics.put(car1, mexanics2);
        hashMechanics.put(car3, mexanics3);
        hashMechanics.put(car4, mexanics4);
        System.out.println(hashMechanics);






    }



}

