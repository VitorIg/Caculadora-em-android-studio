package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1EditText;
    EditText numero2EditText;
    Button adicaoButton;
    Button subtracaoButton;
    Button multiplicacaoButton;
    Button divisaoButton;
    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vinculoComponentes();
        EventoClicar();

    }

    private void vinculoComponentes() {

        numero1EditText = findViewById(R.id.numero1EditText);
        numero2EditText = findViewById(R.id.numero2EditText);

        adicaoButton = findViewById(R.id.adicaoButton);
        subtracaoButton = findViewById(R.id.subtracaoButton);
        multiplicacaoButton = findViewById(R.id.multiplicacaoButton);
        divisaoButton = findViewById(R.id.divisaoButton);

        resultadoTextView = findViewById(R.id.resultadoTextView);
    }

    private void EventoClicar() {
        adicaoButton.setOnClickListener(evt -> adionar());
        subtracaoButton.setOnClickListener(evt -> subtrair());
        multiplicacaoButton.setOnClickListener(evt -> multiplicar());
        divisaoButton.setOnClickListener(evt -> dividir());
    }

    private void tratamendo(){
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();

        if (numero1String.isEmpty() || numero2String.isEmpty())
        {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
            return;
        }

    }



    private void adionar() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();

        if (numero1String.isEmpty() || numero2String.isEmpty())
        {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
            return;
        }
    double numero1 = Double.parseDouble(numero1String);
    double numero2 = Double.parseDouble(numero2String);

    double resultado = numero1 + numero2;

    resultadoTextView.setText(String.valueOf(resultado));

            }


            private void subtrair(){
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();

                if (numero1String.isEmpty() || numero2String.isEmpty())
                {
                    Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
                    return;
                }

                double numero1 = Double.parseDouble(numero1String);
                double numero2 = Double.parseDouble(numero2String);

                double resultado = numero1 - numero2;

                resultadoTextView.setText(String.valueOf(resultado));



        }
            private void multiplicar(){
                String numero1String = numero1EditText.getText().toString();
                String numero2String = numero2EditText.getText().toString();

                if (numero1String.isEmpty() || numero2String.isEmpty())
                {
                    Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
                    return;
                }

                double numero1 = Double.parseDouble(numero1String);
                double numero2 = Double.parseDouble(numero2String);

                double resultado = numero1 * numero2;

                resultadoTextView.setText(String.valueOf(resultado));


            }
            private void dividir(){
                String numero1String = numero1EditText.getText().toString();
                String numero2String = numero2EditText.getText().toString();

                if (numero1String.isEmpty() || numero2String.isEmpty())
                {
                    Toast.makeText(this, "Digite dois números", Toast.LENGTH_SHORT).show();
                    return;
                }

                double numero1 = Double.parseDouble(numero1String);
                double numero2 = Double.parseDouble(numero2String);

                double resultado = numero1 / numero2;

                resultadoTextView.setText(String.valueOf(resultado));


            }
}



