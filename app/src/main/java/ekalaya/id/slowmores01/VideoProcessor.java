package ekalaya.id.slowmores01;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * Created by Femmy on 9/24/2017.
 */

public class VideoProcessor {

    String vidUri;

    Context context;

    VPCallback mVPCallback;

    File destDir  = Environment.getExternalStoragePublicDirectory("slowmore");

    public VideoProcessor(Context context, String vidUri){
        this.context    = context;
        this.vidUri     = vidUri;

        if(!destDir.isDirectory()){
            destDir.mkdir();
        }
    }

    //private VideoSource vidsource;
}
