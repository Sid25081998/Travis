package dheeraj.com.trafficsolution;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import dheeraj.com.trafficsolution.Utils.SharedPreferenceMethods;

public class SplashActivity extends Activity {

    TextView tv_travis, tv_travis_fullform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        runTimer();
    }

    void runTimer() {
        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {}

            public void onFinish() {

                String is_logged_in = SharedPreferenceMethods.getString(getApplicationContext(), SharedPreferenceMethods.IS_LOGGED_IN);

                if (is_logged_in.equals("yes")){
                    startActivity(new Intent(getApplicationContext(), FeedsActivity.class));
                    finish();
                }
                else {
                    startActivity(new Intent(SplashActivity.this, LoginRegisterChoose.class));
                    finish();
                }
            }
        }.start();
    }

    void init() {
        setContentView(R.layout.activity_splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tv_travis = (TextView)findViewById(R.id.tv_splash_travis);
        tv_travis_fullform = (TextView)findViewById(R.id.tv_splash_travis_full_form);

        Typeface MontReg = Typeface.createFromAsset(getApplication().getAssets(), "Montserrat-Regular.otf");
        Typeface MontBold = Typeface.createFromAsset(getApplication().getAssets(), "Montserrat-Bold.otf");
        //Typeface MontHair = Typeface.createFromAsset(getApplication().getAssets(), "Montserrat-Hairline.otf");

        tv_travis.setTypeface(MontBold);
        tv_travis_fullform.setTypeface(MontReg);
    }
}