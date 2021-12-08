/*
 * Proyecto QuienQuiereSerMillonario - Archivo Preguntas.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package quienquieresermillonario;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 30 nov. 2021 23:45:31
 */

public class Comodín {

    // Preguntamos si va a usar el comodín o no
    public static void usarComodin(boolean comodin, int nivel, int letra) {

        String resp;

        if (comodin == false) {
            System.out.println("¿Quieres usar el comodín? (s/n)");
            do {
                resp = Preguntas.pedirRespuesta();
                // Comprobamos si ha introducido el carácter correcto
                if (resp.equalsIgnoreCase("s") == false && resp.equalsIgnoreCase("n") == false) {
                    System.out.println("Valor introducido incorrecto.");
                    System.out.print("Vuelve a intentarlo: ");
                }
            } while (resp.equalsIgnoreCase("s") == false && resp.equalsIgnoreCase("n") == false);

            // Si lo quiere usar ejecutamos la función de comodín
            if (resp.equalsIgnoreCase("s")) {
                comodin(nivel, letra);
                Preguntas.comodin = true;
            }
        }
    }

    // En esta función mostramos simplemente dos opciones de la pregunta en la que una es la correcta
    public static void comodin(int nivel, int letra) {

        // Si la correcta es la a, mostramos la a y la c
        if (Preguntas.respuestaA[nivel][letra].startsWith(Preguntas.correcta[nivel][letra]) == true) {
            System.out.println(Preguntas.preguntas[nivel][letra]);
            System.out.println(Preguntas.respuestaA[nivel][letra] + "\t" + Preguntas.respuestaC[nivel][letra]);
        }
        // Si la correcta es la b, mostramos la b y la d
        else if (Preguntas.respuestaB[nivel][letra].startsWith(Preguntas.correcta[nivel][letra]) == true) {
            System.out.println(Preguntas.preguntas[nivel][letra]);
            System.out.println(Preguntas.respuestaB[nivel][letra] + "\t" + Preguntas.respuestaD[nivel][letra]);
        } 
        // Si la correcta es la b, mostramos la b y la c
        else if (Preguntas.respuestaC[nivel][letra].startsWith(Preguntas.correcta[nivel][letra]) == true) {
            System.out.println(Preguntas.preguntas[nivel][letra]);
            System.out.println(Preguntas.respuestaB[nivel][letra] + "\t" + Preguntas.respuestaC[nivel][letra]);
        }
        // Si la correcta es la d, mostramos la c y la d
        else if (Preguntas.respuestaD[nivel][letra].startsWith(Preguntas.correcta[nivel][letra]) == true) {
            System.out.println(Preguntas.preguntas[nivel][letra]);
            System.out.println(Preguntas.respuestaC[nivel][letra] + "\t" + Preguntas.respuestaD[nivel][letra]);
        }
    }
}
