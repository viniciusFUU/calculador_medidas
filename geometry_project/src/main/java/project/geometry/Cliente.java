package project.geometry;

public class Cliente {
    String nome;
    String cidade;
    String bairro;
    String rua;
    int numero;

    public Cliente(String nome, String cidade, String bairro, String rua, int numero){
        this.nome = nome;
        this.cidade = cidade;
        this.bairro= bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
