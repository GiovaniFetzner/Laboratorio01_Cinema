package testes;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[][] assentos = new String[12][14];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String linha;
        String linhaUpperCase;
        int coluna;

        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe a linha que você deseja: ");
        linha = leitura.next();
        linhaUpperCase = linha.toUpperCase();
        System.out.printf("%nInforme a coluna que você deseja :");
        coluna = leitura.nextInt()-1;

        /*
        * Verifica se a linha desejada está entre A e L, se sim
        passa a letra do afabeto para a primeira posição da String
        * */

        if ((alfabeto.indexOf(linhaUpperCase.charAt(0)) < 12) && (coluna < assentos[0].length)) {
            //assentos[alfabeto.indexOf(linha.charAt(0))] = new String[]{"alfabeto.charAt(0)"};
            assentos[alfabeto.indexOf(linhaUpperCase.charAt(0))][coluna] = "X";

        } else {
            //Aqui pode entrar um erro de exception
            System.out.printf("E R R O !! %nInforme valores válidos, entre A e " +
                    "L para linhas e 1 e 14 para colunas %n");
            System.out.println();
        }

        /*
         * Mostra mapa de assentos
         * */

        for (int i = 0; i < assentos.length; i++) {
            System.out.print(alfabeto.charAt(i) + " ");
            for (int j = 0; j < assentos[0].length; j++) {
                if (assentos[i][j] != null) System.out.print(assentos[i][j] + " ");
                else {
                    assentos[i][j] = Integer.toString(j+1);
                        System.out.print(assentos[i][j] + " ");
                }
            }
            System.out.println();
        }
        /*
        * Cancela uma reserva de assento
        * */

        System.out.print("Informe a linha do assento que você quer cancelar: ");
        linha = leitura.next();
        linhaUpperCase = linha.toUpperCase();
        System.out.printf("%nInforme a coluna do assento que você quer cancelar:");
        coluna = leitura.nextInt()-1;

        if ((alfabeto.indexOf(linhaUpperCase.charAt(0)) < 12) && (coluna < assentos[0].length)) {
            //assentos[alfabeto.indexOf(linha.charAt(0))] = new String[]{"alfabeto.charAt(0)"};
            assentos[alfabeto.indexOf(linhaUpperCase.charAt(0))][coluna] = null;

        } else {
            //Aqui pode entrar um erro de exception
            System.out.printf("E R R O !! %nInforme valores válidos, entre A e " +
                    "L para linhas e 1 e 14 para colunas%n");
            System.out.println();
        }

        /*
         * Mostra mapa de assentos
         * */
        System.out.println();

        for (int i = 0; i < assentos.length; i++) {
            System.out.print(alfabeto.charAt(i) + " ");
            for (int j = 0; j < assentos[0].length; j++) {
                if (assentos[i][j] != null) System.out.print(assentos[i][j] + " ");
                else {
                    assentos[i][j] = Integer.toString(j+1);
                    System.out.print(assentos[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}