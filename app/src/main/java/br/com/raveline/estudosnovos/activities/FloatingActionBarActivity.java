package br.com.raveline.estudosnovos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import br.com.raveline.estudosnovos.R;

public class FloatingActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_bar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view ->
                Snackbar.make(view, "Deseja voltar para tela de artigos?", Snackbar.LENGTH_LONG)
                .setAction("Voltar", v -> {
                    Intent i = new Intent(getApplicationContext(),CardViewActivity.class);
                    startActivity(i);
                }).show());
    }

}
