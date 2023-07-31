
// import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class EntityTests {
    Entity EntityTests;

    @Before
    public void beforeTest() {
        EntityTests = new Entity("Giovanni", 25, "paperella");
        EntityTests.setAge(30);
    }

    @Test
    public void test1() {
        assertEquals("Giovanni", EntityTests.getName());
        assertEquals(30, EntityTests.getAge());
        assertEquals(100, EntityTests.getHitpoints());
        assertEquals("paperella", EntityTests.gift());
    }

    @After
    public void afterTest() {
        EntityTests = null;
    }

}
