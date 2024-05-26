package saveGame.Task_2_Conservation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame {
    private String pathSave;
    private GameProgress progress;

    public SaveGame(String pathSave, GameProgress progress) {
        this.pathSave = pathSave;
        this.progress = progress;
    }

    public static SaveGame saveGame(String pathSave, GameProgress progress) {
        try (ObjectOutputStream saveProgress = new ObjectOutputStream(new FileOutputStream(pathSave))) {
            saveProgress.writeObject(progress);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new SaveGame(pathSave, progress);
    }

    public String getPathSave() {
        return pathSave;
    }

    public GameProgress getProgress() {
        return progress;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null && obj.getClass() != this.getClass()) {
            return false;
        }
        SaveGame quest = (SaveGame) obj;
        return pathSave == quest.pathSave && (pathSave != null && pathSave.equals(quest.getPathSave()))
                && progress == quest.progress && (progress != null && progress.equals(quest.progress));
    }

    @Override
    public int hashCode() {
        int total=88;
        int value= 3;
        total= 88*3 + (pathSave==null ? 3 : pathSave.hashCode() );
        total= 88*3 + (progress==null ? 3 : progress.hashCode() );
        return total;
    }
}
