class Glider implements IFlightEnabled {

    @Override
    public void takeOff() {
        System.out.println(this.getClass().getName() + " is taking off.");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getName() + " is landing.");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getName() + " is flying.");
    }
}
