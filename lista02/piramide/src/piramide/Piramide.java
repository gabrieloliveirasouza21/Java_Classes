package piramide;

/**
 *
 * @author gabri
 */
public class Piramide {
    
    private float base = 0;
    private float altura = 0;

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }
    
    public double volume(){
        return ((1.0/3)*base*altura);
    }
    
}
