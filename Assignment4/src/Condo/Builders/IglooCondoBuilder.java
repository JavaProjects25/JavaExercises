package Condo.Builders;

import Condo.Condo;

public class IglooCondoBuilder implements IBuilder
{
    Condo condo;

    public IglooCondoBuilder() {
        condo = new Condo();
    }
    @Override
    public void buildBasement(){
        System.out.println("building Igloo Condo Basement");
    }
    @Override
    public void buildInterior(){
        System.out.println("building Igloo Condo Interior");
    }
    @Override
    public void buildRoof(){
        System.out.println("building Igloo Condo Roof");
    }
    @Override
    public void buildStructure(){
        System.out.println("building Igloo Condo Structure");
    }
    @Override
    public Condo getCondo(){
        return condo;
    }
}
