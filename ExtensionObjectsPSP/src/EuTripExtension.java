public class EuTripExtension implements TripExtension{

    @Override
    public String getDescription() {
        return " in EU";
    }

    @Override
    public Double getFullCost() {
        return 5.0;
    }
}
