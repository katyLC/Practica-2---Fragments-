package com.example.practica2;

public class Tour {
    public String id;
    public String descripcion;
    double precio;
    String estadia;

    public Tour(String id, String descripcion, double precio, String estadia) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estadia = estadia;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
