class Missile implements IFlightEnabled, IMilitary, ITrackable {

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

    @Override
    public void deployWeapon() {
        System.out.println(this.getClass().getName() + " deploying weapon.");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getName() + "'s coordinates recorded.");
    }
}
