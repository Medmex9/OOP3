package Transport;

import Driver.DriverC;

import java.util.Objects;

public class Truck extends Auto<DriverC> {
    public static Tonnage tonnage;
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
    public void passDiagnostics() {
        System.out.println("Грузовику" + getBrand() +" " + getModel() + " Нужно пройти диагностику" );
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Objects.equals(tonnage, Truck.tonnage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tonnage);
}
}
