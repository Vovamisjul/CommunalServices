import Entities.House;

import java.util.ArrayList;
import java.util.List;

public class CommunalServices {
    private List<House> servicedHouses = new ArrayList<>();

    public CommunalServices() {
    }

    public void addHouse(House house) {
        servicedHouses.add(house);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var house: servicedHouses
             ) {
            result.append(house).append("\n");
        }
        return result.substring(0, result.length() - "\n".length());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var service = (CommunalServices)obj;
        return service.servicedHouses.equals(servicedHouses);
    }
}
