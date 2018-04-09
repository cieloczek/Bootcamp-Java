package Message;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DictionaryMessage implements Message{
    private String[]  dictionaryWords;
    Random random;

    public DictionaryMessage(){
        this(new String[] {"Removes", "from", "the", "underlying",
                "collection", "the", "last" ,"element",
                "returned" ,"by" ,"this", "iterator"});
    }

    public DictionaryMessage(String[] dictionaryWords) {
        this.dictionaryWords = dictionaryWords;
        this.random= new Random();
    }

    public String printMessage(){
        return getRandomMessage();
    }
    private String getRandomMessage(){
        int index = random.nextInt(dictionaryWords.length);
        return dictionaryWords[index];
    }

    public void setDictionaryWords(String[] dictionaryWords) {
        this.dictionaryWords = dictionaryWords;
    }
}
