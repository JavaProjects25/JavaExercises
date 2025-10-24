//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Classes.Engineers.*;
import Classes.Houses.*;
import Interfaces.IEngineersPriority;

public class Main {
    public static void main(String[] args) {

        int staminaRequiredtoBuild = 150;

        QuebecBuilder quebecBuilder = new QuebecBuilder();

        IEngineersPriority thirdEngineer = new ThirdCivilEngineer(quebecBuilder);
        IEngineersPriority secondEngineer = new SecondCivilEngineer(quebecBuilder, thirdEngineer);
        IEngineersPriority firstEngineer = new PrimaryCivilEngineer(quebecBuilder, secondEngineer);

        //casting to the primary engineer to access the ConstructHouse method
        firstEngineer.handleStamina(staminaRequiredtoBuild);
    }

}