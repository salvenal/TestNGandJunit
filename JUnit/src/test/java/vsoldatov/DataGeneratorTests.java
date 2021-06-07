package vsoldatov;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.AssertJUnit.*;

public class DataGeneratorTests extends TestBase {
    @Test(dataProviderClass = DataGenerator.class, dataProvider = "name")
    public void dataGeneratorTest(String name) throws IOException {
        String pathOfFiles = "/home/venom/ngunit/" + name;
        File file = new File(pathOfFiles);
        assertTrue(file.createNewFile());
    }

    @Test(dataProviderClass = DataGenerator.class, dataProvider = "loadNamesFromFile")
    public void dataGeneratorFromFileTest(String loadNamesFromFile) throws IOException {
        String pathOfFiles = "/home/venom/ngunit/" + loadNamesFromFile;
        System.out.println(loadNamesFromFile);
        File file = new File(pathOfFiles);
        assertTrue(file.createNewFile());
    }

}
