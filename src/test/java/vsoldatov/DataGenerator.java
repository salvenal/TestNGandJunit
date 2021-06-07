package vsoldatov;

import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.random;

public class DataGenerator {

    @DataProvider
    public static Iterator<Object[]> name() {
        List<Object[]> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(new Object[]{"name" + random()});
        }
        return data.iterator();
    }

    @DataProvider
    public static Iterator<Object[]> loadNamesFromFile() throws IOException {
        File file = new File("./src/test/resources/namesOfFiles.txt");
        FileReader in = new FileReader(file);
        BufferedReader reader = new BufferedReader(in);
        List<Object[]> data = new ArrayList<Object[]>();
        String line = reader.readLine();
        while (line != null) {
            data.add(line.split("\n"));
            line = reader.readLine();
        }
        in.close();
        return data.iterator();
    }
}

