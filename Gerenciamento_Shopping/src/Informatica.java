public class Informatica extends Loja{
    //Atributos
    private double seguroEletronicos;

    //Sobrescrita do método de incialização
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao , double seguroEletronicos, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //get e set
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    //Sobrescrita método toString
    @Override
    public String toString() {
        return super.toString() + "Loja Informatica\n" +
        "Seguro Eletrônico: " + seguroEletronicos + "\n";
    }
}
