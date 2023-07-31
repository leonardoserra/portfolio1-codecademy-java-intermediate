import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {
    Human leonardo;
    Human filiberto;
    Alien xxTyso;
    Alien bolpersz;

    @Before
    public void beforeTest() {
        leonardo = new Human("Leonardo", 31, "Electric Guitar", "Music");
        filiberto = new Human("Filiberto", 12, "Banana", "Drawing");
        xxTyso = new Alien("XxTyso", 5748, "Spherical Blorper", "Grildox");
        bolpersz = new Alien("Bolpersz", 22332233, "Kaos Drill", "BirKH Hantiq");
        filiberto.attack(leonardo);
        filiberto.attack(xxTyso);
        xxTyso.attack(filiberto);
        bolpersz.giveGift(leonardo);

    }

    @Test
    public void humanTest1() {
        assertEquals("This is the phrase of Object Human Leonardo", "Hello my name is Leonardo. I'm 31 years old!",
                leonardo.talk(filiberto));
        assertEquals("Leonardo hitpoints", 75, leonardo.getHitpoints());
        assertEquals("XxTyso hitpoints", 75, xxTyso.getHitpoints());
        assertEquals("Filiberto hitpoints", 70, filiberto.getHitpoints());
        assertEquals("leonardo gift after swap", "Kaos Drill", leonardo.getGift());
    }

    @After
    public void afterTest() {
        leonardo.hitpoints = 100;
    }
}
