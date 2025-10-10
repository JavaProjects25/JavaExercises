 class MercedesFactory extends AbstractFactory{

    @Override
     Car makeCar() {
        return  new MercedesCar() ;
    }

    @Override
     Truck makeTruck() {
        return   new MercedesTruck();
    }
}
