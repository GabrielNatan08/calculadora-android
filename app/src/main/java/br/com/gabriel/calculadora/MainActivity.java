package br.com.gabriel.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button um, dois, soma, tres, quatro, cinco, seis, sete, oito, nove, zero;
    private Button virgula, esquerda, direita;
    private Button adicao, subtracao, multiplicacao, divisao;
    private Button igual, correct, clean;
    private TextView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        um = findViewById(R.id.um);
        dois = findViewById(R.id.dois);
        tres = findViewById(R.id.tres);
        quatro = findViewById(R.id.quatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        sete = findViewById(R.id.sete);
        oito = findViewById(R.id.oito);
        nove = findViewById(R.id.nove);
        zero = findViewById(R.id.zero);
        igual = findViewById(R.id.igual);
        correct = findViewById(R.id.correct);
        clean = findViewById(R.id.clean);
        adicao = findViewById(R.id.adicao);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.divisao);
        visor = findViewById(R.id.visor);
        virgula = findViewById(R.id.virgula);
        esquerda = findViewById(R.id.esquerda);
        direita = findViewById(R.id.direita);

        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        sete.setOnClickListener(this);
        oito.setOnClickListener(this);
        nove.setOnClickListener(this);
        zero.setOnClickListener(this);
        igual.setOnClickListener(this);
        correct.setOnClickListener(this);
        clean.setOnClickListener(this);
        adicao.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        divisao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        virgula.setOnClickListener(this);
        esquerda.setOnClickListener(this);
        direita.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.um: {
                visor.setText(visor.getText().toString() + um.getText());
                break;
            }
            case R.id.dois: {
                visor.setText(visor.getText().toString() + dois.getText());
                break;
            }
            case R.id.tres: {
                visor.setText(visor.getText().toString() + tres.getText());
                break;
            }
            case R.id.quatro: {
                visor.setText(visor.getText().toString() + quatro.getText());
                break;
            }
            case R.id.cinco: {
                visor.setText(visor.getText().toString() + cinco.getText());
                break;
            }
            case R.id.seis: {
                visor.setText(visor.getText().toString() + seis.getText());
                break;
            }
            case R.id.sete: {
                visor.setText(visor.getText().toString() + sete.getText());
                break;
            }
            case R.id.oito: {
                visor.setText(visor.getText().toString() + oito.getText());
                break;
            }
            case R.id.nove: {
                visor.setText(visor.getText().toString() + nove.getText());
                break;
            }
            case R.id.zero: {
                visor.setText(visor.getText().toString() + zero.getText());
                break;
            }
            case R.id.virgula: {
                visor.setText(visor.getText().toString() + virgula.getText());
                break;
            }
            case R.id.esquerda: {
                visor.setText(visor.getText().toString() + esquerda.getText());
                break;
            }
            case R.id.direita: {
                visor.setText(visor.getText().toString() + direita.getText());
                break;
            }
            case R.id.correct: {
                String view = visor.getText().toString();
                if(view.equals(""))
                    break;
                else
                    visor.setText(view.substring(0, view.length() -1));
                break;
            }
            case R.id.clean: {
                visor.setText("");
                break;
            }
            case R.id.adicao: {
                visor.setText(visor.getText().toString() + adicao.getText());
                break;
            }
            case R.id.subtracao: {
                visor.setText(visor.getText().toString() + subtracao.getText());
                break;
            }
            case R.id.divisao: {
                visor.setText(visor.getText().toString() + divisao.getText());
                break;
            }
            case R.id.multiplicacao: {
                visor.setText(visor.getText().toString() + multiplicacao.getText());
                break;
            }
            case R.id.igual: {
                Engine engine = new Engine();
                visor.setText(engine.calc(visor.getText().toString()));
            }
        }
    }
}