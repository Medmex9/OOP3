package Transport;

import Driver.DriverC;
import Driver.DriverD;

public class Bus extends Auto <DriverC> {
    public Bus(String brand, String model, int engineVolume, DriverD driver) {
        super(brand, model, engineVolume, DriverD driver);
    }

}
