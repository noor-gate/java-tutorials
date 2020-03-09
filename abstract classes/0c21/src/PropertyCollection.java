import java.util.HashSet;
import java.util.Set;

public class PropertyCollection {

    Set<Property> collection;

    public PropertyCollection() {
        this.collection = new HashSet<>();
    }

    // Add a property to the collection
    public void addProperty(Property p) {
        collection.add(p);
    }

    // Return the set of all houses in the collection
    public Set<House> getHouses() {
        Set<House> houses = new HashSet<>();
        for (Property p : collection) {
            if (p instanceof House) {
                houses.add((House) p);
            }
        }
        return houses;
    }

    // Return the set of all bungalows in the collection
    public Set<Bungalow> getBungalows() {
        Set<Bungalow> bungalows = new HashSet<>();
        for (Property p : collection) {
            if (p instanceof Bungalow) {
                bungalows.add((Bungalow) p);
            }
        }
        return bungalows;
    }

    // Return the set of all flats in the collection
    public Set<Flat> getFlats() {
        Set<Flat> flats = new HashSet<>();
        for (Property p : collection) {
            if (p instanceof Flat) {
                flats.add((Flat) p);
            }
        }
        return flats;
    }

    // Return the set of all maisonettes in the collection
    public Set<Maisonette> getMaisonettes() {
        Set<Maisonette> maisonettes = new HashSet<>();
        for (Property p : collection) {
            if (p instanceof Maisonette) {
                maisonettes.add((Maisonette) p);
            }
        }
        return maisonettes;
    }

    // Return the set of all terraced houses in the collection
    public Set<TerracedHouse> getTerracedHouses() {
        Set<TerracedHouse> houses = new HashSet<>();
        for (Property p : collection) {
            if (p instanceof TerracedHouse) {
                houses.add((TerracedHouse) p);
            }
        }
        return houses;
    }

}
