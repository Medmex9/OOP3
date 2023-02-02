package Driver;

import Transport.Car;

public class DriverB  extends Driver <Car>{
    public DriverB(String fullName, boolean driversLicense, int experience, Car vehicle, String category) {
        super(fullName, driversLicense, experience, vehicle, category);
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
        return "DriverB{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }
}
