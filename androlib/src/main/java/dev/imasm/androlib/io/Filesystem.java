/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.imasm.androlib.io;

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

        File[] result = null;
        if (directory != null && directory.exists())
            result = directory.listFiles(filter);

        if (result == null)
            result = new File[0];

        return result;
    }
}
