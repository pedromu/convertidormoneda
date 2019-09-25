package com.santotomas.peso_usd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText val_valor1;
    private TextView tv_resultado1;
    private TextView tv_resultado2;
    DecimalFormat decimal = new DecimalFormat("$#,###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val_valor1=(EditText)findViewById(R.id.txt_valor1);
        tv_resultado1=(TextView)findViewById(R.id.tv_resultado1);
        tv_resultado2=(TextView)findViewById(R.id.tv_resultado2);

    }

    public void Calcular(View view){
        String valor1_String=val_valor1.getText().toString();

        double valor1_int=Double.parseDouble(valor1_String);

        double tran = valor1_int / 706.98;
        String resultado = decimal.format(tran);
        tv_resultado1.setText(resultado);

        double ufs = valor1_int / 27593.25;
        String resultado2 = decimal.format(ufs);
        tv_resultado2.setText(resultado2);




    }

}
