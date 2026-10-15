import org.junit.Test;
import static org.junit.Assert.*;

public class ContainsTest {

    @Test
    public void doesContain() {
        assertTrue(Contains.contains(new int[]{3, 6, 9}, 9));
    }

    @Test
    public void doesNotContain() {
        assertFalse(Contains.contains(new int[]{3, 6, 9}, 8));
    }

    @Test
    public void emptyArray() {
        assertFalse(Contains.contains(new int[]{}, 8));
    }
}
