package Classes;

import Interfaces.*;

public class Emergency {
    // Properties
    IMedicalTeam delegatee;

    // Methods
    public Emergency() { }

    public void performCPR() {
        if(delegatee != null) {
            delegatee.performCPR();
        }
    }
}
