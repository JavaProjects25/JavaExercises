package Classes;

import Interfaces.IBuilder;

public class PersianBuilder implements IBuilder {

    private House house;

    PersianBuilder()
    {
        house = new House();
    }
    public void BuildBasement()
    {
        house.SetBasement("Persian Basement");
    }
    public void BuildRoof()
    {
        house.SetRoof("Persian Roof");
    }
    public void BuildStructure()
    {
        house.SetStructure("Persian Structure");
    }
    public void BuildWalls()
    {
        house.SetWalls("Persian Walls");
    }
    public House GetHouse()
    {
        return house;
    }
}
