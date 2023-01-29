package Transport;

import Driver.DriverC;

public class Truck extends Auto<DriverC> {
    public Tonnage tonnage;
    public Truck(String brand, String model, double engineVolume, Tonnage tonnage) {
        super(brand, model, engineVolume);
        this.tonnage = tonnage;
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void PrintType() {
        if (tonnage == null) {
            System.out.println("Данных по авто недостаточно");
        } else System.out.println("Грузоподъемность грузовика " + getBrand() + " " + getModel() + " составляет от " + getTonnage().getFrom() + " до " +
                getTonnage().getTo() + " тонн.");

    }

    @Override
    public void PitStop() {System.out.println("Грузовик марки "+ getBrand() + " заехал на Пит стоп");
    }

    @Override
    public void startMoving() {System.out.println("Грузовик марки "+ getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {System.out.println("Грузовик марки "+ getBrand() + " закончил движение");
    }
}
