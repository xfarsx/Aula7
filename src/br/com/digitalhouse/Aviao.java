package br.com.digitalhouse;

public class Aviao implements Voador {

    private String tipoDeAsa;
    private int qtdAssentos;

    public Aviao(){}//Convenção boas práticas ter um construtor vazio.

    public Aviao (int qtd, String tda){//Construtor
        qtdAssentos = qtd;
        tipoDeAsa = tda;
    }

    public int getQtdAssentos(){//get pega o parâmetro e retorna o resultado
    return qtdAssentos;}

    public void setQtdAssentos (int qtd){//recebe o parâmetro e passa o resultado para um novo
        qtdAssentos = qtd;}

    public String getTipoDeAsa(){
        return tipoDeAsa;}

    public void setTipoDeAsa (String tda){
        tipoDeAsa = tda;}

    @Override
    public void voar() {
        System.out.println("Voando como uma aviao...");//coloque um retorno

    }
}



