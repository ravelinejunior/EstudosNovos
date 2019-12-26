package br.com.raveline.estudosnovos.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Noticia implements Serializable {
    private String nome;
    private String descricao;
    private String funcaoEscrita;
    private ImageView imageView2;


    public Noticia() {
    }

    public Noticia(String funcaoEscrita) {
        this.funcaoEscrita = funcaoEscrita;
    }

    public Noticia(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getFuncaoEscrita() {
        return funcaoEscrita;
    }

    public void setFuncaoEscrita(String funcaoEscrita) {
        this.funcaoEscrita = funcaoEscrita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImageView getImageView2() {
        return imageView2;
    }

    public void setImageView2(ImageView imageView2) {
        this.imageView2 = imageView2;
    }
}
