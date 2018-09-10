public class Main {

    public static void main(String[] args) {

        CarGarageFacade gearboxGarage = new CarGarageFacade();

        ManualBox M1 = gearboxGarage.getManualBox();
        System.out.println("The Manual gearbox has "+M1.no_of_gears+" gears and uses a "+M1.clutch+" clutch");
        AutoBox A1 = gearboxGarage.getAutoBox();
        System.out.println("The Automatic gearbox has "+A1.no_of_gears+" gears and uses a "+A1.clutch+" clutch");
        CVTBox C1 = gearboxGarage.getVariatorbox();
        System.out.println("The Continuously variable gearbox has "+C1.no_of_gears+" gears and uses a "+C1.clutch+" clutch");
    }

}
