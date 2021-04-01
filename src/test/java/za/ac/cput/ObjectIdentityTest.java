package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Siyamtanda Tonjeni - 217107958
 * Assignment one - Test ObjectIdentity
 * */

public class ObjectIdentityTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldAnswerWithTrue(){
        double firstValue = 2;
        double secondValue = 1;
        Assertions.assertNotEquals((firstValue*secondValue), firstValue, secondValue );
    }

    @Test
    public void addition(){
        double firstValue = 2;
        double secondValue = 1;
        Assertions.assertNotEquals(0,calculator.addition(firstValue,secondValue));
    }

    @Test
    public void subtraction(){
        double firstValue = 1;
        double secondValue = 1;
        Assertions.assertSame(2, calculator.subtraction(firstValue,secondValue) );
    }
}
