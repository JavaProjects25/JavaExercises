package House;

import House.Basement.*;
import House.Interior.*;
import House.Roof.*;
import House.Structure.*;
import Core.*;

public class House {
    // Properties
    private IBasement basement;
    private IInterior interior;
    private IRoof roof;
    private IStructure structure;

    // Methods
    public void setBasement(Product_Type type) {
        this.basement = FactoryBasement.Factory(type);
    }

    public void setInterior(Product_Type type) {
        this.interior = FactoryInterior.Factory(type);
    }

    public void setRoof(Product_Type type) {
        this.roof = FactoryRoof.Factory(type);
    }

    public void setStructure(Product_Type type) {
        this.structure = FactoryStructure.Factory(type);
    }

    public void displayHouse() {
        if (basement != null) {
            basement.display();
        }
        if (interior != null) {
            interior.display();
        }
        if (roof != null) {
            roof.display();
        }
        if (structure != null) {
            structure.display();
        }
    }
}
