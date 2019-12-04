package khaerul.com.herul.khaerulakbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private Button mRegister, mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegister = (Button)findViewById(R.id.btn_register);
        mBack = (Button)findViewById(R.id.btn_back);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ihome = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(ihome);
            }
        });

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iback =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iback);
                finish();
            }
        });
    }
}
