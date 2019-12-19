package br.com.raveline.estudosnovos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewAcitivity extends AppCompatActivity {
    private ListView listLocalViagens;
    private String[] itensLocais = {"Europa","America do Sul","Asia","Oceania"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_acitivity);
        listLocalViagens = findViewById(R.id.listView_list_id);


        //criar adaptador para list view
        ArrayAdapter<String> arrayAdapterLista = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.two_line_list_item,
                android.R.id.text2,
                itensLocais

        );

        //adicionar o adaptador na lista
        listLocalViagens.setAdapter(arrayAdapterLista);
        listLocalViagens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = listLocalViagens.getItemAtPosition(position).toString();
                Toast.makeText(ListViewAcitivity.this, valorSelecionado, Toast.LENGTH_SHORT).show();

            }
        });



    }
}
