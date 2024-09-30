package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * A class that reads binary files. This implementation reads the file using a buffered input
 * stream. It manages the input stream and the buffered input stream properly with a
 * try-with-resources block.
 */
public class BufferedBinaryFileReader implements Readable {

  @Override
public void read(String filename) throws IOException {
  try (FileInputStream fis = new FileInputStream(filename);
       BufferedInputStream bis = new BufferedInputStream(fis)) {
    int b;
    while ((b = bis.read()) != -1) {
      System.out.print(b + "\n");
    }
    fis.close();
    bis.close();
  } catch (IOException e) {
    e.printStackTrace();
    throw e;
  }
}
}
