/*
 * Proyecto QuienQuiereSerMillonario - Archivo QuienQuiereSerMillonario.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package quienquieresermillonario;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 29 nov. 2021 21:25:39
 */

public class QuienQuiereSerMillonario {

    public static int niveles = 12;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Mostramos la introducción del juego
        System.out.println("****Quién quiere ser millonario****");
        System.out.print("Introduce tu nombre: ");
        String nombre = in.nextLine();
        System.out.println("Bienvenid@ " + nombre);
        System.out.println("Pulsa intro para empezar");
        in.nextLine();

        int opcion;
        
        do {
            // Mostramos el menú y el usuario elije una opción
            opcion = MenúJuego.menu();

            switch (opcion) {
                case 1:
                    // Mostramos de que va el juego y los premios
                    MenúJuego.reglas();
                    break;
                case 2:
                    // Iniciamos el juego
                    System.out.println("");
                    Preguntas.generarBancoPreguntas(Preguntas.preguntas);
                    Preguntas.generarPreguntasPartida(Preguntas.preguntas, Preguntas.respuestaA, Preguntas.respuestaB, Preguntas.respuestaC, Preguntas.respuestaD);
                    System.out.println("¡¡Gracias por jugar!! Hasta la próxima " + nombre + " :) \n");
                    break;
            }
        } while (opcion != 2);
    }
}
