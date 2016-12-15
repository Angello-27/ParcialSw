package com.uagrm.developsoft6.easyfood.model;

import java.util.ArrayList;
import java.util.List;

public class ObjetoPedido {

    private String img;
    private String nome;
    private double preco;
    private int cantidad;

    public static List<ObjetoPedido> pedidos = new ArrayList<>();

    public static List<ObjetoPedido> JsonChamada(ObjetoPedido nuevo){
        if (pedidos.contains(nuevo)){
            ObjetoPedido viejo = pedidos.get(pedidos.indexOf(nuevo));
            viejo.setCantidad(viejo.getCantidad() + 1);
            viejo.setPreco(nuevo.getPreco() * viejo.getCantidad());
            pedidos.set(pedidos.indexOf(nuevo),viejo);
        }else {
            nuevo.setCantidad(1);
            pedidos.add(nuevo);
        }
        return pedidos;
    }

    public ObjetoPedido(String img, String nome, double preco, int cantidad) {
        this.img = img;
        this.nome = nome;
        this.preco = preco;
        this.cantidad = cantidad;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
