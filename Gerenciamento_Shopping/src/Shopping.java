public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int quantidadeMaxLojas;

    //Método para inicialização dos atributos
    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaxLojas];
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    //Método para receber loja
    public boolean insereLoja(Loja loja){
        if (loja == null) {
            return false;
        }
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    //Método para remover loja
    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            Loja loja = lojas[i];
            if(loja != null && loja.getNome().equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //Método que verifica a quantidade de loja do tipo informado
    public int quantidadeLojasPorTipo(String tipo){
        int quantidade = 0;
        if(tipo.equalsIgnoreCase("Cosmético")){
            for (Loja loja : lojas) {
                if (loja instanceof Cosmetico) {
                    quantidade++;
                }
            }
        } else if (tipo.equalsIgnoreCase("Vestuário")) {
            for (Loja loja : lojas) {
                if (loja instanceof Vestuario) {
                    quantidade++;
                }
            }
        } else if (tipo.equalsIgnoreCase("Bijuteria")) {
            for (Loja loja : lojas) {
                if (loja instanceof Bijuteria) {
                    quantidade++;
                }
            }
        } else if (tipo.equalsIgnoreCase("Alimentação")) {
            for (Loja loja : lojas) {
                if (loja instanceof Alimentacao) {
                    quantidade++;
                }
            }
        } else if (tipo.equalsIgnoreCase("Informática")) {
            for (Loja loja : lojas) {
                if (loja instanceof Informatica) {
                    quantidade++;
                }
            }
        } else {
            return -1;
        }
        return quantidade;
    }

    // Método para encontrar a loja de informática com o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaMaisCara == null || lojaInformatica.getSeguroEletronicos() > lojaMaisCara.getSeguroEletronicos()) {
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }
}
