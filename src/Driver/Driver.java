package Driver;

import Transport.Auto;

public class Driver < A extends Auto> {
    String fullName;
    boolean driversLicense;
    int experience;
    A vehicle;



    public Driver(String fullName, boolean driversLicense, int experience, A vehicle) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
        this.vehicle = vehicle;

    }

    public A getVehicle() {
        return vehicle;
    }

    public void setVehicle(A vehicle) {
        this.vehicle = vehicle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        if(fullName==null||fullName.isEmpty()) {

            this.fullName = "Пупкин Николай Петрович";}
        else {
            this.fullName = fullName;
        }
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        if (driversLicense==false) {
            System.out.println("Водителю запрещено ехать");
        }
        else {
            this.driversLicense = driversLicense;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience<=0) {
            this.experience = 3;
        }
         else {this.experience = experience;
    }
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
    public void StartAuto () {
        System.out.println("Водитель " + getFullName() + "Начал движение на " + getVehicle());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                ", vehicle=" + vehicle +
                '}';
    }
}
