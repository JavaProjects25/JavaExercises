class DragonFly {

    String name;
    String type;

    public DragonFly(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void takeOff(){
        System.out.println(this.getClass().getName() + " is taking off");


    }

    void land(){
        System.out.println( this.getClass().getName() + " is landing");
    }

    void fly(){
        System.out.println( this.getClass().getName() + " is flying");
    }

}
