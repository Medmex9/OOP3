package Transport;

import Driver.DriverD;

public class Bus extends Auto<DriverD> {
    public Capacity capacity;

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
        if( capacity == null)  {
            System.out.println("Данных недостаточно");
        } else System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " составляет от " + capacity.getFrom() + " до " +
                capacity.getTo() +" человек." );
    }

    @Override
    public void PitStop() {
        System.out.println("Автобус марки "+ getBrand() + " Заехал на Пит Стоп");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки "+ getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус марки "+ getBrand() + " закончил движение");
    }


}
