class CommunicationSatellite extends Satellite implements ICommunicable {

    @Override
    public void transmitData() {
        System.out.println(this.getClass().getName() + " transmitting data.");
    }
}
