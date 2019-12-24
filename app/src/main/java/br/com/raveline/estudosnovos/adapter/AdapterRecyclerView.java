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
import br.com.raveline.estudosnovos.model.Noticia;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MyViewHolder> {

    private List<Noticia> list;

    public AdapterRecyclerView(List<Noticia> list) {
        this.list = list;
    }

    @NonNull
    @Override // esse metodo cria as visualizações
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //retorna o componente que está dentro da view
        View itemListaView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.adapter_recyclerview,parent,false);

        //retornar uma instancia do tipo MyViewHolder
        return new MyViewHolder(itemListaView) ;
    }

    @Override // onde se carrega a view
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Noticia noticia = list.get(position);
        holder.nome.setText(noticia.getNome());
        holder.imagem.setImageResource(R.drawable.anj);
        holder.descricao.setText(noticia.getDescricao());
    }

    @Override //retorna quantidade de itens que serão exibidos
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView descricao;
        ImageView imagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //recuperar elementos de tela
            nome = itemView.findViewById(R.id.nome_id_recycler);
            descricao = itemView.findViewById(R.id.descricao_recyclerView);
            imagem = itemView.findViewById(R.id.imageView2);

        }
    }
}
