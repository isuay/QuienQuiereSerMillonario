/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quienquieresermillonario;

import java.util.Scanner;

/**
 *
 * @author iriss
 */
public class MenúJuego {

    public static int menu() {

        System.out.println("1. Ver reglas\n2. Jugar\n3. Salir");

        int opcion = pedirIntEnRango(1, 3);

        return opcion;
    }

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

    public static void reglas() {
        
        System.out.println("\nEl juego consiste en responder coorectamente a 12 preguntas consecutivas, de creciente dificultad.\n"
                + "Cada vez que se contesta bien una pregunta se va acumulando una cantidad de dinero:\n"
                + "Nivel 1: 100€\nNivel 2: 500€\nNivel 3: 1.000€\nNivel 4: 1.500€\nNivel 5: 2.500€\nNivel 6: 5.000€\n"
                + "Nivel 7: 10.000€\nNivel 8: 20.000€\nNivel 9: 50.000€\nNivel 10: 100.000€\nNivel 11: 300.000€\nNivel 12: 1.000.000€\n"
                + "\nHay dos zonas seguras, es decir, dos niveles en los que si los pasas y luego fallas alguna pregunta después,\n"
                + "te aseguras el dinero que contienen y no te vas con las manos vacias.\n"
                + "Esas dos zonas seguras són el nivel 4 y el nivel 8.\n");
    }

}
