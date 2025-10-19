package House.Builders;

import House.*;
public class IglooHouseBuilder implements IBuilder {
    // Properties
    House house;

    // Constructor
    public IglooHouseBuilder() {
        house = new House();
    }

    // Methods
    @Override
    public void buildBasement() {
        System.out.println("Building Igloo House: Basement");
    }
    @Override
    public void buildInterior() {
        System.out.println("Building Igloo House: Interior");
    }
    @Override
    public void buildRoof() {
        System.out.println("Building Igloo House: Roof");
    }
    @Override
    public void buildStructure() {
        System.out.println("Building Igloo House: Structure");
    }
    @Override
    public House getHouse() {
        return house;
    }
}
