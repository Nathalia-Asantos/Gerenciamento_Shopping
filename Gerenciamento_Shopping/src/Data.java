public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

         if ( mes < 1 || mes > 12 || ano < 1) {
            dataPadraoDeErro();
        } else if (dia < 1 || dia > 31) {
            dataPadraoDeErro();
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dataPadraoDeErro();
        } else if (mes == 2 && (dia > 29 || (dia == 29 && !verificaAnoBissexto()))) {
            dataPadraoDeErro();
        }
    }

    //getters
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    //setters
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

     //Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    //Método para verificação de ano bissexto
    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //Método para impressão de mensagem de erro e correção da data
    public void dataPadraoDeErro() {
        System.out.println("Data Inválida! A data será redefinida para 01/01/2000 como padrão.\n");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }


}
