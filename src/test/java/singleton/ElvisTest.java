package singleton;

import org.junit.Test;

import static org.junit.Assert.*;


public class ElvisTest {

    @Test
    public void iWasTheOne() {
        Elvis one = Elvis.instance();
        Elvis two = Elvis.instance();
        assertNotNull(one);
        assertNotNull(two);
        assertEquals(one, two);
        assertSame(one, two);
    }

    @Test
    public void doubleTrouble() throws Exception {
        Elvis one = Elvis.class.getDeclaredConstructor().newInstance();
        Elvis two = Elvis.class.getDeclaredConstructor().newInstance();
        assertNotNull(one);
        assertNotNull(two);
        assertNotSame("Elvis can be impersonated", one, two);
    }

    @Test
    public void itsDifferentNow() throws Exception {
        Elvis one = Elvis.class.getDeclaredConstructor().newInstance();
        Elvis two = Elvis.class.getDeclaredConstructor().newInstance();
        assertNotEquals("Elvis impersonators are not the same as the real deal", one, two);
    }
}
