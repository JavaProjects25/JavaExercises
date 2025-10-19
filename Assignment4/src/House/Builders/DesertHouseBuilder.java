package House.Builders;

import House.*;
public class DesertHouseBuilder implements IBuilder {
    // Properties
    House house;

    // Constructor
    public DesertHouseBuilder() {
        house = new House();
    }

    // Methods
    @Override
    public void buildBasement() {
        System.out.println("Building Desert House: Basement");
    }
    @Override
    public void buildInterior() {
        System.out.println("Building Desert House: Interior");
    }
    @Override
    public void buildRoof() {
        System.out.println("Building Desert House: Roof");
    }
    @Override
    public void buildStructure() {
        System.out.println("Building Desert House: Structure");
    }
    @Override
    public House getHouse() {
        return house;
    }
}
