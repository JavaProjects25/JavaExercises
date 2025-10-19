package Core;

import Condo.*;
import House.House;
import Condo.Builders.*;

public class IglooFactory extends AbstractFactory {

    @Override
    public House makeHouse(){
        return new House();
    }


    @Override
    public Condo makeCondo()
    {
       return new Condo();
    }
}
