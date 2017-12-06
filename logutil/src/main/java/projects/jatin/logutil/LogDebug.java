package projects.jatin.logutil;

import android.util.Log;

/**
 * Created by Jateen on 06-12-2017.
 */

public class LogDebug {

    private static final String TAG="SUPER_AWESOME_APP";
    public static void d(String message)
    {
        Log.d(TAG,message);

    }
}
