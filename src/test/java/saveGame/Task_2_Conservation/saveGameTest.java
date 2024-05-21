package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static saveGame.Task_2_Conservation.SaveGame.saveGame;

public class saveGameTest {

    @Test
    public void GameProgress_GameProgressTest_success() {
        // given:
        final GameProgress progress = new GameProgress(99, 3, 156, 8);
        final String pathSave = "F:\\GamesNetology\\savegames\\save1.dat";
        final SaveGame expected = saveGame(pathSave, progress);
        // when:
        final SaveGame save = saveGame(pathSave, progress);
        then:
        Assertions.assertEquals(save.toString(), expected.toString());
        ;
    }

    @Test
    public void GameProgressTest_nullArgument_throwsException() {

        // given:
        final GameProgress progress = null;
        final String pathSave = "F:\\GamesNetology\\savegames\\save1.dat";
        final SaveGame expected = saveGame(pathSave, progress);

        // then:
        Assertions.assertNull(expected.getProgress(), expected.getPathSave());
    }
}