public class PlainTripExtension implements TripExtension{


    @Override
    public String getDescription() {
        return " with Plain";
    }

    @Override
    public Double getFullCost() {
        return 54.5;
    }
}