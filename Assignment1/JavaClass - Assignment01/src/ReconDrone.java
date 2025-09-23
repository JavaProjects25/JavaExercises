class ReconDrone extends Drone implements ICameraEnabled, ISensorEquipped {

    @Override
    public void captureImage() {
        System.out.println(this.getClass().getName() + " captured an image.");
    }

    @Override
    public void readSensors() {
        System.out.println(this.getClass().getName() + " reading onboard sensors.");
    }
}
