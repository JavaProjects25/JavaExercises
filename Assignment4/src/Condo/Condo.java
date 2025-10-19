package Condo;

import Condo.Basement.*;
import Condo.Interior.*;
import Condo.Roof.*;
import Condo.Structure.*;
import Core.*;

public class Condo {
    private IBasement basement;
    private IInterior interior;
    private IRoof roof;
    private IStructure structure;

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

    public void displayCondo() {
        if (basement != null)
            basement.display();

        if (interior != null)
            interior.display();

        if (roof != null)
            roof.display();

        if (structure != null)
            structure.display();
    }
}


