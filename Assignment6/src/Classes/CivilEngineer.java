package Classes;
import Interfaces.IBuilder;

public class CivilEngineer {

    IBuilder iBuilder;

    public CivilEngineer(IBuilder iBuilder)
    {
        this.iBuilder = iBuilder;
    }

    public void ConstructHouse()
    {
        iBuilder.BuildBasement();
        iBuilder.BuildStructure();
        iBuilder.BuildWalls();
        iBuilder.BuildRoof();
    }

    public House GetHouse()
    {
        return iBuilder.GetHouse();
    }
}
