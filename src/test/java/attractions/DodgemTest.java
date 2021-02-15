package attractions;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
public class DodgemTest {

    Dodgems dodgems;
    Visitor mediumTeen;
    Visitor mediumKid;


    @Before
    public void setUp() throws Exception {
        dodgems =   new Dodgems("Bumper Cars", 5);
        mediumTeen =    new Visitor(14, 150, 10);
        mediumKid =     new Visitor(11, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void chargesBasedOnAge(){
        assertEquals(4.50, dodgems.priceFor(mediumTeen), 0.0);
        assertEquals(2.25, dodgems.priceFor(mediumKid), 0.0);
    }
}
