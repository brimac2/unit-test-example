import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class OccurrencesTest {
    @Test
    public void test_Occurences_Word_Character() {
       int actual = LettersCounter.occurencesCounter('a', "Brigita");
        Assertions.assertEquals(1, actual);
    }
}



