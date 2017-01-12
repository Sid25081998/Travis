package dheeraj.com.trafficsolution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginRegisterChoose extends AppCompatActivity {

    Button signUpintent, singinIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        signUpintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });

        singinIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignIn.class));
            }
        });
    }

    void init() {
        setContentView(R.layout.activity_login_register_choose);
        signUpintent = (Button)findViewById(R.id.Signup);
        singinIntent = (Button)findViewById(R.id.signin);
    }
}
