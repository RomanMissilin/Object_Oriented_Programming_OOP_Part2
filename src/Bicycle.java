public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживает " + getWheelsCount());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
