package Classes.Engineers;

import Classes.Houses.House;
import Interfaces.IBuilder;
import Interfaces.IEngineersPriority;

public class ThirdCivilEngineer implements IEngineersPriority {

    IBuilder iBuilder;

    private IEngineersPriority nextEngineer;

    int stamina;

    public ThirdCivilEngineer(IBuilder iBuilder) {
        this.iBuilder = iBuilder;
        stamina = 140;
    }

    public void ConstructHouse() {

        iBuilder.BuildBasement();
        iBuilder.BuildStructure();
        iBuilder.BuildWalls();
        iBuilder.BuildRoof();
        iBuilder.GetHouse().DisplayHouse();
    }

    public House GetHouse() {
        return iBuilder.GetHouse();
    }

    @Override
    public void handleStamina(int staminaRequired) {

        if (staminaRequired <= stamina) {
            ConstructHouse();
            System.out.println("House constructed by Second Civil Engineer");
        } else {

            System.out.println("last engineer, cannot pass further and house is not built");
        }

    }
}
