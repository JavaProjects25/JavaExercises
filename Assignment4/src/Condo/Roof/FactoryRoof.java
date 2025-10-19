package Condo.Roof;

import Core.*;

public abstract class FactoryRoof {

    public static IRoof Factory(Product_Type type){

        return switch (type){
            case DesertFactory -> new RoofDesert();
            case IglooFactory -> new RoofIgloo();
            case JungleFactory -> new RoofJungle();
        };
    }
}
