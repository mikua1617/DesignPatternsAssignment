public class ManualCar implements Car{


    @Override
    public GearBox getGearBox() {
        ManualBox mb = new ManualBox();
        return mb;
    }
}
