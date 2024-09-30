package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation writes the file using a buffered writer
 * around a file writer. It manages the writer and the buffered writer properly with a
 * try-with-resources block.
 */
public class BufferedTextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) throws IOException {
    try (Writer writer = new FileWriter("./outputBuffer.txt", StandardCharsets.UTF_8);
         BufferedWriter bw = new BufferedWriter(writer)) {

      int c = 0;
      while (c < sizeInBytes) {
        bw.write(c);
        ++c;
      }
      bw.flush();
      writer.flush();

      bw.close();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
      throw e;
    }
  }


}

