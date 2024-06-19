public class Alimentacao extends Loja {
    //Atributos
    private Data dataAlvara;

    //Sobrescrita do método de incialização
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao , Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    //get e set
    public Data getDataAlvara() {
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //Sobrescrita método toString
    @Override
    public String toString() {
        return super.toString() + "Loja Alimentação\n" +
        "Data de Alvara: " + dataAlvara + "\n";
    }
}
