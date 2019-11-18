public class BusTripExtension implements TripExtension{



    public String getAdvise(){
        return "Take snacks with you!";
    }

    @Override
    public String getDescription() {
        return " with Bus";
    }

    @Override
    public Double getFullCost() {
        return 2.5;
    }
}
