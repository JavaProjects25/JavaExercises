package Core;

import House.House;
import Condo.Condo;

abstract class AbstractFactory {

    public static AbstractFactory desertFactory = new DesertFactory();
    public static AbstractFactory iglooFactory = new IglooFactory();
    public static AbstractFactory jungleFactory = new JungleFactory();

    public static AbstractFactory factory(Product_Type type) {

        AbstractFactory factory = null;

        switch (type) {
            case DesertFactory:
                factory = desertFactory;
                break;

            case IglooFactory:
                factory = iglooFactory;
                break;

            case JungleFactory:
                factory = jungleFactory;
                break;
        }
        return factory;
    }

    public abstract House makeHouse();

    public abstract Condo makeCondo();
}
