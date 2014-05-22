package net.compactsys.androlib.io;

import android.os.Environment;

import java.io.File;

public class SDCard {

    public static boolean isAvailable() {
        String state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            // We can read and write the media
            return true;
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            // We can only read the media
            return true;
        } else {
            // Something else is wrong. It may be one of many other states, but
            // all we need
            // to know is we can neither read nor write
            return false;
        }
    }

    public static boolean isWriteable() {

        // Check SD Storage
        String state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            // We can read and write the media
            return true;
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            // We can only read the media
            return false;
        } else {
            // Something else is wrong. It may be one of many other states, but
            // all we need
            // to know is we can neither read nor write
            return false;
        }
    }

    public static String getSDCardPath() {
        File f = Environment.getExternalStorageDirectory();
        return f.getAbsolutePath();
    }

    public static File getSDCardPath(String folder) {
        return new File(Environment.getExternalStorageDirectory(), folder);
    }
}
