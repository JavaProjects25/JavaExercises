public class Main {
    public static void main(String[] args) {



       AbstractFactory factory =AbstractFactory.factory(Type.mercedes);
       Truck truck = factory.makeTruck();
       Car car =factory.makeCar();
       truck.display();
       car.display();

        factory =AbstractFactory.factory(Type.volvo);
        truck = factory.makeTruck();
        car =factory.makeCar();
        truck.display();
        car.display();

    }
}