public class Dictionary extends Book {

    private String sourceLanguage;
    private String targetLanguage;
    private int numDefinitions;

    public Dictionary(String isbn, String title, int pages, String sourceLanguage, String targetLanguage, int numDefinitions) {
        super(isbn, title, pages);
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.numDefinitions = numDefinitions;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + sourceLanguage + "-" + targetLanguage + ", " + numDefinitions + " definitions";
    }
}
