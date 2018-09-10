public class CarGarageFacade {

    public AutoBox getAutoBox(){


        AutomaticCar car = new AutomaticCar();
        AutoBox cargearbox = (AutoBox) car.getGearBox();
        return cargearbox;


    }

    public ManualBox getManualBox(){

        ManualCar car = new ManualCar();
        ManualBox cargearbox = (ManualBox) car.getGearBox();
        return cargearbox;

    }

    public CVTBox getVariatorbox(){

        VariableTransmissionCar car = new VariableTransmissionCar();
        CVTBox cargearbox = (CVTBox) car.getGearBox();
        return cargearbox;

    }
}
