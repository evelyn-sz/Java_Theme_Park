package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor =   new Visitor(18, 201, 10);
        visitor2 =  new Visitor(18, 150, 10);
        visitor3 =  new Visitor(18, 150, 10);
        visitor4 =  new Visitor(11, 150, 10);
        visitor5 =  new Visitor(11, 140, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.50, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void chargesBasedOnHeight(){
        assertEquals(17, rollerCoaster.priceFor(visitor), 0.0);
        assertEquals(8.50, rollerCoaster.priceFor(visitor2), 0.0);
    }
}
