package Transport;

import Driver.Driver;

public class Auto<C extends Driver> implements Competing {

    public String brand;
    public String model;
    public int engineVolume;
    private C driver;

    public Auto(String brand, String model, int engineVolume, C driver) {

        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
    }

    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    public void PitStop() {
        System.out.println("Встал на пит-стоп " + getModel() );

    }
    public void BestLapTime() {
        System.out.println("Лучшее время круга ");
    }
    public void MaxSpeed() {
        System.out.println( "Максимальная скорость ");
    }



    public void startMoving() {
        System.out.println("Начал движение " + getBrand());
    }

    public void stopMoving() {

        System.out.println("Закончил движение" + getBrand());
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        if (model==null) {
            model = "default";
        }

         return model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Автомобиль "  + brand +" " + model  +
                " c объёмом двигателя " + engineVolume;
    }
}


