class Bird extends Animal implements IFlightEnabled, ITrackable {

    @Override
    void move() {
<<<<<<< HEAD
        System.out.println(this.getClass().getName() + " Bird is flying");
    }
=======
        System.out.println("Flap wings");
;   }
>>>>>>> origin/main

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

    @Override
    public void track(){
        System.out.println(this.getClass().getName() + " is being tracked");
    }

}
