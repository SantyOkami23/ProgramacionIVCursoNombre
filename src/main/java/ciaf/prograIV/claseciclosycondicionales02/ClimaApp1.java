package ciaf.prograIV.claseciclosycondicionales02;
import java.util.Scanner;
/*Supongamos que estás desarrollando una aplicación de clima que proporciona recomendaciones según la temperatura actual.*/
public class ClimaApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        int temperatura = scanner.nextInt();

        if (temperatura > 25) {
            System.out.println("Hace calor. Te recomendamos usar ropa ligera y beber agua.");
        } else if (temperatura >= 10) {
            System.out.println("El clima es agradable. Un suéter ligero podría ser útil.");
        } else {
            System.out.println("Hace frío. Te recomendamos llevar un abrigo y una bufanda.");
        }
    }
}
