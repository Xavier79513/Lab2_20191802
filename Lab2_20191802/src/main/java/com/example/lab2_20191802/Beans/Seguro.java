package com.example.lab2_20191802.Beans;

public class Seguro {
    private int id_seguro;
    private String empresa_aseguradora;
    private double cobertura_maxima;
    private double tarifa;

    public int getId_seguro() {
        return id_seguro;
    }

    public void setId_seguro(int id_seguro) {
        this.id_seguro = id_seguro;
    }

    public String getEmpresa_aseguradora() {
        return empresa_aseguradora;
    }

    public void setEmpresa_aseguradora(String empresa_aseguradora) {
        this.empresa_aseguradora = empresa_aseguradora;
    }

    public double getCobertura_maxima() {
        return cobertura_maxima;
    }

    public void setCobertura_maxima(double cobertura_maxima) {
        this.cobertura_maxima = cobertura_maxima;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
