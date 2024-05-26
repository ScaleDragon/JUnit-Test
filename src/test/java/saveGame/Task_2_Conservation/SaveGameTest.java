package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static saveGame.Task_2_Conservation.SaveGame.saveGame;

public class SaveGameTest {

    @Test
    public void GameProgress_GameProgressTest_success() {

        // given:
        final GameProgress progress = new GameProgress(89, 3, 16, 156.6);
        final String pathSave = "F:\\GamesNetology\\savegames\\save1.dat";

        // when:
        final SaveGame expected = saveGame(pathSave, progress);

        // then:
        Assertions.assertEquals(expected, saveGame("F:\\GamesNetology\\savegames\\save1.dat", progress));
    }

    @Test
    public void GameProgressTest_NullPointerException() {

        // given:
        final GameProgress progress = new GameProgress(99, 3, 16, 156.6);
        final String pathSave = "F:\\GamesNetology\\savegames\\save7.dat";

        // then:
        Assertions.assertThrows(NullPointerException.class, () -> {
            saveGame(null, progress);
        });
    }
}