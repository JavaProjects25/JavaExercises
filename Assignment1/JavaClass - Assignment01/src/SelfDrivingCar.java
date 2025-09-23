class SelfDrivingCar implements INavigable, IAutopilot, ITrackable, ICameraEnabled, ISensorEquipped, IEnergySource {

    private String destination;
    private final String energyType = "electric";

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println(this.getClass().getName() + " destination set to " + destination + ".");
    }

    @Override
    public void engageAutopilot() {
        System.out.println(this.getClass().getName() + " autopilot engaged.");
    }

    @Override
    public void captureImage() {
        System.out.println(this.getClass().getName() + " captured an image.");
    }

    @Override
    public void readSensors() {
        System.out.println(this.getClass().getName() + " reading cameras and proximity sensors.");
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
