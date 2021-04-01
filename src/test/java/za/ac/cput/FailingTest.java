package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Siyamtanda Tonjeni - 217107958
 * Assignment one - Test FailingTest
 * */

public class FailingTest {

    @Test
    public void calculationFail(){
        Assertions.fail("Sorry the test is failing");
    }

}
