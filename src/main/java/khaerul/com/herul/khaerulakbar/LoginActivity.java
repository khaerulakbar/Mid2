package khaerul.com.herul.khaerulakbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button nLogin, nBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nLogin = (Button) findViewById(R.id.btn_login);
        nBack = (Button) findViewById(R.id.btn_back);

        nLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(iLogin);
            }
        });

        nBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iBack);
                finish();
            }
        });


    }
}
