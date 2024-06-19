import java.util.Arrays;

public class Loja {
    //Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto [] estoqueProdutos;


    //Método para inicialização dos atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];

    }

    //Método construtor que recebe valores para iniciar
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método para imprimir as informações de todos os produtos
    public void imprimeProdutos() {
        if (estoqueProdutos == null || estoqueProdutos.length == 0) {
            System.out.println("Não existem produtos cadastrados na Loja!");
        } else {
            System.out.println("=== Produtos da Loja ===");
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto.toString());
                }
            }
        }
    }

    //Método para inserir produto no estoque
    public boolean insereProduto(Produto produto) {
        if (produto == null) {
        return false;  // Verifica se o produto é nulo
        }
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    //Método para remover produto do estoque
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null && produto.getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }


    //Método toString
    @Override
    public String toString() {
        return "======= Informações Loja =======\n" +
        "Nome:" + nome + "\n" +
        "Quantidade de Funcionários: " + quantidadeFuncionarios + "\n" +
        "Salario Base Funcionário: " + salarioBaseFuncionario + "\n" +
        endereco + "\n" +
        "Data de Fundação: " + dataFundacao + "\n" +
        "Estoque de produtos:" + Arrays.toString(estoqueProdutos) +
        "================================";
    }

    //Método que calcula valor gasto com salario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1){
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    //Método para medir tamanho da loja
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }

    }
}
