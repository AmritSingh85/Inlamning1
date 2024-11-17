import java.util.ArrayList;
import java.util.List;


// Klass som räknar ord och antal tecken
public class CharacterAndWordCounter {
    private int rows = 0;
    private int chars = 0;
    private final List<String> words = new ArrayList<>();

    //räkna antal tecken vi har fått in och dela upp i ord i word arrayen
    public void countCharactersAndWords(String text) {

        ///dela upp text i ord, separerat med blanksteg med split(" ");
        String[] wordsFromRow = text.split(" ");
        for (int i = 0; i < wordsFromRow.length; i++) {
            //lägg till ord i array
            words.add(wordsFromRow[i]);
        }

        //räkna rader
        rows++;
        //räkna tecken i hela meningen med blanksteg
        chars += text.length();
    }

    public String getLongestWord(){
        //skapa en ny array
        String[] wordsArray =  words.toArray(String[]::new);
        //håll reda på längsta ord tills vi gått igenom alla ord
        String longestWord = "";
        for(int i=0; i < wordsArray.length; i++){
            //jämnför att nästa ord i array är längre än längsta ord i variabel longestWord
            if(wordsArray[i].length() > longestWord.length() ){
                //sätt ny längsta ord för om vilkoret uppfylls
                longestWord = wordsArray[i];
            }
        }
        //returnera det längsta ordet
        return longestWord;
    }

    public int getWordsSize() {
        return words.size();
    }

    public int getRows() {
        return rows;
    }

    public int getChars() {
        return chars;
    }
}
