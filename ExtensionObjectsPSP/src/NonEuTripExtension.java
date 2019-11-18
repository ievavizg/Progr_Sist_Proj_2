public class NonEuTripExtension implements TripExtension{

    @Override
    public String getDescription() {
        return "not in EU";
    }

    @Override
    public Double getFullCost() {
        return 31.2;
    }
}