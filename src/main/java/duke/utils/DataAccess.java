package duke.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataAccess {
    String filePath;


    public DataAccess(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(String text) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, false));
            emptyFile();
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filePath);
        }
    }

    public void emptyFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, false));
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
