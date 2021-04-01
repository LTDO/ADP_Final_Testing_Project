package za.ac.cput;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Siyamtanda Tonjeni - 217107958
 * Assignment one - Test Timeout
 * */

public class TimeoutTest {


    @Test
    public void calculationTimeout() throws Exception{
        TimeUnit.SECONDS.sleep( 5);
        System.out.println("SLEEP");
    }

}
