package vn.poly.slide2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {


    private String number;

    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        number = getIntent().getStringExtra("number");


        tvTitle = findViewById(R.id.tvTitle);

        tvTitle.setText(number);


    }
}
