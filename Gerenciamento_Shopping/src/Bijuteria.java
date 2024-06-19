public class Bijuteria extends Loja{
    //Atributos
    private double metaVendas;

    //Sobrescrita do método de incialização
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao , double metaVendas, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas= metaVendas;
    }

    //get e set
    public double getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //Sobrescrita método toString
    @Override
    public String toString() {
        return super.toString() + "Loja Bijuteria\n" +
        "Meta de Vendas: " + metaVendas + "\n";
    }
}
