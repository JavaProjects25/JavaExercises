package Condo.Builders;
import Condo.Condo;

public interface IBuilder {
    void buildBasement();
    void buildInterior();
    void buildRoof();
    void buildStructure();
    Condo getCondo();
}
