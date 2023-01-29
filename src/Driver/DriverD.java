package Driver;

import Transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, boolean driversLicense, int experience, Bus vehicle) {
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
        return "DriverD{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }
}
