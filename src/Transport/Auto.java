package Transport;

import Driver.Driver;

import java.util.*;

public abstract class Auto<C extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;
    public Map<Auto,Mechanics>MechanicsMap = new HashMap<>();



    public Auto(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void PitStop();
    public void BestLapTime() {
        System.out.println("Лучшее время круга ");
    }
    public void MaxSpeed() {
        System.out.println( "Максимальная скорость ");
    }

    public void passDiagnostics () {
        System.out.println("Нужна диагностика");
        }







    public abstract void startMoving();

    public abstract void stopMoving();


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null|| brand.isEmpty()) {
            brand = "brand";
        }
        this.brand = brand;
    }

    public String getModel() { return model;}

    public void setModel(String model) {if (model==null||model.isEmpty()) {
        model = "default";
    }
    }
    public abstract void PrintType();

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume <=0) {
            engineVolume = 2; }
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Автомобиль "  + brand +" " + model  +
                " c объёмом двигателя " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.engineVolume,engineVolume) == 0 && brand.equals(auto.brand)
                && model.equals(auto.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, engineVolume,model);
    }
}


