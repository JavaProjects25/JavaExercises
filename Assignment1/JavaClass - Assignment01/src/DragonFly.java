class DragonFly implements IFlightEnabled {

    String name;
    String type;

    public DragonFly(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void takeOff(){
        System.out.println(this.getClass().getName() + " is taking off");


    }

    @Override
    public void land(){
        System.out.println( this.getClass().getName() + " is landing");
    }

    @Override
    public void fly(){
        System.out.println( this.getClass().getName() + " is flying");
    }

}
