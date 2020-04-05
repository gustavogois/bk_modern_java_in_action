package ch3_lambda_expressions.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class ReadFile {

    private ReadFile() {
        throw new IllegalStateException("Utility class");
    }

    public static String readLines(BufferedReaderProcessor brp) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("src/ch03_lambda_expressions/readfile/data.txt"))) {
            return brp.process(br);
        }
    }
}
