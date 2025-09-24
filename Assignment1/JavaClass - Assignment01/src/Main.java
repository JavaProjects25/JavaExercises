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

        //doing downcasting with AlienShip which implements multiple interfaces
        goAlienShip();

        goReconDrone();
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
                new Truck(),
                new Bee(),
                new Dolphin(),
                new AlienShip(),
                new AutonomousBoat(),
                new Drone(),
                new Missile(),
                new ReconDrone(),
                new SelfDrivingCar(),
                new SpaceProbe(),
                new UFO(),
                new WeatherBalloon(),
        };

        for (ITrackable trackable : trackables) {
            trackable.track();

            goNext();
        }
    }

    private static void goSatellite() {

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

    private static void goBird() {

        //Bird extends Animal implements FlightEnabled, Trackable

        Bird bird = new Bird();
        Animal animal = bird;

        //downcasting animal
        ((Bird) animal).track();

        IFlightEnabled flier = bird; //flier has access to the 3 methods of FlightEnabled.

        ITrackable tracked = bird;//only access to track() method from Trackable type (interface)

        goNext();

    }

    private static void goAlienShip() {

        //Deploying alien ship utilities
        AlienShip alienShip = new AlienShip();
        alienShip.takeOff();
        alienShip.fly();
        alienShip.captureImage();
        alienShip.deployWeapon();
        alienShip.setDestination("Mars");
        alienShip.engageAutopilot();
        System.out.println("Energy type: " + alienShip.getEnergyType());

        //downcasting to ITrackable interface
        ITrackable tracker = alienShip;
        tracker.track();
        ((AlienShip) tracker).land();
        goNext();
    }

    private static void goReconDrone() {
        ReconDrone reconDrone = new ReconDrone();
        Drone drone = reconDrone;
        reconDrone.takeOff();
        reconDrone.fly();
        reconDrone.captureImage();
        reconDrone.land();

        ((ReconDrone) drone).readSensors();

        goNext();

    }
}