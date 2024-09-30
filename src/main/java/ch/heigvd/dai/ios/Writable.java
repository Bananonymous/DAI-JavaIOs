package ch.heigvd.dai.ios;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writable {
  void write(String filename, int sizeInBytes) throws IOException;
}
