import java.util.*;

public class WordBank {
    private static final List<WordEntry> words = new ArrayList<>();

   
    static {
    words.add(new WordEntry("chef", "Profession"));
    words.add(new WordEntry("nurse", "Profession"));
    words.add(new WordEntry("piano", "A musical instrument"));
    words.add(new WordEntry("ghost", "Spooky thing"));
    words.add(new WordEntry("robot", "Machine with a brain"));
    words.add(new WordEntry("cloud", "Sky floater or online storage"));
    words.add(new WordEntry("jelly", "Wobbly dessert"));
    words.add(new WordEntry("camel", "Desert traveler"));
    words.add(new WordEntry("mango", "King of fruits"));
    words.add(new WordEntry("lemon", "Yellow in color, 5-letter fruit name"));
}


    public static WordEntry getRandomWord() {
        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
}
