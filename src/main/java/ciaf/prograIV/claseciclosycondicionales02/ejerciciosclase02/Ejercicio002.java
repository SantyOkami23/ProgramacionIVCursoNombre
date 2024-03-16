package ciaf.prograIV.claseciclosycondicionales02.ejerciciosclase02;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio002 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*******************************");
        System.out.println("*   !Bienvenido al juego de   *");
        System.out.println("*    Piedra, Papel o Tijera   *");
        System.out.println("*******************************");
        int repetir;
        do {
            System.out.println(" ");
            System.out.println("*******************");
            System.out.println("* Elige tu jugada *");
            System.out.println("* 1. Piedra       *");
            System.out.println("* 2. Papel        *");
            System.out.println("* 3. Tijera       *");
            System.out.println("*******************");
            System.out.print("---> ");
            int op = sc.nextInt();
            int eleccionCOM = random.nextInt(4);
            String eleccionCOMT = "";
            String opT = "";
            if (eleccionCOM == 0 ){
                eleccionCOM =+ 1;
            }
            if (eleccionCOM == 4){
                eleccionCOM =- 1;
            }
            switch (op){
                case 1:
                    opT = "Piedra";
                    break;
                case 2:
                    opT = "Papel";
                    break;
                case 3:
                    opT ="Tijera";
            }
            switch (eleccionCOM){
                case 1:
                    eleccionCOMT = "Piedra";
                    break;
                case 2:
                    eleccionCOMT = "Papel";
                    break;
                case 3:
                    eleccionCOMT ="Tijera";
                    break;
            }

            System.out.println(eleccionCOM);


            System.out.println("*******************************");
            System.out.println("* Tu eleccion: " + opT +  "        *");
            System.out.println("*                             *");
            System.out.println("* Eleccion de la PC: " + eleccionCOMT + "    *");
            System.out.println("*                             *");
            if (op == 1 & eleccionCOM == 2 | op == 2 & eleccionCOM == 1 | op == 3 & eleccionCOM == 2) {
                System.out.println("* Ganaste                    *");
            }
            if (op == 1 & eleccionCOM == 3 | op == 2 & eleccionCOM == 3 | op == 3 & eleccionCOM == 1) {
                System.out.println("* Perdiste                   *");
            }
            if (eleccionCOM == op) {
                System.out.println("* Empate *");
            }
            System.out.println("*********************************\n");

            System.out.println("* Deseas seguir jugando *");
            System.out.println("* 1. Si                 *");
            System.out.println("* 2. No                 *");
            System.out.print("---> ");
            repetir = sc.nextInt();

        } while (repetir != 2);
    }
}
