package Transport;

import Driver.DriverC;


public class Truck extends Auto<DriverC> {
    public Truck (String brand, String model, int engineVolume, DriverC driver) {
    super(brand,model,engineVolume, DriverC driver);
}

}
