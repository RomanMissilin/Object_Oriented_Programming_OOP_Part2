import java.time.LocalDate;

public class Car extends Transport implements Main.Checker {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void setPublishingWheelsCount(int wheelsCount) {
        if (wheelsCount < 2 || wheelsCount > LocalDate.now().getYear()) {
            System.out.println(wheelsCount + " некорректен, передайте корректный год!");
            return;
        }
        this.wheelsCount = wheelsCount;
    }
    // А от этого есть смысл или я не правильно это реализовал?

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void serve() {
        System.out.println("Меняем покрышку");
    }
}
