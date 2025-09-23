class Truck implements ITrackable{

    @Override
    public void track(){
        System.out.println(getClass().getName() + "'s coordinates recorded");
    }
}
