import java.util.Scanner;

public class TextInputProcessor {
    private final CharacterAndWordCounter collector;

    public TextInputProcessor(CharacterAndWordCounter collector) {
        this.collector = collector;
    }

    public void processText() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv in text och skriv in STOP när du är klar:");
            String text = scan.nextLine();

            //kolla endast om raden innehåller STOP
            // Då användaren kanske skriver stop i en mening
            if (text.equalsIgnoreCase("STOP")) {
                break;
            }

            collector.countCharactersAndWords(text);
            System.out.println("Du skrev: " + text);
        }
        scan.close();
    }

    public void printTextInputData() {
        System.out.println("Antal rader: " + collector.getRows());
        System.out.println("Antal tecken: " + collector.getChars());
        System.out.println("Antal ord: " + collector.getWordsSize());
        System.out.println("Längsta ordet var: " + collector.getLongestWord());
    }


}

