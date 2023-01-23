package Driver;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean driversLicense, int experience, String rank) {
        super(fullName, driversLicense, experience, rank);
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
}
