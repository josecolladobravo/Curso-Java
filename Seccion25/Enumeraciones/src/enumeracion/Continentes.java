package enumeracion;

public enum Continentes {
    AFRICA(53), //pueden contener atributos habria que realizar el constructor para poder usarse. Tambien puede haber mas atributos que habría que pasar seguido de coma 
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises=paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
