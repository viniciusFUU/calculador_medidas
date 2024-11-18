package project.geometry;

public class ParalelepipedoController {
    public double calculoDeVolume(double comprimento, double largura, double altura){
        Paralelepipedo ppd = new Paralelepipedo(comprimento, largura, altura);

        double volume = ppd.calculoDeVolume();

        return volume;
    }

    public String valorDoTrabalho(double precoMetroQuadrado, double comprimento, double largura, double altura){
        double metroQuadrado = calculoDeVolume(comprimento, largura, altura);
        double valorServico = metroQuadrado * precoMetroQuadrado;
        String valorFormatado = String.format("%.2f", valorServico);

        return valorFormatado;
    }

    public static void main(String[] args) {
        ParalelepipedoController ppd = new ParalelepipedoController();

        double valor = ppd.calculoDeVolume(2.5, 3.22, 2.81);
        System.out.println("Metro quadrado da área: " + valor);
        String valorServico = ppd.valorDoTrabalho(50, 2.5, 3.22, 2.81);
        System.out.println("Valor do serviço: " + valorServico);
    }
}
