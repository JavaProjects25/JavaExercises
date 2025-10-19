package House.Builders;

import House.*;

public interface IBuilder {
    void buildBasement();
    void buildInterior();
    void buildRoof();
    void buildStructure();
    House getHouse();
}
