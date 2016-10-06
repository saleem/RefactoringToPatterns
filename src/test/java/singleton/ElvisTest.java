package singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class ElvisTest {

    @Test
    public void iWasTheOne() {
        Elvis one = Elvis.instance();
        Elvis two = Elvis.instance();
        assertSame(one, two);
        assertEquals(one, two);
    }
}
