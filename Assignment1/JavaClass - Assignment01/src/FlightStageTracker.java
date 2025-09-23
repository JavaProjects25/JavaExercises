class FlightStageTracker implements ITrackable {

    private FlightStage stage;
    FlightStageTracker(FlightStage stage){
        this.stage = stage;
    }

    @Override
    public void track(){
        if(stage != FlightStage.GROUNDED){
            System.out.println("Monitoring " + stage);
        }
    }
}
