package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static saveGame.Task_2_Conservation.OpenProgress.openProgress;

class OpenProgressTest {

    @Test
    public void openProgressTest() {
        //give
        GameProgress progressPath;
        GameProgress progressExpected;

        //when
        progressPath = openProgress("F:\\GamesNetology\\savegames\\save1.dat");
        progressExpected = new GameProgress(89, 3, 16, 156.6);

        //then
        Assertions.assertEquals(progressExpected,
                progressPath);
    }

}