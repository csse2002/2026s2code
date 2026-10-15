import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class IntSetTest {

    @Test
    public void emptySet() {
        IntSet set = new IntSet();
        assertFalse(set.contains(5));
    }
}
