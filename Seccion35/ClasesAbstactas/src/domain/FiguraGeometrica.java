package domain;

public abstract class FiguraGeometrica { //asi se define una clase padre abstracta debido a que al menos tiene un metodo abstracto.
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    
    public abstract void dibujar();//los metodos abstractos no llevan implementacion ya que no sabemos que van a hacer y no se abren llaves, solo se cierra con ;

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    
    
    
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
