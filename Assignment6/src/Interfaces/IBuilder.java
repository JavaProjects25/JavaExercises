package Interfaces;

import Classes.Houses.House;

public interface IBuilder {

    void BuildBasement();
    void BuildStructure();
    void BuildWalls();
    void BuildRoof();
    House GetHouse();
}
