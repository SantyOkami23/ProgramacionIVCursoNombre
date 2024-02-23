package ciaf.prograIV.claseciclosycondicionales02;
import java.util.ArrayList;
/*Lista de Tareas:
Imagina que estás desarrollando una aplicación de lista de tareas y deseas mostrar las tareas pendientes*/
public class ListaDeTareas2 {
    public static void main(String[] args) {
        ArrayList<String> tareasPendientes = new ArrayList<>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Estudiar para el examen");
        tareasPendientes.add("Llamar al médico");

        System.out.println("Tareas pendientes:");
        for (String tarea : tareasPendientes) {
            System.out.println("- " + tarea);
        }
    }
}
