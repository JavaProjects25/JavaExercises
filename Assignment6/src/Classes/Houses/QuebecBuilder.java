package Classes.Houses;

import Interfaces.IBuilder;

public class QuebecBuilder implements IBuilder {

    private House house;

    public QuebecBuilder()
    {
        house = new House();
    }
    public void BuildBasement()
    {
        house.SetBasement("Quebec Basement");
    }
    public void BuildRoof()
    {
        house.SetRoof("Quebec Roof");
    }
    public void BuildStructure()
    {
        house.SetStructure("Quebec Structure");
    }
    public void BuildWalls()
    {
        house.SetWalls("Quebec Walls");
    }
    public House GetHouse()
    {
        return house;
    }
}
