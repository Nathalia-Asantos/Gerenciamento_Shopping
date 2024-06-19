import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int menu = 0;
        Loja loja = null;
        Produto produto = null;;

        Scanner scMenu = new Scanner(System.in);
        while (menu != 3) {
            System.out.println("======= Menu =======");
            System.out.println("(1) Criar Loja");
            System.out.println("(2) Criar Produto");
            System.out.println("(3) Sair");
            System.out.println("====================");
            menu = scMenu.nextInt();
            scMenu.nextLine(); // Limpa o buffer do scanner

            switch (menu) {
                case 1:
                    loja = novaLoja();
                    System.out.println("Loja " + loja.getNome() + " criada com sucesso!");
                    System.out.println(loja.toString());
                    break;
                case 2:
                    produto = novaProduto();
                    System.out.println("Produto " + produto.getNome() + " foi criada com sucesso!");
                    System.out.println(produto.toString());
                    if (produto.estaVencido(produto.getDataValidade())){
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    System.out.println("===========================");
                    break;
                case 3:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }
        scMenu.close();
    }

    public static Loja novaLoja(){
        Scanner scLoja = new Scanner(System.in);
        System.out.println("=== Informações da Loja ===");
        System.out.println("Digite o nome do loja: ");
        String nome = scLoja.nextLine();
        System.out.println("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scLoja.nextInt();
        System.out.println("Digite o sálario base dos funcionários: ");
        double salarioBaseFuncionario = scLoja.nextDouble();
        System.out.println("Digite a quantidade de produtos da loja:");
        int quantidadeProdutos = scLoja.nextInt();
        Data dataFundacao = novaData("Digite a data de fundação da sua loja: ");
        Endereco endereco = novoEndereco("=== Informações de Endereço ===");

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
    }

    public static Produto novaProduto(){
        Scanner scProduto = new Scanner(System.in);
        System.out.println("=== Informações do Produto ===");
        System.out.println("Digite o nome do produto: ");
        String nome = scProduto.nextLine();
        System.out.println("Digite o valor do produto:");
        double valorProduto = scProduto.nextDouble();
        Data dataValidade = novaData("Digite a data de validade do produto:");
        return new Produto(nome, valorProduto, dataValidade);
    }

    private static Data novaData(String data){
        Scanner scData = new Scanner(System.in);
        System.out.println("=== Informações de Data ===");
        System.out.println("Digite o dia:");
        int dia = scData.nextInt();
        System.out.println("Digite o mês:");
        int mes = scData.nextInt();
        System.out.println("Digite o ano:");
        int ano = scData.nextInt();
        return new Data(dia, mes, ano);
    }
    private static Endereco novoEndereco(String descricao){
        Scanner scEndereco = new Scanner(System.in);
        System.out.println("=== Informações de Endereço ===");
        System.out.println("CEP:");
        String cep = scEndereco.nextLine();
        System.out.println("Número:");
        String numero = scEndereco.nextLine();
        System.out.println("Rua:");
        String nomeDaRua = scEndereco.nextLine();
        System.out.println("Cidade:");
        String cidade = scEndereco.nextLine();
        System.out.println("Estado:");
        String estado = scEndereco.nextLine();
        System.out.println("País:");
        String pais = scEndereco.nextLine();
        System.out.println("Complemento:");
        String complemento = scEndereco.nextLine();
        return new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
    }
}
