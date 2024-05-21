package saveGame.Task1_Installation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class saveGameTest {
    @Test
    public void mkdirTest_success() {

        // given:
        final String parent = "valid path";
        final String child = "child file";
        final File original = new File(parent, child);

        // when:
        final String result = original.getPath();

        // then:
        Assertions.assertEquals(result, original.getPath());
    }

    @Test
    public void mkdirTest_NoArgument_throwsException() {

        // given:
        final String parent = "valid path";
        final String child = "child file";
        final File original = new File(parent, child);

        // when:
        final String result = "";

        // then:
        Assertions.assertThrows(Throwable.class, () -> {
            Assertions.assertEquals(original.getPath(), result);
        });
    }

}
