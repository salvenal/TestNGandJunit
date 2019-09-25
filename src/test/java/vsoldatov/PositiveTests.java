package vsoldatov;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;


public class PositiveTests extends TestBase {

    @Test(groups = "positive")
    public void test1() throws IOException {
        File f = new File("/home/vsoldatov/ngunit/test.txt");
        Assert.assertTrue(f.createNewFile());
    }

    @Test(groups = "positive")
    public void test2() throws IOException {
        File f = new File("/home/vsoldatov/ngunit/test.asm");
        Assert.assertTrue(f.createNewFile());
    }

    @Test(groups = "positive")
    public void test3() throws IOException {
        File f = new File("/home/vsoldatov/ngunit/test.js");
        Assert.assertTrue(f.createNewFile());
    }


}
