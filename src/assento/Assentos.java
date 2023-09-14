package assento;

public class Assentos {

    String[][] assentos = new String[12][14];
    final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String cadastrarReserva(String linha, int coluna){
        String linhaUpperCase = linha.toUpperCase();
        int poltrona = coluna-1;

        if (!(ALFABETO.indexOf(linhaUpperCase.charAt(0)) < 12) && (coluna < assentos[0].length)){
            return "E R R O !! %nInforme valores válidos, entre A e " +
                    "L para linhas e 1 e 14 para colunas %n";
        } else  {
            assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = "Reservado";
            return "Reservado";
        }

    }

}
