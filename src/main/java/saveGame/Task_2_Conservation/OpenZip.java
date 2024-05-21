package saveGame.Task_2_Conservation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class OpenZip {
    public static void openZip(String pathZip, String pathDirectory) {
        try (ZipInputStream saveZip = new ZipInputStream(new FileInputStream(pathZip))) {
            ZipEntry entry;
            String name;
            while ((entry = saveZip.getNextEntry()) != null) {
                name = pathDirectory + "\\" + entry.getName();

                FileOutputStream save = new FileOutputStream(name);

                for (int i = saveZip.read(); i != -1; i = saveZip.read()) {
                    save.write(i);
                }
                save.flush();
                saveZip.closeEntry();
                save.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
