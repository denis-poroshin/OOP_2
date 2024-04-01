public class Main {
    public static void main(String[] args) {

        Car car = new Car("Nissan Qashqai", 4);
        Car cargo = new Truck("КамАЗ", 6);
        VehicleWithoutEngine bike = new Bicycle("Trek Bicycle", 2);
        VehicleWithoutEngine cart = new VehicleWithoutEngine("Продуктовая тележка", 4);

        System.out.println(car);
        System.out.println(cargo);
        System.out.println(bike);
        System.out.println(cart);
        ServiceStation serviceStation = new ServiceStation();
        Truck newCargo = new Truck("КамАЗ", 6); // Создал новый объект, чтобы не кастить Truck в методах ниже

        serviceStation.check(car);
        serviceStation.check(bike);
        serviceStation.check(newCargo);


        serviceStation.check(null, bike, newCargo);
        serviceStation.check(car, null, newCargo);
        serviceStation.check(null, bike, null);



    }



}
