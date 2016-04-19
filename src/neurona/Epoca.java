package neurona;

/**
 *
 * @author jesusgtz
 */
public class Epoca {
    //Atributos
    public Pesos pe[];
    public Deltas de[];
    
    //Constructor por defecto
    public Epoca() {}
    
    /**
     * Funcion para revisar si dos epocas son iguales
     * @param ea
     * @return 
     */
    public boolean equalsTo(Epoca ea) {
        boolean flag = true;
        for(int i=0; i<this.pe.length; i++) {
            if(this.pe[i].isT() != ea.pe[i].isT() || 
               this.pe[i].isY() != ea.pe[i].isY())
                    flag = false;
        }
        return flag;
    }
}
