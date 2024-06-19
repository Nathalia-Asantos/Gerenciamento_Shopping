public class Vestuario extends Loja{
    //Atributos
    private boolean produtosImportados;

    //Sobrescrita do método de incialização
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,boolean produtosImportados , int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }

    //get e set
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //Sobrescrita método toString
    @Override
    public String toString() {
        return super.toString() + "Loja Vestuário\n" +
        "Trabalha com Produtos Importados: " + produtosImportados + "\n";
    }
}

