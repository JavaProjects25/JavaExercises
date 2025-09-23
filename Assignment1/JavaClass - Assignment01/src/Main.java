//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bird extends Animal implements IFlightEnabled, ITrackable
        goBird();

        //Satellite implements OrbitEarth which implements FlightEnabled
        goSatellite();

        //gathering all entities implementing the ITrackable interface
        goTrackables();
    }

    private static void goNext() {
        System.out.println("\n\n-------------\n\n");
    }

    private static void goTrackables() {


        //gathering all entities implementing the ITrackable interface

        //FlightStages flightStages
        ITrackable[] trackables = {
                new Bird(),
                new Truck(),
                new Jet(),
        };

        for(ITrackable trackable :trackables){
            trackable.track();

            goNext();
        }
    }

    private static void goSatellite(){

        //Satellite implements IOrbitEarth which implements IFlightEnabled
        Satellite satellite = new Satellite();
        satellite.achieveOrbit();
        satellite.takeOff();
        satellite.fly();
        satellite.land();

        IOrbitEarth orbitEarth = satellite;
        //orbitEarth and satellite pointing to the same object (copy)
        System.out.println(satellite == orbitEarth);
        orbitEarth.achieveOrbit();
        //downcasting gives access to the Satellite object.
        ((Satellite) orbitEarth).land();
        goNext();

    }

    private static void goBird(){

        //Bird extends Animal implements FlightEnabled, Trackable

        Bird bird = new Bird();
        Animal animal = bird;

        //downcasting animal
        ((Bird)animal).track();

        IFlightEnabled  flier = bird; //flier has access to the 3 methods of FlightEnabled.

        ITrackable tracked = bird;//only access to track() method from Trackable type (interface)

        goNext();

    }
}