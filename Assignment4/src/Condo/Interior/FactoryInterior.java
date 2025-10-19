package Condo.Interior;

import Core.Product_Type;

public abstract class FactoryInterior {

    public static IInterior Factory(Product_Type type) {

        return switch (type) {
            case DesertFactory -> new InteriorDesert();
            case IglooFactory -> new InteriorIgloo();
            case JungleFactory -> new InteriorJungle();
        };

    }
}
