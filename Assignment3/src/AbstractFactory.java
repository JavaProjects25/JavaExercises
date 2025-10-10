abstract class AbstractFactory {
//singleton design pattern
static AbstractFactory factoryTruck = new TruckFactory();
static AbstractFactory factoryCar = new CarFactory();

static AbstractFactory factory(Type type){

     AbstractFactory factory=null;

     switch(type) {
         case Truck:
             factory  = factoryTruck ;

             break;
         case Car:
             factory = factoryCar;

             break;
     }
         return factory;
 }
    abstract Volvo makeVolvo();
    abstract Mercedes makeMercedes();
}
