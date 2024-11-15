package project.geometry;

public class Paralelepipedo {
    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo(double comprimento, double largura, double altura){
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculoDeVolume(){
        double volume = comprimento*altura*largura;
        
        return volume;
    }
}