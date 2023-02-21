package Transport;
import Driver.DriverB;

public class Car extends Auto<DriverB> implements Competing {
    private TypeOfBody typeOfBody;
    public Car(String brand, String model, int engineVolume, TypeOfBody typeOfBody ) {
        super(brand,model,engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void PrintType() {
        if (typeOfBody == null) {
            System.out.println("Информации недостаточно");
        } else System.out.println("Кузов авто " + getBrand() + " " + getModel() + " - " + getTypeOfBody());
    }


    @Override
    public void passDiagnostics() {
        System.out.println("Автомобилю" + getBrand() + " " + getModel() + " Нужно пройти диагностику" );
    }

    @Override
    public void PitStop() {System.out.println("Автомобиль  марки "+ getBrand() + " заехал на Пит стоп");
    }

    @Override
    public void startMoving() {System.out.println("Автомобиль марки "+ getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {System.out.println("Автомобиль марки "+ getBrand() + " закончил движение");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


