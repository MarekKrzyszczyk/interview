package interview.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public String readFile(Path path) throws IOException {

        BufferedReader reader = Files.newBufferedReader(path);

        StringBuilder text = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            text.append(line);
        }

        return text.toString();
    }

}
