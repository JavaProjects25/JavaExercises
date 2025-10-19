package Condo.Builders;

import Condo.Condo;

public class JungleCondoBuilder implements IBuilder {
    Condo condo;

    public JungleCondoBuilder() {
        condo = new Condo();
    }
    @Override
    public void buildBasement(){
        System.out.println("building Jungle Condo Basement");
    }
    @Override
    public void buildInterior(){
        System.out.println("building Jungle Condo Interior");
    }
    @Override
    public void buildRoof(){
        System.out.println("building Jungle Condo Roof");
    }
    @Override
    public void buildStructure(){
        System.out.println("building Jungle Condo Structure");
    }
    @Override
    public Condo getCondo(){
        return condo;
    }
}
