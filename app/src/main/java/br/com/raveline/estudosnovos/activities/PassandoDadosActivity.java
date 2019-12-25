package br.com.raveline.estudosnovos.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.raveline.estudosnovos.R;

public class PassandoDadosActivity extends AppCompatActivity {
    private ImageView imagemPassandodados;
    private TextView descricaoPassandoDados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passando_dados);
        imagemPassandodados = findViewById(R.id.imagem_id_passandoDados);
        descricaoPassandoDados = findViewById(R.id.descricao_passandoDados_id);

        Bundle b = new Bundle();
        int imagem = b.getInt("imagemCardView",R.drawable.fototarde);
       String descricao =  b.getString("descricaoHora","Teste");

       descricaoPassandoDados.setText(descricao);
        Log.d("imagem",imagemPassandodados.getDrawable().getCurrent().toString());
       imagemPassandodados.setImageResource(imagem);
       Log.d("descricao",descricaoPassandoDados.getText().toString());

    }
}
