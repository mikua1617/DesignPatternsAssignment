public class VariableTransmissionCar implements Car{

    @Override
    public GearBox getGearBox() {
        CVTBox cb = new CVTBox();
        return cb;
    }
}
