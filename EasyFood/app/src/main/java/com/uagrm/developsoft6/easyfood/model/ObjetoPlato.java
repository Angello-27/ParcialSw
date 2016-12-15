package com.uagrm.developsoft6.easyfood.model;

import java.util.ArrayList;
import java.util.List;

public class ObjetoPlato {

    private String img;
    private String nome;
    private String acompanhamento;
    private double preco;

    public static List<ObjetoPlato> JsonChamada(){


        List<ObjetoPlato> pratos = new ArrayList<>();

        pratos.add(new ObjetoPlato("frago_frito","Pollo Frito","Coca cola 2L",15.00));
        pratos.add(new ObjetoPlato("calabresa","Pepperoni","",9.00));
        pratos.add(new ObjetoPlato("file_frango","Filete de Pollo","Jugo de Naranja 200ml",10.00));
        pratos.add(new ObjetoPlato("frango_molho","Salsa de Pollo","Coca cola 600ml",13.00));

        return pratos;

    }

    public ObjetoPlato(String imagem, String nome, String acompanhamento, double prexo) {
        this.img = imagem;
        this.nome = nome;
        this.acompanhamento = acompanhamento;
        this.preco = prexo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double prexo) {
        this.preco = prexo;
    }
}
