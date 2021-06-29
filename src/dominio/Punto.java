
package dominio;


public class Punto {
    //Declaro  variable
    private int x =0;
    private int y =0;
    private int q;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getJ() {
        return q;
    }

    public void setJ(int q) {
        this.q = q;
    }

    @Override
    public String toString() {
        return "Las coordenadas es: " + "x= " + x + "; y= " + y + "\n La distancia es: " + q;
    }
   
    
    
    
}