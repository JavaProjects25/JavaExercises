 class VolvoFactory extends AbstractFactory {

    @Override
     Car makeCar() {
      return  new VolvoCar() ; //call a builder
    }

    @Override
     Truck makeTruck() {
      return   new VolvoTruck();
    }
}
