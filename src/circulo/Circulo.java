package circulo;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double Perimetro(){
        return 2*Math.PI*radio;
    }
    
    public double Area(){
        return (Math.PI*(Math.pow(radio, 2)));
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
