package batai.com.autolayout;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by Window 7 on 2017/3/24.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AutoLayoutConifg.getInstance().useDeviceSize();

    }
}
