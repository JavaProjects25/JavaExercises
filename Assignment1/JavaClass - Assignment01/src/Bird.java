class Bird extends Animal {

    @Override
    void move() {
        System.out.println(this.getClass().getName() + " Bird is flying");
;    }

    void takeOff(){
        System.out.println(this.getClass().getName() + " is taking off");
    }

    void land(){
        System.out.println( this.getClass().getName() + " is landing");
    }

    void fly(){
        System.out.println( this.getClass().getName() + " is flying");
    }

    void track(){
        System.out.println(this.getClass().getName() + " is being tracked");
    }

}
