class CarFactory extends AbstractFactory {

    @Override
    Volvo makeVolvo() {

        return new VolvoCar(); //call a builder
    }

    @Override
    Mercedes makeMercedes() {

        return new MercedesCar();

    }
}
