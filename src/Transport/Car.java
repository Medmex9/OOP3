package Transport;

import Driver.DriverB;

public class Car extends Auto <DriverB> {
    public Car(String brand, String model, int engineVolume, DriverB driver) {
        super(brand,model,engineVolume, DriverB driver);
    }


}


