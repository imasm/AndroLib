package imasm.androlib.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Filesystem {
    private static final int COPY_BUFFER_SIZE = 1024;

    public Filesystem() {
    }

    public static int copy(String sourceFileName, String destFileName) throws IOException {
        FileInputStream myInput = new FileInputStream(sourceFileName);
        FileOutputStream myOutput = new FileOutputStream(destFileName);
        int totalBytes = copy((InputStream)myInput, (OutputStream)myOutput);
        myOutput.close();
        myInput.close();
        return totalBytes;
    }

    public static int copy(File sourceFile, File destFile) throws IOException {
        FileInputStream myInput = new FileInputStream(sourceFile);
        FileOutputStream myOutput = new FileOutputStream(destFile);
        int totalBytes = copy((InputStream)myInput, (OutputStream)myOutput);
        myOutput.close();
        myInput.close();
        return totalBytes;
    }

    public static int copy(InputStream istream, OutputStream ostream) throws IOException {
        byte[] buffer = new byte[COPY_BUFFER_SIZE];

        int length;
        int totalBytes;
        for(totalBytes = 0; (length = istream.read(buffer)) > 0; totalBytes += length) {
            ostream.write(buffer, 0, length);
        }

        ostream.flush();
        return totalBytes;
    }

    public static File[] getFiles(File directory, final String fileRegExpFilter) {
        FileFilter filter = new FileFilter() {
            public boolean accept(File file) {
                return file.isFile() && file.getName().matches(fileRegExpFilter);
            }
        };
        return directory != null && directory.exists()?directory.listFiles(filter):null;
    }
}
