package com.example.calcularnota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre, etnota1, etnota2, etnota3;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etnota1 = (EditText) findViewById(R.id.etnota1);
        etnota2 = (EditText) findViewById(R.id.etnota2);
        etnota3 = (EditText) findViewById(R.id.etnota3);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

    }
    public void calcular(View view){
        String nombre = etNombre.getText().toString();
        String valor1 = etnota1.getText().toString();
        String valor2 = etnota2.getText().toString();
        String valor3 = etnota3.getText().toString();
        float num1 = Float.parseFloat(valor1);
        float num2 = Float.parseFloat(valor2);
        float num3 = Float.parseFloat(valor3);
        float resultado = (num1 + num2 + num3)/3;
        tvResultado.setText(nombre + " Tu definitva es: " + resultado);
        if(resultado<3.0){
            Toast.makeText(this, "Perdiste la materia", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Ganaste la materia", Toast.LENGTH_SHORT).show();
        }

    }
}