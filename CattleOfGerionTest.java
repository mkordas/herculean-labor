import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* Declaration access can be weaker */
public class CattleOfGerionTest {

    private final boolean isCaught = false;

    @Test
    public void ox1() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox2() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox3() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox4() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox5() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox6() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox7() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox8() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox9() {
        assertEquals(true, isCaught);
    }

    @Test
    public void ox10() {
        assertEquals(true, isCaught);
    }
}