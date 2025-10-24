package Classes.Houses;

import Interfaces.IBuilder;

public class ItalianBuilder implements IBuilder {

    private House house;

    public ItalianBuilder()
    {
        house = new House();
    }
    public void BuildBasement()
    {
        house.SetBasement("Italian Basement");
    }
    public void BuildRoof()
    {
        house.SetRoof("Italian Roof");
    }
    public void BuildStructure()
    {
        house.SetStructure("Italian Structure");
    }
    public void BuildWalls()
    {
        house.SetWalls("Italian Walls");
    }
    public House GetHouse()
    {
        return house;
    }

}
