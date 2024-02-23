package ciaf.prograIV.clasesintaxis01;


public class EjemploCiclosBasico09 {

    public static void main(String[] args) {
        // Ciclo for para contar ascendente del 1 al 5
        System.out.println("Conteo ascendente:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ciclo while para contar descendente del 5 al 1
        System.out.println("Conteo descendente:");
        int j = 5;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        // Ciclo do-while para contar ascendente del 1 al 5
        System.out.println("Conteo ascendente con do-while:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
        System.out.println();
    }
}
