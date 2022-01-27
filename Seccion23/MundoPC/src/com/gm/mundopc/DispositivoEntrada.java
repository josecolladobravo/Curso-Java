package com.gm.mundopc;

public class DispositivoEntrada {

    protected String tipoEntrda;
    protected String marca;
    
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrda=tipoEntrada;
        this.marca=marca;
    }

    public String getTipoEntrda() {
        return tipoEntrda;
    }

    public void setTipoEntrda(String tipoEntrda) {
        this.tipoEntrda = tipoEntrda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrda=" + tipoEntrda + ", marca=" + marca + '}';
    }
    
     
    
}
