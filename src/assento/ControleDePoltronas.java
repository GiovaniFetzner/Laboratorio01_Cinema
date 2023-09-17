package assento;

public class ControleDePoltronas {

    String[][] assentos = new String[12][14];
    final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String ERRO = "E R R O !! %nInforme valores válidos, entre A e " +
            "L para linhas e 1 e 14 para colunas %n";
    final int QUANTIDADE_TOTAL_POLTRONAS= 168;
    int quantidadeDeReservas = 0;
    int quantidadeDePoltronasLivres = QUANTIDADE_TOTAL_POLTRONAS - quantidadeDeReservas;

    public ControleDePoltronas() {

}

    public int getQuantidadeDeReservas() {
        quantidadeDeReservas = 0;
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                // Verifique se o elemento atual é nulo
                if (assentos[i][j].equals("X ")) {
                    quantidadeDeReservas++;
                }
            }
        }
        //quantidadeDePoltronasLivre = QUANTIDADE_TOTAL_POLTRONAS - quantidadeDeReservas;
        
        return quantidadeDeReservas;
    }

    public String cadastrarReserva(String linha, int coluna){
        String linhaUpperCase = linha.toUpperCase();
        coluna -= 1;

        if(confereEntradaDeDados(coluna, linhaUpperCase)){
            assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = "X ";
            return "Reservado";
        } else {
            return ERRO;
        }
    }

    public String cancelarReserva(String linha, int coluna){
        String linhaUpperCase = linha.toUpperCase();
        coluna-=1;

        if(confereEntradaDeDados(coluna, linhaUpperCase)){
            assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = Integer.toString(coluna + 1);
            return "Reserva cancelada";
        } else{
            return ERRO;
        }

    }

    private boolean confereEntradaDeDados(int coluna, String linhaUpperCase) {
        if (!(ALFABETO.indexOf(linhaUpperCase.charAt(0)) < 12) && (coluna < assentos[0].length)){
            /*return "E R R O !! %nInforme valores válidos, entre A e " +
                    "L para linhas e 1 e 14 para colunas %n";*/
            return false;
        } else  {
            //assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = "X ";
            //return "Reservado";
            return true;
        }
    }

    public int getLengthLinha(){
        return assentos.length;
    }

    public int getLengthColuna(){
        return assentos[0].length;
    }

    public String[][] getAssentos(){
        return assentos;
    }

    public char getCharAtAlfabeto(int index){
        return ALFABETO.charAt(index);
    }

    public int getQUANTIDADE_TOTAL_POLTRONAS() {
        return QUANTIDADE_TOTAL_POLTRONAS;
    }

    public void setQuantidadeDeReservas(int quantidadeDeReservas) {
        this.quantidadeDeReservas = quantidadeDeReservas;
    }

    public int getQuantidadeDePoltronasLivres() {
        return quantidadeDePoltronasLivres = QUANTIDADE_TOTAL_POLTRONAS -quantidadeDeReservas;
    }

    public void setQuantidadeDePoltronasLivres(int quantidadeDePoltronasLivres) {
        this.quantidadeDePoltronasLivres = quantidadeDePoltronasLivres;
    }
}