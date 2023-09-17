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
        int escolha;
        boolean sair = true;

        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);

        System.out.println("Bem vindo ao cinema dos Guri!!!");

        while (sair) {

            System.out.println("\nFaça sua escolha:");
            System.out.println("1. Fazer Reserva\n2. Cancelar Reserva\n3. Analise de assentos\n4. Ver Mapa\n" +
                    "5. Sair da Operação");
            escolha = leitura2.nextInt();

            if (escolha == 1) {
                mapaDeCadeiras.mostrarMapa(assentos);
                System.out.print("Informe a linha que você deseja: ");
                linha = leitura.next();
                System.out.printf("%nInforme a coluna que você deseja :");
                coluna = leitura.nextInt();
                System.out.println(assentos.cadastrarReserva(linha, coluna));

            }

            else if (escolha == 2){
                mapaDeCadeiras.mostrarMapa(assentos);
                System.out.print("Informe a linha do assento que você quer cancelar: ");
                linha = leitura.next();
                System.out.printf("%nInforme a coluna do assento que você quer cancelar:");
                coluna = leitura.nextInt();
                System.out.println(assentos.cancelarReserva(linha, coluna));
            }

            else if (escolha == 3){
                System.out.print("Quantidade de total: ");
                System.out.println(assentos.getQUANTIDADE_TOTAL_POLTRONAS());
                System.out.print("Quantidade de reservas: ");
                System.out.println(assentos.getQuantidadeDeReservas());
                System.out.print("Quantidade de poltronas livres: ");
                System.out.println(assentos.getQuantidadeDePoltronasLivres());
            }

            else if (escolha == 4){
                mapaDeCadeiras.mostrarMapa(assentos);
            }

            else if (escolha == 5){
                System.out.println("Operação Finalizada");

                sair = false;
            }
            else {
                System.out.println("Nenhuma escolha valida\nTente novamente\n");
            }
        }

    }
}
