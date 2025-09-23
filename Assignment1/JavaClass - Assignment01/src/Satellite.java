class Satellite implements IOrbitEarth {
    @Override
    public void achieveOrbit() {
        System.out.println("Orbiting Earth.");
    }
    @Override
    public void takeOff() {
        System.out.println("satellite takes off.");
    }
    @Override
    public void land() {
        System.out.println("satellite lands.");
    }
    @Override
    public void fly() {
        System.out.println("satellite flies.");
    }
}
