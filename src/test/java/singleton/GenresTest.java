package singleton;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static singleton.Genres.COUNTRY;
import static singleton.Genres.METAL;


public class GenresTest {

    @Test
    public void countryPredatesMetal() {
        assertTrue("Country music predates heavy metal", COUNTRY.getStartedInDecade() < METAL.getStartedInDecade());
    }

    @Test
    public void identityTest() {
        assertSame(COUNTRY, COUNTRY);
    }

}
