package batai.com.autolayout;

import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends BaseActivity{
    private long exitTime=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(System.currentTimeMillis()-exitTime>2000){

            exitTime=System.currentTimeMillis();

            System.exit(0);
            finish();

        }


        return false;
    }
}
