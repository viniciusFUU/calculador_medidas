package project.geometry;

public class ParalelepipedoController {
    public double calculoDeVolume(double comprimento, double largura, double altura){
        Paralelepipedo ppd = new Paralelepipedo(comprimento, largura, altura);

        double volume = ppd.calculoDeVolume();

        return volume;
    }

    public static void main(String[] args) {
        ParalelepipedoController ppd = new ParalelepipedoController();

        double valor = ppd.calculoDeVolume(2.5, 3.22, 2.81);
        System.out.println(valor);
    }
}
