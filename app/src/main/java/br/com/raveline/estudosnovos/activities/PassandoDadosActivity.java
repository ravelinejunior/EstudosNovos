package br.com.raveline.estudosnovos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.model.Noticia;

public class PassandoDadosActivity extends AppCompatActivity {
    private ImageView imagemPassandodados;
    private TextView descricaoPassandoDados;
    private TextView nomeUsuarioPassandoDados;
    private TextView noticiaPassandoDados;
    private Button botaoIniciarFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passando_dados);
        imagemPassandodados = findViewById(R.id.imagem_id_passandoDados);
        descricaoPassandoDados = findViewById(R.id.descricao_passandoDados_id);
        nomeUsuarioPassandoDados = findViewById(R.id.nome_usuario_id_passandoDados);
        noticiaPassandoDados = findViewById(R.id.noticia_id_passandoDados);
        botaoIniciarFragments = findViewById(R.id.botao_tela_fragments);

        //recuperando dados de outra activity
        Bundle b = getIntent().getExtras();
        int imagem = b.getInt("imagemCardView",R.drawable.fototarde);
        Noticia noticia = (Noticia) b.getSerializable("noticia");
        String descricao =  b.getString("descricaoHora","Teste");
        String nomeUsuario = b.getString("nomeUsuario","Usuario");
        String noticiaPassandoDadosString = noticia.getFuncaoEscrita();

       descricaoPassandoDados.setText(descricao);
       imagemPassandodados.setImageResource(imagem);
       nomeUsuarioPassandoDados.setText(nomeUsuario);
       noticiaPassandoDados.setText(noticiaPassandoDadosString);

       botaoIniciarFragments.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(), FragmentsActivity.class);
               startActivity(i);
           }
       });





    }
}
