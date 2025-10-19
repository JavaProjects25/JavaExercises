package House.Basement;

import Core.Product_Type;

public abstract class FactoryBasement {
    public static IBasement Factory(Product_Type type) {
        return switch (type) {
            case DesertFactory -> new BasementDesert();
            case IglooFactory -> new BasementIgloo();
            case JungleFactory -> new BasementJungle();
        };
    }
}