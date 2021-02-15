package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tallAdult;
    Visitor mediumAdult;
    Visitor mediumTeen;
    Visitor mediumKid;
    Visitor shortKid;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tallAdult =     new Visitor(18, 201, 10);
        mediumAdult =   new Visitor(18, 150, 10);
        mediumTeen =    new Visitor(14, 150, 10);
        mediumKid =     new Visitor(11, 150, 10);
        shortKid =      new Visitor(11, 140, 10);
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
        assertEquals(17, rollerCoaster.priceFor(tallAdult), 0.0);
        assertEquals(8.50, rollerCoaster.priceFor(mediumAdult), 0.0);
    }

    @Test
    public void checksHeightAndAge(){
        assertEquals(true, rollerCoaster.isAllowedTo(mediumTeen));
        assertEquals(false, rollerCoaster.isAllowedTo(mediumKid));
        assertEquals(false, rollerCoaster.isAllowedTo(shortKid));
    }
}
