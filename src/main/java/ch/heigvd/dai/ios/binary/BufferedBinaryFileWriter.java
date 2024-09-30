package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.*;

/**
 * A class that writes binary files. This implementation writes the file using a buffered output
 * stream. It manages the file output stream properly with a try-with-resources block.
 */
public class BufferedBinaryFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) throws IOException {
  try (FileOutputStream fos = new FileOutputStream("./output.bin");
       BufferedOutputStream bos = new BufferedOutputStream(fos)) {
    int b = 0;
    while ((b < sizeInBytes)) {
      bos.write(b);
      ++b;
    }
    bos.flush();
    fos.flush();
    bos.close();
    fos.close();
  } catch (IOException e) {
    e.printStackTrace();
    throw e;
  }
}
}
