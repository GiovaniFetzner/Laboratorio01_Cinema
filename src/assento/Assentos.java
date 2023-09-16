package assento;

public class Assentos {

    String[][] assentos = new String[12][14];
    final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String ERRO = "E R R O !! %nInforme valores válidos, entre A e " +
            "L para linhas e 1 e 14 para colunas %n";

    public String cadastrarReserva(String linha, int coluna){
        String linhaUpperCase = linha.toUpperCase();
        int poltrona = coluna-1;

        if(confereEntradaDeDados(coluna, linhaUpperCase)){
            return "Reservado";
        } else {
            return ERRO;
        }
    }

    public String cancelarReserva(String linha, int coluna){
        String linhaUpperCase = linha.toUpperCase();
        int poltrona = coluna-1;

        if(confereEntradaDeDados(coluna, linhaUpperCase)){
            return null;
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
            assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = "Reservado";
            //return "Reservado";
            return true;
        }
    }

}
