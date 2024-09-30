package ch.heigvd.dai.ios;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Readable {
  void read(String filename) throws IOException;
}
