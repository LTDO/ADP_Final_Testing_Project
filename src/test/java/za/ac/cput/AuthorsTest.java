/**
 * AuthorsTest.java
 * This is a test class for Authors object
 * @author Lunga Tshila
 * Date: Tuesday, 30 March 2021
 *
 */

package za.ac.cput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorsTest {

    public String message = "lunga tshila";
    Authors junitMessage = new Authors(message, "lunga");
    Authors fail;

    //Object Identity
    //Object Equality
    @Test
    public void testBookIdentity(){
        Authors book = new Authors("The Art of Hustling", "Dj SBU");
        Authors book2 = new Authors("The Art of Trading", "Dr Ref Wayne");
        Authors book3 = new Authors("Crime and Punishment", "Dr Nietche Djoviesky");
        Authors book4 = book3;

        assertEquals(book.equals(book2), false);
        assertEquals(book2.equals(book3), false);
        assertEquals(book3.equals(book4), true);
    }

    @Test
    public void testBookIdentityUsingHashcode(){
        Authors book = new Authors("The Art of Hustling", "Dj SBU");
        Authors book2 = new Authors("The Art of Trading", "Dr Ref Wayne");
        Authors book3 = new Authors("Crime and Punishment", "Dr Nietche Djoviesky");
        Authors book4 = book3;

        assertEquals(book.hashCode(), -1117918411);
        assertEquals(book2.hashCode(), -178128203);

        //book4 and book3 point to the same object therefore their hashcode is identical
        assertEquals(book3.hashCode(), -668276722);
        assertEquals(book4.hashCode(), -668276722);
    }

    //Failing Test
    @Test
    public void failingTest() {
        if(fail == null){
            Assertions.fail("fail is null");
        }
        try {
            fail.method(-1);
            Assertions.fail("Should of thrown an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }


    //Disabling test using @Disabled annotation
    @Disabled("Do ")
    @Test
    public void testJUnitMessage() {
        assertEquals(message, junitMessage.printTitle());
    }

    @Test
    public void testJUnitHiMessage() {
        message="The author is " +message;
        assertEquals(message, junitMessage.printTitleFor());
    }
}
