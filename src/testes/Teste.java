package testes;
import assento.ControleDePoltronas;
import assento.Mapa;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ControleDePoltronas assentos = new ControleDePoltronas();
        Mapa mapaDeCadeiras = new Mapa(assentos);
        String linha;
        int coluna;

        Scanner leitura = new Scanner(System.in);

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
        mapaDeCadeiras.mostrarMapa(assentos);
        System.out.print("Informe a linha que você deseja: ");
        linha = leitura.next();
        System.out.printf("%nInforme a coluna que você deseja :");
        coluna = leitura.nextInt();
        System.out.println(assentos.cadastrarReserva(linha,coluna));
        mapaDeCadeiras.mostrarMapa(assentos);

        System.out.print("Informe a linha do assento que você quer cancelar: ");
        linha = leitura.next();
        System.out.printf("%nInforme a coluna do assento que você quer cancelar:");
        coluna = leitura.nextInt();
        System.out.println(assentos.cancelarReserva(linha,coluna));
        mapaDeCadeiras.mostrarMapa(assentos);


    }
}
