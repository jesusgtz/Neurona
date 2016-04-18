package neurona;

/**
 *
 * @author jesusgtz
 */
public class Pesos {
    
    //Atributos
    private double w1;
    private double w2;
    private double O;
    private boolean x1;
    private boolean x2;
    private double a;
    private boolean y;
    private boolean t;
    
    //Constructor por defecto de la clase
    public Pesos(){}
    
    /**
     * Constructor
     * @param w1
     * @param w2
     * @param O
     * @param x1
     * @param x2
     * @param t 
     */
    public Pesos(double w1, double w2, double O, boolean x1, boolean x2, 
            boolean t) {
        this.w1 = w1;
        this.w2 = w2;
        this.O = O;
        this.x1 = x1;
        this.x2 = x2;
        this.a = calcA();
        this.y = calcY();
        this.t = t;
    }
    
    /**
     * Funcion para calcular el valor a
     * @return a
     */
    public double calcA() {
        if(x1 && x2) {
            return w1*w2;
        } else if(x1 && !x2) {
            return w1;
        } else if(!x1 && x2) {
            return w2;
        } else return 0;
    }
    
    /**
     * Funcion para calcular Y
     * @return y
     */
    public boolean calcY() {
        if(a > O)
            return true;
        else return false;
    }
    
    
    /**
     * Getters y Setters
     */
    
    public double getW1() {
        return w1;
    }

    public void setW1(double w1) {
        this.w1 = w1;
    }

    public double getW2() {
        return w2;
    }

    public void setW2(double w2) {
        this.w2 = w2;
    }

    public double getO() {
        return O;
    }

    public void setO(double O) {
        this.O = O;
    }

    public boolean isX1() {
        return x1;
    }

    public void setX1(boolean x1) {
        this.x1 = x1;
    }

    public boolean isX2() {
        return x2;
    }

    public void setX2(boolean x2) {
        this.x2 = x2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public boolean isY() {
        return y;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }
}
