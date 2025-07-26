public class WordEntry {
     private String word;
    private String clue;

    public WordEntry(String word, String clue) {
        this.word = word.toLowerCase();
        this.clue = clue;
    }

    public String getWord() {
        return word;
    }

    public String getClue() {
        return clue;
    }
}
