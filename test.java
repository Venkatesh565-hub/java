import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloAppTest {
    @Test
    public void testGreeting() {
        assertEquals("Hello, DevOps!", HelloApp.greet());
    }
}