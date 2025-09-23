class AutonomousBoat implements INavigable, IAutopilot, ITrackable, IEnergySource, ISensorEquipped {

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
    public String getEnergyType() {
        return energyType;
    }

    @Override
    public void readSensors() {
        System.out.println(this.getClass().getName() + " reading boat sensors.");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getName() + "'s coordinates recorded.");
    }
}
