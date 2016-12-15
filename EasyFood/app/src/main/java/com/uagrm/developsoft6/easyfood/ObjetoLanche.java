package net.megamil.restaurante;

import java.util.ArrayList;
import java.util.List;

public class ObjetoLanche {
    
    private String img;
    private String nome;
    private String acompanhamento;
    private double preco;

    public static List<ObjetoLanche> JsonChamada(){


        List<ObjetoLanche> lanches = new ArrayList<>();

        lanches.add(new ObjetoLanche("pizza","Pizza","Coca cola 2L",20.00));
        lanches.add(new ObjetoLanche("bolo","Pastel","",21.00));
        lanches.add(new ObjetoLanche("coxinha","Baquetas","",1.00));
        lanches.add(new ObjetoLanche("doces","Golosinas","Coca cola 600ml",13.00));
        lanches.add(new ObjetoLanche("enrolado_salsicha","Salchichas Enrolladas","",4.40));
        lanches.add(new ObjetoLanche("humburguer","Hamburguesa","Coca cola 1L",5.00));
        lanches.add(new ObjetoLanche("misto_quente","Mixta Caliente","Pepsi 300ml",6.50));
        lanches.add(new ObjetoLanche("lanches","Salados","",1.00));
        lanches.add(new ObjetoLanche("pao_queijo","Pan de Queso 10 U","",3.00));

        return lanches;

    }

    public ObjetoLanche(String imagem, String nome, String acompanhamento, double prexo) {
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
