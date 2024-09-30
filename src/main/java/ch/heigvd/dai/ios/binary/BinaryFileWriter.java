package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Writable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A class that writes binary files. This implementation writes the file byte per byte. It manages
 * the file output stream properly with a try-catch-finally block.
 */
public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("./output.bin");
            fis = new FileInputStream(filename);
            int b = 0;
            while ((b < sizeInBytes)) {
                fos.write(b);
                ++b;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
