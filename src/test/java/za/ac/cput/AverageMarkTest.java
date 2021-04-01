package za.ac.cput;

import org.junit.jupiter.api.*;


import java.nio.channels.InterruptedByTimeoutException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AverageMarksTest {
    private AverageMark aver_1;
    private AverageMark aver_2;
    private AverageMark aver_3;
    private AverageMark aver_4;

    @BeforeEach
    void setUp() {
        System.out.println("Setup Test");
        aver_1 = aver_2;
        aver_3 = new AverageMark();
        aver_4= aver_3;

    }


    @DisplayName("testing message() ")
    @Test
    void MessageTest(){
        assertEquals("The Average Mark for Student", AverageMark.Message());
    }

    // object identity
    @DisplayName("testing object identity")
    @Test
    void objectIdentity(){
        assertSame(aver_4, aver_3);
    }

    //failing test
    @DisplayName("testing failing")
    @Test
    void testAverage() {
        fail("failing the average method");
        assertNotEquals(9, 10);
    }
    //timeout
    @DisplayName("testing timeout")
    @Test
    void timeOutTest(){
        assertTimeout(Duration.ofMillis(20), ()-> getMill(19));

    }
    void getMill(int milliSeconds){
        try{
            TimeUnit.MILLISECONDS.sleep(milliSeconds);
        }catch (InterruptedException e){
            System.out.println("time is Up");
        }
    }

    // disabling


    @Disabled
    @Test
    void testDisabling() {
        System.setProperty("java.runtime.version", "Java Runtime 11");
        Assumptions.assumeTrue("java.runtime.version".equals(System.getProperty("Java Runtime 11")));
    }


    @AfterEach
    void tearDown() {
        System.out.println("teardown");
    }


}