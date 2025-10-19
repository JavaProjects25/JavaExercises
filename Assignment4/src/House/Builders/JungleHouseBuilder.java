package House.Builders;

import House.*;
public class JungleHouseBuilder implements IBuilder {
    // Properties
    House house;

    // Constructor
    public JungleHouseBuilder() {
        house = new House();
    }

    // Methods
    @Override
    public void buildBasement() {
        System.out.println("Building Jungle House: Basement");
    }
    @Override
    public void buildInterior() {
        System.out.println("Building Jungle House: Interior");
    }
    @Override
    public void buildRoof() {
        System.out.println("Building Jungle House: Roof");
    }
    @Override
    public void buildStructure() {
        System.out.println("Building Jungle House: Structure");
    }
    @Override
    public House getHouse() {
        return house;
    }
}
