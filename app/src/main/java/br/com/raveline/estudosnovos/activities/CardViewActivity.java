package br.com.raveline.estudosnovos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.adapter.AdapterCardViewRecycler;
import br.com.raveline.estudosnovos.model.PostagensCardView;

public class CardViewActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCardView;
    private List<PostagensCardView> postagensCardViewList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        recyclerViewCardView = findViewById(R.id.recyclerView_cardview_id);

        AdapterCardViewRecycler adapterCardViewRecycler = new AdapterCardViewRecycler(postagensCardViewList,getApplicationContext());

        //configurar layout de recycler view

        //utilizando como orientação recyclerview VERTICAL
        RecyclerView.LayoutManager layoutManagerCardView = new LinearLayoutManager(this);

        //COMO HORIZONTAL LINEAR LAYOUT MANAGER
        //LinearLayoutManager layoutManagerCardView = new LinearLayoutManager(this);
        //layoutManagerCardView.setOrientation(RecyclerView.HORIZONTAL);

        //PASSANDO COMO GRID VIEW
       // RecyclerView.LayoutManager layoutManagerCardView = new GridLayoutManager(this,1);

        recyclerViewCardView.setLayoutManager(layoutManagerCardView);
        //manter o layout com tamanho estatico
        recyclerViewCardView.setHasFixedSize(true);
        recyclerViewCardView.setAdapter(adapterCardViewRecycler);

        //definindo o adapter
        this.preparandoPostagens();

    }

    public void preparandoPostagens(){
        PostagensCardView po = new PostagensCardView(R.drawable.anj,"Raveline","Muito legal essa imagem publicada.");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.anjo,"Marina","Muito legal essa imagem publicada. Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.another,"Italo","Muito legal essa imagem publicada. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.fotodia,"Luciene","Muito legal essa imagem publicada. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.fotonoite,"Alucard","Muito legal essa imagem publicada.");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.fototarde,"Midorya","Muito legal essa imagem publicada. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
        this.postagensCardViewList.add(po);

         po = new PostagensCardView(R.drawable.fallen,"Salazer","Muito legal essa imagem publicada.");
        this.postagensCardViewList.add(po);


    }
}
