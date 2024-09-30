package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        try (Writer writer = new FileWriter("./output.txt", StandardCharsets.UTF_8)) {
            int c = 0;
            while (c < sizeInBytes) {
                writer.write(c);
                ++c;
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
