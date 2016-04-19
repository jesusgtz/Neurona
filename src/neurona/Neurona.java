package neurona;

/**
 *
 * @author jesusgtz
 */
public class Neurona {
    
    public boolean xs1[] = {true, true, false, false};
    public boolean xs2[] = {true, false, true, false};
    public boolean ts[] = {true, false, false, false};
    public Epoca ac;
    public Epoca at;
    
    public void aprender() {
        ac = new Epoca();
        
        Pesos auxP;
        Deltas auxD = new Deltas();
        
        auxP = new Pesos(0, 0.4, 0.3, xs1[0], xs2[0], ts[0]);
        if(auxP.isT() != auxP.isY())
            auxD = new Deltas(auxP, .25);
        
        ac.pe[0] = auxP;
        ac.de[0] = auxD;
        
        for(int i=1; i<4; i++) {
            auxP = new Pesos(ac.pe[i].getW1() + ac.de[i].getDw1(),
                ac.pe[i].getW2() + ac.de[i].getDw2(), 
                ac.pe[i].getO() + ac.de[i].getdO(),
                xs1[i], xs2[i], ts[i]);
            if(auxP.isT() != auxP.isY())
                auxD = new Deltas(auxP, .25);
            ac.pe[i] = auxP;
            ac.de[i] = auxD;
        }
        
        at = ac;
        
        while(!at.equalsTo(ac)) {
            auxP = new Pesos(0, 0.4, 0.3, xs1[0], xs2[0], ts[0]);
        if(auxP.isT() != auxP.isY())
            auxD = new Deltas(auxP, .25);
        
        ac.pe[0] = auxP;
        ac.de[0] = auxD;
        
        for(int i=1; i<4; i++) {
            auxP = new Pesos(ac.pe[i].getW1() + ac.de[i].getDw1(),
                ac.pe[i].getW2() + ac.de[i].getDw2(), 
                ac.pe[i].getO() + ac.de[i].getdO(),
                xs1[i], xs2[i], ts[i]);
            if(auxP.isT() != auxP.isY())
                auxD = new Deltas(auxP, .25);
            ac.pe[i] = auxP;
            ac.de[i] = auxD;
        }
        
        at = ac;
        }
        
    }
    
    public static void main(String[] args) {
        Neurona obj = new Neurona();
        obj.aprender();
    }
}
