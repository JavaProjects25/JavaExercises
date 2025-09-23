//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bird extends Animal implements IFlightEnabled, ITrackable

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
        }

        
    }

    private static void goBird() {

        //Bird extends Animal implements FlightEnabled, Trackable

    }
}