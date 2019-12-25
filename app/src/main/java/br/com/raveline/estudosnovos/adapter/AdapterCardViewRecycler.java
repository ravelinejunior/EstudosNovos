package br.com.raveline.estudosnovos.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.activities.PassandoDadosActivity;
import br.com.raveline.estudosnovos.model.PostagensCardView;

public class AdapterCardViewRecycler extends RecyclerView.Adapter<AdapterCardViewRecycler.MyViewHolder> {

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
        String nome = (pList.getNomeUsuario());
        holder.descricaoHora.setText(pList.getDescricaoCardView());
        final String descricao = pList.getDescricaoCardView();
        holder.imagemCardView.setImageResource(pList.getImagemPostagens());
        final int imagem = pList.getImagemPostagens();

    holder.botaoCardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(context, PassandoDadosActivity.class);
            i.putExtra("descricaoHora",descricao);
            i.putExtra("imagemCardView",imagem);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeUsuario = itemView.findViewById(R.id.usuario_id_adapterCardView);
            descricaoHora = itemView.findViewById(R.id.descricao_cardView_id);
            imagemCardView = itemView.findViewById(R.id.imagem_cardView_id);
            botaoCardView = itemView.findViewById(R.id.botao_cardView);
        }
    }
}
