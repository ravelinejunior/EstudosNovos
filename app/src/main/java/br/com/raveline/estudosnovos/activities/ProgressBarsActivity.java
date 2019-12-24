package br.com.raveline.estudosnovos.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import br.com.raveline.estudosnovos.R;

public class ProgressBarsActivity extends AppCompatActivity {
    private ProgressBar progressBarCircular;
    private ProgressBar progressBarHorizontal;
    private Button botaoProgressActivity;
    private SeekBar seekBar;
    private TextView resultadoSeek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bars);
        carregarElementos();
        exibirDadosSeek();


        botaoProgressActivity.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                exibirProgressBars();



            }
        });
    }

    public void exibirProgressBars(){
        if (progressBarHorizontal.getVisibility() == View.INVISIBLE){
            progressBarHorizontal.setVisibility(View.VISIBLE);
        } else{
            progressBarHorizontal.setVisibility(View.INVISIBLE);
        }

        if (progressBarCircular.getVisibility() == View.INVISIBLE){
            progressBarCircular.setVisibility(View.VISIBLE);
        }else{
            progressBarCircular.setVisibility(View.INVISIBLE);
        }


        String acionado = botaoProgressActivity.getText().toString();
        if (acionado.equalsIgnoreCase("Carregar")){
            botaoProgressActivity.setText("Parar");
        }else {
            botaoProgressActivity.setText("Carregar");
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                //carregando a progressBar horizontal
                for ( int i = 0; i <= 100; i+=10){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    final int progresso = i;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBarHorizontal.setProgress(progresso);
                            if (progresso == 100){
                                progressBarCircular.setVisibility(View.GONE);
                                botaoProgressActivity.setText("Zerar");
                            }
                        }
                    });
                }
            }
        }).start();



    }
    public void exibirDadosSeek(){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                resultadoSeek.setText("Progresso: "+seekBar.getProgress()+" de "+seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(ProgressBarsActivity.this, "Seekbar tocado", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(ProgressBarsActivity.this, "Seekbar deselecionado", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void carregarElementos(){
        progressBarCircular = findViewById(R.id.progressBar_circular_id);
        progressBarHorizontal = findViewById(R.id.progressBar_horizontal_id);
        botaoProgressActivity = findViewById(R.id.botao_id_progress_activity);
        TextView carregandoProgress = findViewById(R.id.carregando_id_text);
        seekBar = findViewById(R.id.seekBar_progress_activity);
        resultadoSeek = findViewById(R.id.taxa_seekBar_texto);


    }
}
