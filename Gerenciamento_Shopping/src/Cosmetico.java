public class Cosmetico extends Loja {
    //Atributos
    private double taxaComercializacao;

    //Sobrescrita do método de incialização
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao , double taxaComercializacao, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //get e set
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    //Sobrescrita método toString
    @Override
    public String toString() {
        return super.toString() + "Loja Cosmético\n" +
        "Taxa de Comercialização: " + taxaComercializacao + "\n";
    }
}
