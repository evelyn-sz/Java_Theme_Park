package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor shortKid;
    Visitor mediumAdult;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        mediumAdult =   new Visitor(18, 150, 10);
        shortKid =      new Visitor(11, 140, 10);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(3, playground.defaultPrice(), 0.0);
    }
    @Test
    public void chargesVisitor(){
        assertEquals(3, playground.priceFor(shortKid), 0.0);
    }

    @Test
    public void wontLetOver15In(){
        assertEquals(true, playground.isAllowedTo(shortKid));
        assertEquals(false, playground.isAllowedTo(mediumAdult));
    }


}
