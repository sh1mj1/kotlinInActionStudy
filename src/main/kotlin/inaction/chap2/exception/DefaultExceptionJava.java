package inaction.chap2.exception;

import java.io.BufferedReader;
import java.io.IOException;

public class DefaultExceptionJava {

    public static Integer readNumber(BufferedReader reader) throws IOException {
        try {
            String line = reader.readLine();
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
