package Driver;

import Transport.Bus;

import java.util.Objects;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, boolean driversLicense, int experience, Bus vehicle, DriverLicenseCategory category) {
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
    public String toString() {
        return "DriverD{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD driverD = (DriverD)o;
        return Objects.equals(category, driverD.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
}
