public class Car implements MachineCapabilities {
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    @Override
    public String toString() {
        return "Назавание транспортного средства: %s\nКоличество колес: %d".formatted(modelName, wheelsCount);

    }


}