package Classes.Engineers;

import Classes.Houses.House;
import Interfaces.IBuilder;
import Interfaces.IEngineersPriority;

public class SecondCivilEngineer implements IEngineersPriority {

    IBuilder iBuilder;
    int stamina;

    private IEngineersPriority nextEngineer;

    public SecondCivilEngineer(IBuilder iBuilder, IEngineersPriority nextEngineer) {
        this.iBuilder = iBuilder;
        this.nextEngineer = nextEngineer;
        stamina = 120;
    }

    public void ConstructHouse()
    {
        iBuilder.BuildBasement();
        iBuilder.BuildStructure();
        iBuilder.BuildWalls();
        iBuilder.BuildRoof();
        iBuilder.GetHouse().DisplayHouse();
    }

    public House GetHouse()
    {
        return iBuilder.GetHouse();
    }

    @Override
    public void handleStamina(int staminaRequired) {

        if (staminaRequired <= stamina) {
            System.out.println("House constructed by Second Civil Engineer");
            ConstructHouse();
        } else {

            System.out.println("passing to next engineer");
            staminaRequired -= stamina;
            stamina = 0;
            nextEngineer.handleStamina(staminaRequired);
        }
    }
}
