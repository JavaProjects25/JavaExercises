package BeforeState;

public class Lion {

    String state;

    Lion(){
        this.state = "Hungry"; //Hungry by default
    }
    void setState(String s){
        this.state = s;
    }

    String getState(){
        return this.state;
    }

    void changeState(){
        if(getState() == "Hungry"){
            setState("NotHungry");
            System.out.println("Lion is not Hungry");
        }
        else if(getState() == "NotHungry"){
            setState("Angry");
            System.out.println("Lion ANGRY!!!");
        }
        else if(getState() == "Angry"){
            setState("Hungry");
            System.out.println("Lion is Hungry");
        }
    }
}
