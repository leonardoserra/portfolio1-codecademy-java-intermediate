import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {
    Human leonardo;
    Human filiberto;

    @Before
    public void beforeTest() {
        leonardo = new Human("Leonardo", 31, "Electric Guitar", "Music");
        filiberto = new Human("Filiberto", 12, "Banana", "Drawing");
        filiberto.attack(leonardo);
    }

    @Test
    public void humanTest1() {
        assertEquals("This is the phrase of Object Human Leonardo", "Hello my name is Leonardo. I'm 31 years old!",
                leonardo.talk());
        assertEquals("Leonardo hitpoints", 80, leonardo.getHitpoints());
    }

    @After
    public void afterTest() {
        leonardo.hitpoints = 100;
    }
}
