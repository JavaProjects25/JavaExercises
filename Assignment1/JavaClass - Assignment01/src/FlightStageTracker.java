class FlightStageTracker {

    private FlightStage stage;
    FlightStageTracker(FlightStage stage){
        this.stage = stage;
    }

    public void track(){
        if(stage != FlightStage.GROUNDED){
            System.out.println("Monitoring " + stage);
        }
    }
}
