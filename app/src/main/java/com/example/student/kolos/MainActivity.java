package com.example.student.kolos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Edtxt_podajNr)
    EditText Edtxt_podajNr ;

    @BindView(R.id.btn_wybierzDane)
    Button btn_wybierzDane;

    @OnClick(R.id.btn_wybierzDane)
void OnClick(){

    Intent intent = new Intent( MainActivity.this, Main2Activity.class);
    startActivity(intent);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
