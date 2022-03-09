
public class LettersCounter {

    public static int occurencesCounter(char searchChar, String wordLetter) {

//        char searchChar = 'a';
//        String wordLetter = "Brigita";/
        int count = 0;

        for (int i = 0; i < wordLetter.length(); i++) {
            if (wordLetter.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }
}
