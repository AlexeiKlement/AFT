import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProbnicTest {
    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "EMC";
        }else if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "M";

        } else return "FAIL";
    }

    @Test
    public void tmcTest1() {
        String expectedResult = trialCode(9);
        assertEquals(expectedResult, "T");
    }

    @Test
    public void tmcTest2() {
        String expectedResult = trialCode(10);
        assertEquals(expectedResult, "M");
    }


    @Test
    public void tmcTest3() {
        String expectedResult = trialCode(15);
        assertEquals(expectedResult, "EMC");
    }

    @Test
    public void tmcTest4() {
        String expectedResult = trialCode(17);
        assertEquals(expectedResult, "FAIL");
    }
}