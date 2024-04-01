 public interface MachineCapabilities {
    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
     public default void checkEngine() {
         System.out.println("Проверяем двигатель");
     }
}
