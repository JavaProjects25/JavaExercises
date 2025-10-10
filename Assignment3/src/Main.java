public class Main {
    public static void main(String[] args) {

        AbstractFactory factory = AbstractFactory.factory(Type.Car);
        Volvo volvoCar = factory.makeVolvo();
        volvoCar.display();
        Mercedes mercedesCar = factory.makeMercedes();
        mercedesCar.display();


        factory = AbstractFactory.factory(Type.Truck);
        Volvo volvoTruck = factory.makeVolvo();
        volvoTruck.display();
        Mercedes mercedesTruck = factory.makeMercedes();
        mercedesTruck.display();

    }
}