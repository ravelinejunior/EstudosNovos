package br.com.raveline.estudosnovos.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import br.com.raveline.estudosnovos.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton fernandaId;
    private RadioButton italoId;
    private RadioButton yasminId;
    private RadioButton luanaId;
    private RadioButton marinaID;
    private Button botaoAcionar;
    private TextView resultado;
    private Button calculadoraActbotao;
    private Button listViewButton;
    private Button recyclerViewButton;
    private Button cardViewButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregarElementos();
        verificarRadioButton();
        ativarBotao();
        calculadoraActbotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CalculadoraPorcentagem.class);
                startActivity(i);
            }
        });


        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ListViewAcitivity.class);
                startActivity(i);
            }
        });


        recyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(i);
            }
        });

        cardViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CardViewActivity.class);
                startActivity(i);
            }
        });


    }

    public void verificarRadioButton(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.fernanda_id:
                        resultado.setText(fernandaId.getText().toString());
                        break;
                    case R.id.marina_id:
                        resultado.setText(marinaID.getText().toString());
                        break;
                    case R.id.italo_id:
                        resultado.setText(italoId.getText().toString());
                        break;
                    case R.id.luana_id:
                        resultado.setText(luanaId.getText().toString());
                        break;
                    case R.id.yasmin_id:
                        resultado.setText(yasminId.getText().toString());
                        break;
                }
            }
        });
    }

    public void ativarBotao(){
        botaoAcionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Acionar");
                builder.setMessage("Deseja acionar uma ação qualquer?");
                builder.setIcon(android.R.drawable.ic_menu_upload_you_tube);
                builder.setCancelable(false);

                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "Namorada", Toast.LENGTH_SHORT).show();
                        marinaID.setChecked(true);
                        Intent i = new Intent(getApplicationContext(),ProgressBarsActivity.class);
                        startActivity(i);
                        finish();
                    }
                });

                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Não!", Toast.LENGTH_SHORT).show();
                        yasminId.setChecked(true);
                    }
                });

                builder.create();
                builder.show();


            }
        });
    }

    public void carregarElementos(){
        radioGroup = findViewById(R.id.radio_group_id);
        fernandaId = findViewById(R.id.fernanda_id);
        italoId = findViewById(R.id.italo_id);
        yasminId = findViewById(R.id.yasmin_id);
        luanaId = findViewById(R.id.luana_id);
        marinaID = findViewById(R.id.marina_id);
        botaoAcionar = findViewById(R.id.botao_acionar);
        TextInputLayout textoInput = findViewById(R.id.textInputLayout);
        resultado = findViewById(R.id.resultado_id);
        calculadoraActbotao = findViewById(R.id.calculador_id_activity);
        listViewButton = findViewById(R.id.listView_button_id);
        resultado = findViewById(R.id.resultado_id);
        recyclerViewButton = findViewById(R.id.recyclerView_id_button);
        cardViewButton = findViewById(R.id.cardView_id);
    }
}
