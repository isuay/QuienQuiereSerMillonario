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

        // Vectores de las preguntas y respuestas del juego
        String[] preguntas = new String[niveles];
        String[] respuestasA = new String[niveles];
        String[] respuestasB = new String[niveles];
        String[] respuestasC = new String[niveles];
        String[] respuestasD = new String[niveles];

        
        System.out.println("****Quién quiere ser millonario****");
        System.out.print("Introduce tu nombre: ");
        String nombre = in.nextLine();
        System.out.println("Bienvenid@ " + nombre);
        System.out.println("Pulsa intro para empezar");
        in.nextLine();
        
        Preguntas.generarBancoPreguntas(Preguntas.preguntas);
        Preguntas.generarPreguntasPartida(Preguntas.preguntas, Preguntas.respuestaA, Preguntas.respuestaB, Preguntas.respuestaC, Preguntas.respuestaD);
        //Preguntas.generarRespuestasPartida(Preguntas.respuestaA, Preguntas.respuestaB, Preguntas.respuestaC, Preguntas.respuestaD);
        //Preguntas.comprobarRespuesta();
        
        /*for (int i = 0; i < niveles; i++) {
            preguntas[i] = 
        }*/
        
        // Generar las preguntas
        //Preguntas.generarBancoPreguntas();
        //Preguntas.generarPreguntasPartida(preguntas, respuestasA, respuestasB, respuestasC, respuestasD);
        
        // MOSTRAR PREGUNTAS COMO PRUEBA, PARA VER SI FUNCIONA
        //Preguntas.generarPreguntasPartida(preguntas, respuestasA, respuestasB, respuestasC, respuestasD);
        
        // Recorrer todas los niveles 1 - 12. Para cada nivel ->
        
            // Preguntar al usuario
            // Usuario responde
            // Comprobar si es correcta (aumenta cantidad de dinero) o no (pierde)
            
            // Comprobar si ha ganado o no
        
    }
    
    
    
}
