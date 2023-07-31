import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlienTest {
    Alien xxTyso;
    Alien bolpersz;

    @Before
    public void beforeTest() {
        xxTyso = new Alien("XxTyso", 5748, "Spherical Blorper", "Grildox");
        bolpersz = new Alien("Bolpersz", 22332233, "Kaos Drill", "BirKH Hantiq");
        bolpersz.attack(xxTyso);
        xxTyso.swapRace(bolpersz);
    }

    @Test
    public void AlienTest1() {
        assertEquals("This is the phrase of Object Alien xxTyso", "SLiii XxTyso. IHol ````~~~```` 5748 kapol!",
                xxTyso.talk());
        assertEquals("xxTyso hitpoints", 70, xxTyso.getHitpoints());
        assertEquals("xxTyso new race", "BirKH Hantiq", xxTyso.getRace());
    }

    @After
    public void afterTest() {
        xxTyso.hitpoints = 100;
    }
}
