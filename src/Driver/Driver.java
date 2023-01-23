package Driver;

public class Driver {
    String fullName;
    boolean driversLicense;
    int experience;
    String rank;


    public Driver(String fullName, boolean driversLicense, int experience, String rank) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
        this.rank = rank;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void startMoving() {
        System.out.println("Начал движение " + getFullName());
    }

    public void stopMoving() {

        System.out.println("Закончил движение" + getFullName());
    }
    public void Refuel() {
        System.out.println("Водитель " + fullName + " Заехал на заправку");
    }

    public String toString() {
        return "Водитель" + fullName + driversLicense +
                " со стажем" + experience;
    }
}
