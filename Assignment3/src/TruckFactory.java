 class TruckFactory extends AbstractFactory{

    @Override
    Volvo makeVolvo() {
        return  new VolvoTruck() ;
    }

    @Override
    Mercedes makeMercedes() {
        return   new MercedesTruck();
    }
}
