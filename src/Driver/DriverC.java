package Driver;

import Transport.Car;
import Transport.Truck;

import java.util.Objects;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, boolean driversLicense, int experience, Truck vehicle, DriverLicenseCategory category) {
        super(fullName, driversLicense, experience, vehicle,category);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverC driverC = (DriverC)o;
        return Objects.equals(category, driverC.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
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
