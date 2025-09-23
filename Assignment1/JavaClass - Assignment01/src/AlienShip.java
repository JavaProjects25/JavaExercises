class AlienShip implements IFlightEnabled, ITrackable, ICameraEnabled, IMilitary, IAutopilot, INavigable, IEnergySource {

    private String destination;
    private final String energyType = "fuel";

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
    public void captureImage() {
        System.out.println(this.getClass().getName() + " captured an image.");
    }

    @Override
    public void deployWeapon() {
        System.out.println(this.getClass().getName() + " deploying weapon.");
    }

    @Override
    public void engageAutopilot() {
        System.out.println(this.getClass().getName() + " autopilot engaged.");
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println(this.getClass().getName() + " destination set to " + destination + ".");
    }

    @Override
    public String getEnergyType() {
        return energyType;
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getName() + "'s coordinates recorded.");
    }
}
