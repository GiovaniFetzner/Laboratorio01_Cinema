package testes;
import assento.ControleDePoltronas;
import assento.Mapa;

public class Teste {
    public static void main(String[] args) {
        ControleDePoltronas assentos = new ControleDePoltronas();
        Mapa mapaDeCadeiras = new Mapa();

        /*String [][] provisorio = assentos.getAssentos();

        for (int i = 0; i < provisorio.length; i++) {
            System.out.print(assentos.getCharAtAlfabeto(i) + " ");
            for (int j = 0; j < provisorio[0].length; j++) {
                if (provisorio[i][j] != null) System.out.print(provisorio[i][j] + " ");
                else {
                    provisorio[i][j] = Integer.toString(j+1);
                    System.out.print(provisorio[i][j] + " ");
                }
            }
            System.out.println();
        }*/

        System.out.println("Teste classe mapa ");

        mapaDeCadeiras.mostrarMapa();

    }
}
