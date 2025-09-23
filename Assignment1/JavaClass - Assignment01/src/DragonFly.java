class DragonFly implements IFlightEnabled {

    String name;
    String type;

    DragonFly(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void takeOff(){
        System.out.println("DragonFly takes off.");
    }

    @Override
    public void land(){
        System.out.println("DragonFly lands.");
    }

    @Override
    public void fly(){
        System.out.println("DragonFly flies.");
    }

}
