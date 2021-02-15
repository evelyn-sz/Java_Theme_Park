package themePark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    @Before
    public void setUp(){
        themePark = new ThemePark("Disneyland", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Disneyland", themePark.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, themePark.getRating());
    }
}
