package khaerul.com.herul.khaerulakbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button nLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nLog = (Button) findViewById(R.id.btn_logout);

        nLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLog = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iLog);
                finish();
            }
        });
    }
}
