package br.com.raveline.estudosnovos.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import br.com.raveline.estudosnovos.R;

public class CalculadoraPorcentagem extends AppCompatActivity {
    private SeekBar seekBarCalculadora;
    private TextInputEditText valorInseridoCalculadora;
    private TextView valorTotal;
    private TextView descontoTotal;
    private TextView gorgetaTotal;
    private float totalGorgetaCalculado = 0;
    private float valorTotalCalculado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_porcentagem);
        carregarElementos();
        carregarDescontoSeekBar();
    }

    public void carregarDescontoSeekBar(){
        seekBarCalculadora.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                try {
                    float valorSeekbar = seekBar.getProgress();
                    if (String.valueOf(valorSeekbar).isEmpty()) {
                        descontoTotal.setText(valorSeekbar + "%");
                    } else {
                        descontoTotal.setText(valorSeekbar + "%");
                    }

                    float valorInserido = Float.parseFloat(valorInseridoCalculadora.getText().toString());
                    if (valorInseridoCalculadora.getText().equals(null)) {

                    }
                    totalGorgetaCalculado = ((valorSeekbar * valorInserido) / 100);
                    gorgetaTotal.setText(String.format("R$%s",totalGorgetaCalculado));

                    valorTotalCalculado = totalGorgetaCalculado + valorInserido;
                    valorTotal.setText("R$" + (valorTotalCalculado));
                }catch (Exception e){
                    e.printStackTrace();

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void  carregarElementos(){
        seekBarCalculadora = findViewById(R.id.seekBar_desconto_id);
        valorInseridoCalculadora = findViewById(R.id.valor_id_input_edittext);
        valorTotal = findViewById(R.id.total_id);
        descontoTotal = findViewById(R.id.desconto_id_valor);
        gorgetaTotal = findViewById(R.id.gorgeta_id);
    }
}
