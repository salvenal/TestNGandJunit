package vsoldatov;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.random;

public class ParametrizedTests {


    @DataProvider
    public static Iterator<Object[]> name() {
        String am = "name";
        List<Object[]> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(new Object[]{String.valueOf(random())});
        }
        return data.iterator();
    }
}
