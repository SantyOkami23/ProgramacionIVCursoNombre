package ciaf.prograIV.clasesintaxis01;

public class CaracteresEspeciales03 {

    public static void main(String[] args) {

        // Caracter de tabulación (\t)
        System.out.println("Esto es una\t\ttabulación.");

        // Caracter de retroceso (backspace) (\b)
        System.out.println("Esto es un retroceso\b.");

        // Caracter de nueva línea (\n)
        System.out.println("Esto es una\nnueva línea.");

        /*
        se utiliza para mover el cursor de escritura al principio de
         la línea actual. Es decir, cuando se encuentra un carácter de
          retorno de carro en una cadena de texto, el cursor se coloca al
          principio de la misma línea, lo que permite sobrescribir el texto
          que ya ha sido escrito en esa línea.
         */
        // Caracter de retorno de carro (\r)
        System.out.println("Esto es un retorno de carro.\rXX");

        // Caracter de salto de línea (\f)
        System.out.println("Esto es un\f salto de línea.");

        // Caracter de comilla simple (')
        System.out.println("Esto es una comilla simple: \' ");

        // Caracter de comilla doble (")
        System.out.println("Esto es una comilla doble: \" ");
    }
}

