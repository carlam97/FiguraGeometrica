public class Quadrado implements FiguraGeometrica{

    private double lado;

    public void setLado(double lado){
        this.lado=lado;
    } public double getLado(){
        return this.lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";

    }

    @Override
    public double getArea() {
        return this.lado*this.lado;
        //return lado*lado; 
    }

    @Override
    public double getPerimetro() {
        return this.lado*4;
        //return this.lado + this.lado + this.lado + this.lado
    }

    
    
}
