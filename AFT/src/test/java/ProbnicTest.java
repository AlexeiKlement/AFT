import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProbnicTest {
    public String trialCode(int number) {
        if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "M";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "EMC";
        } else return "FAIL";
    }

    @Test
    public void tmcTest() {
        String expectedResult = trialCode(10);
        assertEquals(expectedResult, "");
    }
}





