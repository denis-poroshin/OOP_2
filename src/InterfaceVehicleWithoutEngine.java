public interface InterfaceVehicleWithoutEngine {
    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
