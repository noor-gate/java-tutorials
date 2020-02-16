public class Main {
    public static void main(String[] args) {
        Artist stromae = new Artist("Stromae", Genre.POP);
        stromae.addRecord("Papaoutai", Genre.ROCK);
        stromae.addRecord("tous les mêmes");
        stromae.addRecord("carmen");
        stromae.showCatalogue();
        stromae.showGenre(Genre.ROCK);
    }
}
