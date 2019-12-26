package br.com.raveline.estudosnovos.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.activities.MainActivity;
import br.com.raveline.estudosnovos.activities.PassandoDadosActivity;
import br.com.raveline.estudosnovos.model.Noticia;
import br.com.raveline.estudosnovos.model.PostagensCardView;

public class AdapterCardViewRecycler extends RecyclerView.Adapter<AdapterCardViewRecycler.MyViewHolder> implements Serializable {

    private List<PostagensCardView> postagensCardViewsList;
    private Context context;

    public AdapterCardViewRecycler(List<PostagensCardView> listaPostagem, Context context) {
            this.postagensCardViewsList = listaPostagem;
            this.context = context;



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_cardview,
                    parent,
                    false
                );

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        //recuperando os valores passados via construtor

        final PostagensCardView pList = postagensCardViewsList.get(position);
        holder.nomeUsuario.setText(pList.getNomeUsuario());
        holder.descricaoHora.setText(pList.getDescricaoCardView());
        final String descricao = pList.getDescricaoCardView();
        holder.imagemCardView.setImageResource(pList.getImagemPostagens());
        final int imagem = pList.getImagemPostagens();

        holder.botaoCardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Noticia noticia = new Noticia("Uma função que pode ou não dar certo");
            Intent i = new Intent(context, PassandoDadosActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra("noticia",noticia);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra("descricaoHora",descricao);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra("imagemCardView",imagem);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra("nomeUsuario",pList.getNomeUsuario());
            context.startActivity(i);
        }
    });

    }


    @Override
    public int getItemCount() {
        return postagensCardViewsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nomeUsuario;
        private TextView descricaoHora;
        private ImageView imagemCardView;
        private Button botaoCardView;
        private TextView bloquearImagemCardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeUsuario = itemView.findViewById(R.id.usuario_id_adapterCardView);
            descricaoHora = itemView.findViewById(R.id.descricao_cardView_id);
            imagemCardView = itemView.findViewById(R.id.imagem_cardView_id);
            botaoCardView = itemView.findViewById(R.id.botao_cardView);
            bloquearImagemCardView = itemView.findViewById(R.id.bloquear_imagem_id_adapter_cardView);
        }
    }
}
