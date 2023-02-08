package Transport;
import Driver.Driver;

public class Mechanics <D extends Driver> {
    private  String name;
    private String surname;
    private  String mechanicsEmployer;
    private Auto auto;
    private D driver;


    public Mechanics(String name, String surname, String mechanicsEmployer, Auto auto, D driver) {
        this.name = name;
        this.surname = surname;
        this.mechanicsEmployer = mechanicsEmployer;
        this.auto = auto;
        this.driver = driver;
    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void performMaintenance() {
        System.out.println("Механик" + getName() + " " + getSurname() +
            " проводит плановое обслуживание " + auto.getBrand() +" " + auto.getModel());


    }
    public void fixAuto() {
        System.out.println("Механик" + getName() + " " + getSurname() +
                " ремонтирует машину " + auto.getBrand() +" " + auto.getModel() );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name == null&& name.isEmpty())
            name = "Механик";
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if( name == null&& name.isEmpty())
            name = "Иванов";
        this.surname = surname;
    }

    public String getMechanicsEmployer() {
        return mechanicsEmployer;
    }

    public void setMechanicsEmployer(String mechanicsEmployer) {
        if( name == null&& name.isEmpty())
            name = "OOO Гараж";
        this.mechanicsEmployer = mechanicsEmployer;
    }
    public void printInfo() {
        System.out.println(getName() + " " + getSurname() + " Обслуживает машину " + getAuto().getBrand() +
                " водитель машины " + driver.getFullName());
    }

    @Override
    public String toString() {
        return "Механик " + getName() + " " + getSurname() + " Из компании " + getMechanicsEmployer();
    }
}
