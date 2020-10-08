package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    TextView edCapitacao, edCamp1, edCamp2, edCamp3;

    Button btnCalc, btnClean;

    double n1, resultado1, resultado2, resultado3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClean = findViewById(R.id.btnClean);
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edCapitacao.setText("");
                edCamp1.setText("");
                edCamp2.setText("");
                edCamp3.setText("");
            }
        });

        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                edCapitacao = (TextView) findViewById(R.id.edCapitacao);
                edCamp1 = (TextView) findViewById(R.id.edCamp1);
                edCamp2 = (TextView) findViewById(R.id.edCamp2);
                edCamp3 = (TextView) findViewById(R.id.edCamp3);

                n1 = Double.parseDouble(edCapitacao.getText().toString());


                // Par ou Impar
                resultado1 = n1 % 2;

                if(resultado1 == 0){
                        edCamp1.setText("Seu número é Par");
                }
                // impar
                else{
                    edCamp1.setText("Seu número é impar ");

                }
                // dobro
                resultado2 = n1 * 2;
                edCamp2.setText(String.valueOf(resultado2));

                // Raiz Quadrada
                resultado3 = sqrt(n1);

                edCamp3.setText(String.format("%.2f",resultado3));

            }



        });

    }
}