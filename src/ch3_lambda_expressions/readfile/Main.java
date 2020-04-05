package ch3_lambda_expressions.readfile;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String oneLine = ReadFile.readLines(BufferedReader::readLine);
        String twoLines = ReadFile.readLines((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println("Uma linha: " + oneLine);
        System.out.println("Duas linhas: " + twoLines);
    }
}
