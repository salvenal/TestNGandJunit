package vsoldatov;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class TestBase {
    @BeforeSuite
    public void setUp() throws IOException {
        File f = new File("/home/vsoldatov/ngunit");
        f.mkdir();
    }


    @AfterSuite
    public void tearDown() throws IOException {
        FileUtils.deleteDirectory(new File("/home/vsoldatov/ngunit"));
    }


}
