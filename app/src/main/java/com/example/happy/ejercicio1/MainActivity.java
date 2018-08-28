package com.example.happy.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText edtMainMasa;
    private EditText edtMainAltura;
    private Button btnMainCalcular;
    private TextView tvMainResult;

    private double masa;
    private double altura;
    private double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMainMasa = findViewById(R.id.edt_main_masa);
        edtMainAltura = findViewById(R.id.edt_main_altura);
        btnMainCalcular = findViewById(R.id.btn_main_calcular);
        tvMainResult = findViewById(R.id.tv_main_result);

        btnMainCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                masa = Double.parseDouble(edtMainMasa.getText().toString());
                altura = Double.parseDouble(edtMainAltura.getText().toString());
                result = (masa/Math.pow(altura,2));

                tvMainResult.setText(String.format("%.3f",result));
            }
        });

    }
}
