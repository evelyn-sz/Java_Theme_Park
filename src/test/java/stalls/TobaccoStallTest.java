package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor mediumAdult;
    Visitor mediumTeen;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 2, "Jack Jarvis", ParkingSpot.B1);
        mediumAdult =   new Visitor(18, 150, 10);
        mediumTeen =    new Visitor(14, 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void checkAge(){
        assertEquals(true, tobaccoStall.isAllowedTo(mediumAdult));
        assertEquals(false, tobaccoStall.isAllowedTo(mediumTeen));
    }
}
