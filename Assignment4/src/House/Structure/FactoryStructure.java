package House.Structure;

import Core.Product_Type;

public abstract class FactoryStructure {
    public static IStructure Factory(Product_Type type) {
        return switch (type) {
            case DesertFactory -> new StructureDesert();
            case IglooFactory -> new StructureIgloo();
            case JungleFactory -> new StructureJungle();
        };
    }
}