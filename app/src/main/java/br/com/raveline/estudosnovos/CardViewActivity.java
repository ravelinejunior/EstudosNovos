package br.com.raveline.estudosnovos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CardViewActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        recyclerViewCardView = findViewById(R.id.recyclerView_cardview_id);

        //configurar layout de recycler view
        RecyclerView.LayoutManager layoutManagerCardView = new LinearLayoutManager(this);
        recyclerViewCardView.setLayoutManager(layoutManagerCardView);
        //manter o layout com tamanho estatico
        recyclerViewCardView.setHasFixedSize(true);
       // recyclerViewCardView.setAdapter();



    }
}
