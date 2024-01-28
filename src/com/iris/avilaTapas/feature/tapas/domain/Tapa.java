package com.iris.avilaTapas.feature.tapas.domain;

public class Tapa {
    private String id;
    private String name;
    private String ingredientes;
    private double precio;
    private String alergenos;
    private String urlImg;

    public Tapa(String id,String name,double precio,String ingredientes,String alergenos,String urlImg){
        this.name=name;
        this.id=id;
        this.precio=precio;
        this.ingredientes=ingredientes;
        this.alergenos=alergenos;
        this.urlImg=urlImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(String alergenos) {
        this.alergenos = alergenos;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
