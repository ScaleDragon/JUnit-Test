package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    public void GameProgressTest_Object_Creation() {

        // given:
        final GameProgress progressActual;

        // when:
        progressActual = new GameProgress(99, 3, 156, 8);

        then:
        Assertions.assertEquals("GameProgress{health=99, weapons=3, lvl=156, distance=8.0}",
                progressActual.toString());
    }

    @Test
    public void GameProgressTest_isNullArgument_throwsException() {

        // given:
        final GameProgress progressActual;

        // when:
        progressActual = null;
        // then:
        Assertions.assertThrows(NullPointerException.class, () -> progressActual.getClass());
    }
}