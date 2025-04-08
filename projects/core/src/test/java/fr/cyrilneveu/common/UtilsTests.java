package fr.cyrilneveu.common;

import fr.cyrilneveu.core.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTests {
    @Test
    public void addTrue() {
        Assertions.assertEquals(2, Utils.add(1, 1));
    }

    @Test
    public void addFalse() {
        Assertions.assertNotEquals(3, Utils.add(1, 1));
    }
}
