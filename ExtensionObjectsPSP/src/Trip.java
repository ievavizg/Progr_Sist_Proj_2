import java.util.HashMap;
import java.util.Map;

public abstract class Trip {

    Map<String,TripExtension> tripExtensionMap = new HashMap<String, TripExtension>();

    public String getDescription(){
        String description = "A trip";
        for (Map.Entry<String, TripExtension> entry : tripExtensionMap.entrySet()) {
            description = description.concat((entry.getValue().getDescription()));
        }
        return description;
    }

    public Double getFullCost(){
        Double price = 0.0;
        for (Map.Entry<String, TripExtension> entry : tripExtensionMap.entrySet()) {
            price += entry.getValue().getFullCost();
        }
        return price;
    }

    public void addExtension(String extType, TripExtension tripExtension){
        tripExtensionMap.put(extType,tripExtension);
    }

    public TripExtension getExtension(String extType){
        TripExtension tExtension = tripExtensionMap.get(extType);
        return tExtension;
    }

    public void removeExtension(String extType){
        tripExtensionMap.remove(extType);
    }

}
