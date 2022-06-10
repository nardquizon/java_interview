package ph.nard.principles.one;

/**
 * Do you something we can improve here?
 **/
public class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String replaceWordInText(String word) {
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    void printTextToConsole() {
        System.out.println("Contents:\n" + text);
    }
}
