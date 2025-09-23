class Truck implements ITrackable{
    
    @Override
    public void track(){
        System.out.println(this.getClass().getName() + " Truck is being tracked");
    }
}
