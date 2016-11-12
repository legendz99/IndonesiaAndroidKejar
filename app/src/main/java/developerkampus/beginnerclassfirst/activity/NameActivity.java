package developerkampus.beginnerclassfirst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import developerkampus.beginnerclassfirst.R;

public class NameActivity extends AppCompatActivity {

    private TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        tvName = (TextView) findViewById(R.id.tv_name);

        Intent name = getIntent();
        Bundle bundle = name.getExtras();

        if (bundle != null){
            String yourname = (String) bundle.get("YourName");
            tvName.setText("Hello "+yourname);
        }
    }
}
