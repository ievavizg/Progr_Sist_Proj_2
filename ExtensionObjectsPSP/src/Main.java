public class Main {

    public static void main(String[] args) {

        SimpleTrip simpleTrip = new SimpleTrip();
        simpleTrip.addExtension("BusTripExtension", new BusTripExtension());
        System.out.println(simpleTrip.tripExtensionMap);
        System.out.println(((BusTripExtension)simpleTrip.getExtension("BusTripExtension")).getAdvise());

        System.out.println("Description: " + simpleTrip.getDescription());

        System.out.println("Cost: " + simpleTrip.getFullCost());

        simpleTrip.addExtension("EuTripExtension", new EuTripExtension());
        System.out.println(simpleTrip.tripExtensionMap);
        System.out.println("Description: " + simpleTrip.getDescription());

        System.out.println("Cost: " + simpleTrip.getFullCost());


        simpleTrip.removeExtension("BusTripExtension");

        System.out.println(simpleTrip.tripExtensionMap);
    }
}
