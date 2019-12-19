package br.com.raveline.estudosnovos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.raveline.estudosnovos.adapter.AdapterRecyclerView;
import model.Noticia;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterRecyclerView adapterRecyclerView;
    private List<Noticia> noticiaList;
    private Noticia noticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerView_layout);

        //criar uma listagem de noticias
        noticiaList = new ArrayList<>();
        criarNoticias();


        //configurar br.com.raveline.estudosnovos.adapter -- recebe os dados, formata os dados
        adapterRecyclerView = new AdapterRecyclerView(noticiaList);

        //configurar RecyclerView -- criar gerenciador de layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterRecyclerView);

    }

    public void criarNoticias(){
        noticia = new Noticia("Franklin","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Italo","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Marina","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Careca","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Ana","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Ian","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Lampard","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Aly","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Maozinha","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Italo","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

        noticia = new Noticia("Marisa","Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        noticiaList.add(noticia);

    }
}
