package assento;

public class Mapa {
    ControleDePoltronas assentos = new ControleDePoltronas();

   /* * Atributo abaixo servirá para manter somente o vetor de String,
    * eliminando outros atributos da classe ControleDePoltronas
    */
    String [][] provisorio = assentos.getAssentos();

    public Mapa(ControleDePoltronas assentos) {
        this.assentos = assentos;
    }

    public void mostrarMapa(ControleDePoltronas assentos){
        System.out.println("Mapa das poltronas da sala: ");
        // Busca o estado atual dos assentos
        provisorio = assentos.getAssentos();

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
        }

    }
}
