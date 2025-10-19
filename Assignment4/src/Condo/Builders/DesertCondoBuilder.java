package Condo.Builders;
import Condo.*;

public class DesertCondoBuilder implements IBuilder {

    Condo condo;

    public DesertCondoBuilder() {
        condo = new Condo();
    }
   @Override
   public void buildBasement(){
        System.out.println("building Desert Condo Basement");
   }
    @Override
    public void buildInterior(){
        System.out.println("building Desert Condo Interior");
    }
    @Override
    public void buildRoof(){
        System.out.println("building Desert Condo Roof");
    }
    @Override
    public void buildStructure(){
        System.out.println("building Desert Condo Structure");
    }
    @Override
    public Condo getCondo(){
        return condo;
    }

}
