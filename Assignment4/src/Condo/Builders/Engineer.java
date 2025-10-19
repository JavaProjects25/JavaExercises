package Condo.Builders;

import Condo.*;

public class Engineer {

    IBuilder ibuilder;

    public Engineer(IBuilder ibuilder) {
        this.ibuilder = ibuilder;
    }

    public void createCondo() {
        ibuilder.buildBasement();
        ibuilder.buildInterior();
        ibuilder.buildRoof();
        ibuilder.buildStructure();
    }

    public Condo getCondo() {
        return ibuilder.getCondo();
    }
}
