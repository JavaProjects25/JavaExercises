package House.Builders;

import House.*;

public class Engineer {
    // Properties
    IBuilder ibuilder;

    // Constructor
    public Engineer(IBuilder builder) {
        ibuilder = builder;
    }

    // Methods
    public void createHouse() {
        ibuilder.buildBasement();
        ibuilder.buildInterior();
        ibuilder.buildRoof();
        ibuilder.buildStructure();
    }

    public House getHouse() {
        return ibuilder.getHouse();
    }
}