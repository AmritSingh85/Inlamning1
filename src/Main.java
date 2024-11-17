public class Main {
    public static void main(String[] args) {
        //initierar objekt för logik och text bearbetning
        CharacterAndWordCounter counter = new CharacterAndWordCounter();
        TextInputProcessor textProcessor = new TextInputProcessor(counter);

        //kör funktion process text, och sedan skriv ut resultatet efter STOP har identifierats
        textProcessor.processText();
        textProcessor.printTextInputData();
    }
}
