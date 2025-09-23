class Dolphin extends Animal implements ITrackable, ISensorEquipped {

    @Override
    void move() {
        System.out.println("Swims like a menace.");
    }

    @Override
    public void readSensors() {
        System.out.println(this.getClass().getName() + " reading attached sensor.");
    }

    @Override
    public void track() {
        System.out.println(this.getClass().getName() + "'s coordinates recorded.");
    }
}
