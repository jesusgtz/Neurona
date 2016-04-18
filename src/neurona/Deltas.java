package neurona;

/**
 *
 * @author jesusgtz
 */
public class Deltas {
    
    //Atributos
    private double ftmy;
    private double dw1;
    private double dw2;
    private double dO;
    private double alpha;
    private Pesos p;
    
    
    /**
     * Constructor
     * @param p
     * @param dw1
     * @param dw2
     * @param dO 
     */
    public Deltas(Pesos p, double alpha) {
        this.p = p;
        this.ftmy = alpha * calcTmy();
        this.dw1 = p.isX1() == true ? ftmy : 0;
        this.dw2 = p.isX2() == true ? ftmy : 0;
        this.dO = ftmy * -1;
    }
    
    public double calcTmy() {
        if(!p.isT() && p.isY()) {
            return -1;
        } else if(p.isT() && !p.isY()) {
            return 1;
        } else return 0;
    }
    
    /**
     * Getters and Setters 
     */
    
    public double getFtmy() {
        return ftmy;
    }

    public void setFtmy(double ftmy) {
        this.ftmy = ftmy;
    }

    public double getDw1() {
        return dw1;
    }

    public void setDw1(double dw1) {
        this.dw1 = dw1;
    }

    public double getDw2() {
        return dw2;
    }

    public void setDw2(double dw2) {
        this.dw2 = dw2;
    }

    public double getdO() {
        return dO;
    }

    public void setdO(double dO) {
        this.dO = dO;
    }

    public Pesos getP() {
        return p;
    }

    public void setP(Pesos p) {
        this.p = p;
    }   
}
