package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Siyamtanda Tonjeni - 217107958
 * Assignment one - Test ObjectEquality
 * */

public class ObjectEqualityTest {

        Calculator calculator = new Calculator();

        @Test
        public void shouldAnswerWithTrue(){
            double firstValue = 2;
            double secondValue = 1;
            Assertions.assertEquals((firstValue*secondValue), firstValue, secondValue );
        }

        @Test
        public void addition(){
            double firstValue = 2;
            double secondValue = 1;
            Assertions.assertEquals(3,calculator.addition(firstValue,secondValue));
        }

        @Test
        public void subtraction(){
            double firstValue = 2;
            double secondValue = 1;
            Assertions.assertEquals(1, calculator.subtraction(firstValue,secondValue) );
        }

    }
