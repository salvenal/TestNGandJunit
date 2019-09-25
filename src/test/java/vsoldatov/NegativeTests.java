package vsoldatov;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class NegativeTests extends TestBase {

    @Test(groups = "negative")
    public void test4() throws IOException {
        File f = new File("/home/vsoldatov/ngunit/test.txt");
        f.createNewFile();
        Assert.assertFalse(f.createNewFile());
    }

    @Test(groups = "negative")
    public void test5() throws IOException {
        File f = new File("/home/vsoldatov/ngunit/test.asm");
        f.createNewFile();
        Assert.assertFalse(f.createNewFile());
    }
}

