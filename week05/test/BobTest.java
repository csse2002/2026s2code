import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BobTest {
    private Bob bob;

    @Before
    public void setup() {
        bob = new Bob(6);
    }

    @Test
    public void storesValue() {
        assertEquals(6, bob.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannotStoreNegative() {
        Bob bob = new Bob(-4);
    }

    @Test
    public void storesZeroInitially() {
        Bob bobZero = new Bob();
        assertEquals(0, bobZero.getValue());
    }

}
