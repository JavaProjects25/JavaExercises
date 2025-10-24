//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import  Classes.*;
import  Interfaces.*;
public class Main {
    public static void main(String[] args) {

        ItalianBuilder italianHouseBuilder = new ItalianBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(italianHouseBuilder);
        civilEngineer.ConstructHouse();
        civilEngineer.GetHouse().DisplayHouse();

        QuebecBuilder indianHouseBuilder = new QuebecBuilder();
        CivilEngineer civilEngineer2 = new CivilEngineer(indianHouseBuilder);
        civilEngineer2.ConstructHouse();
        civilEngineer2.GetHouse().DisplayHouse();
    }
   
}