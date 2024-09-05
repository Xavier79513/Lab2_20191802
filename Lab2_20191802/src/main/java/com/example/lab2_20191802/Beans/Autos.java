package com.example.lab2_20191802.Beans;

public class Autos {
    private String modelo;
    private String color;
    private int Kilometraje;
    private double costo_dia;
    private Sede id_sede;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        Kilometraje = kilometraje;
    }

    public double getCosto_dia() {
        return costo_dia;
    }

    public void setCosto_dia(double costo_dia) {
        this.costo_dia = costo_dia;
    }

    public Sede getId_sede() {
        return id_sede;
    }

    public void setId_sede(Sede id_sede) {
        this.id_sede = id_sede;
    }
}
