package Transport;

import Driver.DriverD;

import java.util.*;

public class Bus extends Auto<DriverD> {
    public static Capacity capacity;

    public Bus(String brand, String model, int engineVolume, Capacity capacity) {

        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void PrintType() {
        if (capacity == null) {
            System.out.println("Данных недостаточно");
        } else
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " составляет от " + capacity.getFrom() + " до " +
                    capacity.getTo() + " человек.");
    }

    @Override
    public void PitStop() {
        System.out.println("Автобус марки " + getBrand() + " Заехал на Пит Стоп");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus)o;
        return Objects.equals(capacity, Bus.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);

    }
}
