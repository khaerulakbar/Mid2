package khaerul.com.herul.khaerulakbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mbtn_register, mbtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisail tombol
        mbtn_register = (Button)findViewById(R.id.btn_register);
        mbtn_login = (Button)findViewById(R.id.btn_login);

        // fungsi tombol
        mbtn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iregister = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(iregister);
            }
        });

        mbtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(ilogin);
            }
        });
    }
}
