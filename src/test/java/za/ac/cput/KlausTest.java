/**
 * Klaus Traubner
 * 218009496
 * 1 April 2021
 */
package za.ac.cput;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import static java.time.Duration.ofSeconds;

public class KlausTest {
    public KlausTest(){
    }

    @BeforeClass
    public static void setUpClass() throws Exception{

        Assertions.assertEquals(Klaus.name[0], "John");
        Assertions.assertEquals(Klaus.name[1], "Ernest");

        Assertions.assertSame(Klaus.name[1], Klaus.name[2]);
        Assertions.assertSame(Klaus.name[3], Klaus.name[4]);

    }

    @AfterClass
    public static void tearDownClass() throws Exception{

    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test

    public void hello(){

        System.out.println("Testing Object");

    }

    @Test

    public void TimeoutTest() {

        Assertions.assertTimeout(ofSeconds(5), () ->{
            System.out.println("Timeout test has failed.");
        });
    }
}


