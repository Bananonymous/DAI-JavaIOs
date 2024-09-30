package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {
  @Override
  public void read(String filename) throws IOException {
    try (FileInputStream fis = new FileInputStream(filename)) {
      int b;
      while ((b = fis.read()) != -1) {
        System.out.print(b + "\n");
      }
      fis.close();
    } catch (IOException e) {
      e.printStackTrace();
      throw e;
    }
  }
}
