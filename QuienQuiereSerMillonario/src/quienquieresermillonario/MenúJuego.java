/*
 * Proyecto QuienQuiereSerMillonario - Archivo Preguntas.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package quienquieresermillonario;

import java.util.Scanner;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 29 nov. 2021 23:03:17
 */

public class MenúJuego {

    // Mostramos el menú del juego
    public static int menu() {

        System.out.println("1. Ver reglas\n2. Jugar");

        int opcion = pedirIntEnRango(1, 2);

        return opcion;
    }

    // Comprobamos que la opción que elije el usuario está destro del rango, si no, mostramos mensaje de aviso
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }

    // Mostramos las reglas del juego
    public static void reglas() {
        
        System.out.println("\nEl juego consiste en responder correctamente a 12 preguntas consecutivas, de creciente dificultad.\n"
                + "Cada vez que se contesta bien una pregunta se va acumulando una cantidad de dinero:\n"
                + "Nivel 1: 100€\nNivel 2: 500€\nNivel 3: 1.000€\nNivel 4: 1.500€\nNivel 5: 2.500€\nNivel 6: 5.000€\n"
                + "Nivel 7: 10.000€\nNivel 8: 20.000€\nNivel 9: 50.000€\nNivel 10: 100.000€\nNivel 11: 300.000€\nNivel 12: 1.000.000€\n"
                + "\nHay dos zonas seguras, es decir, dos niveles en los que si los pasas y luego fallas alguna pregunta, "
                + "te aseguras el dinero que contienen y no te vas con las manos vacias.\n"
                + "Esas dos zonas seguras són el nivel 4 y el nivel 8.\n"
                + "En el juego tienes un comodín 50:50, que puedes usar una vez, que te elimina la mitad de las opciones.\n");
    }
}
