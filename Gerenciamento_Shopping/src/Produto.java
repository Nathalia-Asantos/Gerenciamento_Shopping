import java.time.LocalDate;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    //Método para inicialização dos atributos
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public Data getDataValidade() {
        return dataValidade;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método que verifica a validade do produto
     public boolean estaVencido(Data dataValidade) {
        // Cria um objeto LocalDate com a data fixa 20/10/2023
        LocalDate dataVencimento = LocalDate.of(2023, 10, 20);

        if (dataValidade.getAno() < dataVencimento.getYear()) {
            return true;
        } else if (dataValidade.getAno() == dataVencimento.getYear()) {
            if (dataValidade.getMes() < dataVencimento.getMonthValue()) {
                return true;
            } else if(dataValidade.getMes() == dataVencimento.getMonthValue() && dataValidade.getDia() < dataVencimento.getDayOfMonth()) {
                return true;
            }
        }
        return false;
    }

    //Método toString
    @Override
    public String toString() {
        return "=== Informações Produto ===\n" +
        "Nome: " + nome + "\n" +
        "Preço: " + preco + "\n" +
        "Data de Validade: " + dataValidade + "\n";
    }

}
