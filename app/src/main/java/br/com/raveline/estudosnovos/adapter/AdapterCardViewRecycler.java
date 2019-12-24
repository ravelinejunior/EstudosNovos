package br.com.raveline.estudosnovos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.model.PostagensCardView;

public class AdapterCardViewRecycler extends RecyclerView.Adapter<AdapterCardViewRecycler.MyViewHolder> {

    private List<PostagensCardView> postagensCardViewsList;

    public AdapterCardViewRecycler(List<PostagensCardView> listaPostagem ) {
            this.postagensCardViewsList = listaPostagem;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //recuperando os valores passados via construtor

        PostagensCardView pList = postagensCardViewsList.get(position);
        holder.nomeUsuario.setText(pList.getNomeUsuario());
        holder.descricaoHora.setText(pList.getDescricaoCardView());
        holder.imagemCardView.setImageResource(pList.getImagemPostagens());

    }


    @Override
    public int getItemCount() {
        return postagensCardViewsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nomeUsuario;
        private TextView descricaoHora;
        private ImageView imagemCardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeUsuario = itemView.findViewById(R.id.usuario_id_adapterCardView);
            descricaoHora = itemView.findViewById(R.id.descricao_cardView_id);
            imagemCardView = itemView.findViewById(R.id.imagem_cardView_id);
        }
    }
}
