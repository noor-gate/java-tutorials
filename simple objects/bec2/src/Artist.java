import java.util.ArrayList;
import java.util.List;

public class Artist {

    private String name;
    private List<Record> catalogue = new ArrayList<>();
    private Genre mainGenre;

    public Artist(String name, Genre mainGenre) {
        this.name = name;
        this.mainGenre = mainGenre;
    }

    public void addRecord(String name) {
        catalogue.add(new Record(name, mainGenre));
    }

    public void addRecord(String name, Genre genre) {
        catalogue.add(new Record(name, genre));
    }

    public void showCatalogue() {
        for (Record r : catalogue) {
            System.out.println(r.getTitle() + " (" + r.getGenre() + ")");
        }
    }

    public void showGenre(Genre genre) {
        for (Record r : catalogue) {
            if (r.getGenre().equals(genre)) {
                System.out.println(r.getTitle() + " (" + r.getGenre() + ")");
            }
        }
    }

}
