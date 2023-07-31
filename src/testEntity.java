import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class testEntity {
    Entity testEntity = new Entity("Giovanni", 25, "paperella");

    @Before
    public void beforeTest() {
        testEntity.setAge(30);
    }

    @Test
    public void test1() {
        assertEquals("Giovanni", testEntity.getName());
        assertEquals(30, testEntity.getAge());
        assertEquals(100, testEntity.getHitpoints());
        assertEquals("paperella", testEntity.gift());
    }

    @After
    public void afterTest() {
        testEntity = null;
    }

}
