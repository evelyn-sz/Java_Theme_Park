package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor shortKid;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
        shortKid =      new Visitor(11, 140, 10);

    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(5, park.defaultPrice(), 0.0);
    }

    @Test
    public void chargesVisitor(){
        assertEquals(5, park.priceFor(shortKid), 0.0);
    }

}
