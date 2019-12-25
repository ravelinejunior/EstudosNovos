package br.com.raveline.estudosnovos.model;

import java.io.Serializable;

public class PostagensCardView implements Serializable {

    private int imagemPostagens;
    private String nomeUsuario;
    private String descricaoCardView;

    public PostagensCardView() {

    }

    public PostagensCardView(int imagemPostagens, String nomeUsuario, String descricaoCardView) {
        this.imagemPostagens = imagemPostagens;
        this.nomeUsuario = nomeUsuario;
        this.descricaoCardView = descricaoCardView;
    }

    public int getImagemPostagens() {
        return imagemPostagens;
    }

    public void setImagemPostagens(int imagemPostagens) {
        this.imagemPostagens = imagemPostagens;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDescricaoCardView() {
        return descricaoCardView;
    }

    public void setDescricaoCardView(String descricaoCardView) {
        this.descricaoCardView = descricaoCardView;
    }
}
