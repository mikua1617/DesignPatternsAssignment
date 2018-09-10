public class AutomaticCar implements Car{


    @Override
    public GearBox getGearBox() {
        AutoBox ab = new AutoBox();
        return ab;
    }
}
