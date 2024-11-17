import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class UnitTest {
    private CharacterAndWordCounter counter;

    @Test
    public void TestInitialCounts() {
        counter = new CharacterAndWordCounter();

        assertEquals("Första raden bör räknas som 0", 0, counter.getRows());
        assertEquals("Första bokstaven bör räknas som 0", 0, counter.getChars());
    }

    @Test
    public void TestCharacterAndWordCounter() {
        counter = new CharacterAndWordCounter();

        String testString = "test";
        counter.countCharactersAndWords(testString);
        counter.countCharactersAndWords(testString);

        assertEquals("Antalet rader bör öka med 1 vid varje update", 2, counter.getRows());
        assertEquals("Antalet bokstäver bör matcha längden av strängen vid varje update", testString.length()*2, counter.getChars());
    }

    @Test
    public void TestLongestWord() {
        counter = new CharacterAndWordCounter();

        String testString = "test";
        counter.countCharactersAndWords(testString);
        counter.countCharactersAndWords(testString);
        Assert.assertEquals( counter.getLongestWord().length(),4);
    }
        @Test
    public void TestMultipleUpdates() {
        counter = new CharacterAndWordCounter();

            String test1 ="test1";
            String test2 ="test2";
            String test3 ="test3";

            counter.countCharactersAndWords(test1);
            counter.countCharactersAndWords(test2);
            counter.countCharactersAndWords(test3);

        String testStrings = test1+test2+test3;

        assertEquals("Antalet rader bör motsvara antalet uppdateringar", 3, counter.getRows());
        assertEquals(" Antalet bokstäver borde vara suman av test strängarnas längd", testStrings.length(), counter.getChars());
    }
}
