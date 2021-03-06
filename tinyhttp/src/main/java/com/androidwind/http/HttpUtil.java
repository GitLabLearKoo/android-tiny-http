package com.androidwind.http;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class HttpUtil {

    public static String getLogDir(Context context) {
        String logDir;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            logDir = Environment.getExternalStorageDirectory().getPath();
        } else {
            logDir = context.getCacheDir().getPath();
        }
        return logDir + File.separator + "Http";
    }
}
