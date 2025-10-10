abstract class AbstractFactory {
//singleton design pattern
static AbstractFactory factoryMercedes = new MercedesFactory();
static AbstractFactory factoryVolvo = new VolvoFactory();

static AbstractFactory factory(Type type){

     AbstractFactory factory=null;

     switch(type) {
         case mercedes:
             factory  =factoryMercedes ;

             break;
         case volvo:
             factory = factoryVolvo;

             break;
     }
         return factory;
 }
    abstract Car makeCar();
    abstract Truck makeTruck();
}
