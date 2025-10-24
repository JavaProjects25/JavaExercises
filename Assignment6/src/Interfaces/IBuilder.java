package Interfaces;

import Classes.*;
public interface IBuilder {

    void BuildBasement();
    void BuildStructure();
    void BuildWalls();
    void BuildRoof();
    House GetHouse();
}
