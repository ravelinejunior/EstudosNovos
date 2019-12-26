package br.com.raveline.estudosnovos.activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.fragments.ContatosFragment;
import br.com.raveline.estudosnovos.fragments.ConversasFragment;

public class FragmentsActivity extends AppCompatActivity {

    private Button botaoConversasFragment;
    private Button botaoContatosFragment;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        botaoContatosFragment = findViewById(R.id.contatos_button_id_fragments);
        botaoConversasFragment = findViewById(R.id.conversas_button_id_fragments);

        //instanciar um fragmento
        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();

        //configurar objeto de Fragmento
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout_id_fragments_main,conversasFragment);
        transaction.setTransition(android.R.transition.explode);
        transaction.commit();

        botaoContatosFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout_id_fragments_main,contatosFragment);
                transaction.setTransition(android.R.transition.slide_left);
                transaction.commit();


            }
        });

        botaoConversasFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout_id_fragments_main,conversasFragment);
                transaction.setTransition(android.R.transition.explode);
                transaction.commit();
            }
        });
    }
}
