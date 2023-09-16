package assento;

public class ControleDePoltronas {

    String[][] assentos = new String[12][14];
    final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String ERRO = "E R R O !! %nInforme valores válidos, entre A e " +
            "L para linhas e 1 e 14 para colunas %n";

    public ControleDePoltronas() {

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
            assentos[ALFABETO.indexOf(linhaUpperCase.charAt(0))][coluna] = null;
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


}