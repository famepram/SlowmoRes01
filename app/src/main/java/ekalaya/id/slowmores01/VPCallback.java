package ekalaya.id.slowmores01;

/**
 * Created by Femmy on 9/24/2017.
 */

public interface VPCallback {

    void unknownError(String e);

    void ffmpegNotSupported();

    void ffmpegSuccessLoaded();

    void ffmpegAlreadyRunning();

    void onExecfailure(String s);

    void onExecSuccess(String s);

    void onExecRunning(int percent, String msg);

    void onExecFinished();

    void onExecStart();
}
