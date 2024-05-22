package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static saveGame.Task_2_Conservation.OpenProgress.openProgress;

class OpenProgressTest {

    @Test
    public void openProgressTest() {
        //give
        GameProgress progressActual;

        //when
        progressActual = openProgress("F:\\GamesNetology\\savegames\\save1.dat");

        //then
        Assertions.assertEquals("GameProgress{health=89, weapons=3, lvl=16, distance=156.6}",
                progressActual.toString());
    }
}