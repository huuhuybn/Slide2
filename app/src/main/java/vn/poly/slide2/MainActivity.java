package vn.poly.slide2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("HELLO","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("HELLO","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("HELLO","onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("HELLO","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("HELLO","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("HELLO","onStart");
    }




    private EditText edtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // tham chieu doi tuong editText tu file giao dien
        edtNumber = findViewById(R.id.edtNumber);


        Log.e("HELLO","onCreate");

    }

    // phuong thuc cho su kien click nut OK.
    // tham so bat buoc phai la View view
    public void openNewScreen(View view){

        Log.e("DANHDAU","Chay pt open");

        String number = edtNumber.getText().toString();


        int num = Integer.parseInt(number);

        // khai bao intent voi man hinh muc tieu la SubActivity
        Intent intent =
                new Intent(MainActivity.this,
                        SubActivity.class);



        intent.putExtra("number",number);

        // chuyen man hinh
        startActivity(intent);




    }



}
