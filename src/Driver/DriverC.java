package Driver;

import Transport.Car;
import Transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, boolean driversLicense, int experience, Truck vehicle) {
        super(fullName, driversLicense, experience, vehicle);
    }

    @Override
    public void startMoving() {
        super.startMoving();
    }

    @Override
    public void stopMoving() {
        super.stopMoving();
    }

    @Override
    public void Refuel() {
        super.Refuel();
    }
    @Override
    public void StartAuto() {
        super.StartAuto();
    }

    @Override
    public String toString() {
        return "DriverC{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }
}
